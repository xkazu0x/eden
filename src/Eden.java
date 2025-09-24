import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

class ProgramVisitor extends EdenBaseVisitor<String> {
    StringBuilder string_builder;
    Map<String, String> var_table;

    public 
    ProgramVisitor() {
        this.string_builder = new StringBuilder();
        this.var_table = new HashMap<>();
    }
       
    public String
    generate_code(String class_name) {
        String result = String.format(
            "public class %s {\n" +
            "   public static void main(String[] args) {\n" +
            "%s" +
            "   }\n" +
            "}\n",
            class_name, 
            indent(string_builder.toString(), 2)
        );
        return(result);
    }

    private static String
    indent(String code, int n) {
        String indent = "   ".repeat(n);
        String result = Arrays.stream(code.split("\n"))
                              .filter(line -> !line.isBlank())
                              .map(line -> indent + line)
                              .reduce("", (a, b) -> a + b + "\n");
        return(result);
    }

    @Override public String
    visitVar_decl(EdenParser.Var_declContext context) {
        String var_name = context.getChild(0).getText();
        String assign_op = context.getChild(1).getText();
        if (assign_op.equals(":")) {
            // TODO: check type and generate an error 
            // if it does not exists
            String type_name = context.getChild(2).getText();
            string_builder.append(type_name).append(" ");
            string_builder.append(var_name);
            if (context.getChildCount() > 4) {
                String expr = visit(context.expr());
                string_builder.append(" = ").append(expr);
                var_table.put(var_name, expr);
            }
            var_table.put(var_name, null);
        } else if (assign_op.equals(":=")) {
            String expr = visit(context.expr());
            // TODO: check which type will the expression 
            // generate and declare a variable with that type
            string_builder.append("int ");
            string_builder.append(var_name);
            string_builder.append(" = ");
            string_builder.append(expr);
            var_table.put(var_name, expr);
        }
        string_builder.append(";\n");
        return(null);
    }

    @Override public String
    visitExpr(EdenParser.ExprContext context) {
        String expr = context.getText();
        return(expr);
    }
}

public class Eden {
    public static void 
    main(String[] args) throws Exception {
        if (args.length == 1) {
            String filepath = args[0];

            int first_letter_index = 0;
            for (int c = 0; c < filepath.length(); ++c) {
                if (Character.isLetter(filepath.charAt(c))) {
                    first_letter_index = c; 
                    break;
                }
            }

            String filename = filepath.substring(first_letter_index, filepath.length());
            String classname = filename.substring(0, filename.lastIndexOf("."));

            CharStream char_stream = CharStreams.fromFileName(filepath);
            EdenLexer lexer = new EdenLexer(char_stream);

            CommonTokenStream token_stream = new CommonTokenStream(lexer);
            EdenParser parser = new EdenParser(token_stream);
            ParseTree tree = parser.prog();

            ProgramVisitor program = new ProgramVisitor();
            program.visit(tree);
            String code = program.generate_code(classname);

            System.out.printf("[INFO]: source file: %s\n", filename);
            System.out.printf("-+-Output%s+-\n", "-".repeat(classname.length()));
            System.out.printf(" %s.java \n", classname);
            System.out.printf("-+-Code%s--+-\n", "-".repeat(classname.length()));
            System.out.printf(code);
            System.out.printf("-+-%s------+-\n", "-".repeat(classname.length()));
        } else {
            System.out.println("[INFO]: java Eden <filepath>");
        }
    }
}
