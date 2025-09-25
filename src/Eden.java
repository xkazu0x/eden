import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

class ProgramVisitor extends EdenBaseVisitor<String> {
    StringBuilder string_builder;
    Map<String, String> var_table;
    int tab_level;

    public 
    ProgramVisitor() {
        this.string_builder = new StringBuilder();
        this.var_table = new HashMap<>();
        this.tab_level = 2;
    }
       
    public String
    generate_code(String class_name) {
        String result = String.format(
            "public class %s {\n" +
            "    public static void main(String[] args) {\n" +
            "%s" +
            "    }\n" +
            "}\n",
            class_name, 
            string_builder.toString()
        );
        return(result);
    }
    
    ////////////////////
    // NOTE: Declaration
    @Override public String
    visitVar_decl(EdenParser.Var_declContext context) {
        string_builder.append("    ".repeat(tab_level));
        String var_name = context.getChild(0).getText();
        String assign_op = context.getChild(1).getText();
        if (assign_op.equals(":")) {
            // TODO: check type and generate an error 
            // if it does not exists.
            String type_name = context.getChild(2).getText();
            string_builder.append(type_name);
            string_builder.append(" ");
            string_builder.append(var_name);
            if (context.getChildCount() > 4) {
                String expr = visit(context.expr());
                string_builder.append(" = ");
                string_builder.append(expr);
                var_table.put(var_name, expr);
            }
            var_table.put(var_name, null);
        } else if (assign_op.equals(":=")) {
            String expr = visit(context.expr());
            // TODO: check which type will the expression 
            // generate and declare a variable with that type.
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
    visitStruct_decl(EdenParser.Struct_declContext context) {
        String struct_name = context.getChild(0).getText();
        string_builder.append("    ".repeat(tab_level));
        string_builder.append("class ");
        string_builder.append(struct_name);
        string_builder.append(" {\n");
        tab_level += 1;
        var var_decl_list = context.var_decl();
        for (int var_decl_index = 0;
             var_decl_index < var_decl_list.size();
             ++var_decl_index) {
            visit(context.var_decl(var_decl_index));
        }
        tab_level -= 1;
        string_builder.append("    ".repeat(tab_level) + "}\n");
        return(null);
    }

    @Override public String
    visitFunc_decl(EdenParser.Func_declContext context) {
        string_builder.append("    ".repeat(tab_level));
        String var_name = context.getChild(0).getText();
        string_builder.append("public ");
        var return_list = context.return_list();
        if (return_list != null) {
            visit(return_list);
        } else {
            string_builder.append("void");
        }
        string_builder.append(" ");
        string_builder.append(var_name);
        string_builder.append("(");
        var param_list = context.param_list();
        if (param_list != null) {
            visit(param_list);
        }
        string_builder.append(") ");
        string_builder.append("{\n");
        tab_level += 1;
        var var_decl_list = context.var_decl();
        for (int var_decl_index = 0;
             var_decl_index < var_decl_list.size();
             ++var_decl_index) {
            visit(context.var_decl(var_decl_index));
        }
        var stmt_list = context.stmt();
        for (int stmt_index = 0;
             stmt_index < stmt_list.size();
             ++stmt_index) {
            visit(context.stmt(stmt_index));
        }
        tab_level -= 1;
        string_builder.append("    ".repeat(tab_level) + "}\n");
        return(null);
    }

    @Override public String
    visitParam_list(EdenParser.Param_listContext context) {
        String var_name = context.getChild(0).getText();
        String type_name = context.getChild(2).getText();
        string_builder.append(type_name);
        string_builder.append(" ");
        string_builder.append(var_name);
        int child_count = context.getChildCount();
        if (child_count > 3) {
            string_builder.append(", ");
            var param_list = context.param_list();
            for (int param_index = 0;
                 param_index < param_list.size();
                 ++param_index) {
                visit(context.param_list(param_index));
            }
        }
        return(null);
    }

    @Override public String
    visitReturn_list(EdenParser.Return_listContext context) {
        String type_name = context.getChild(1).getText();
        string_builder.append(type_name);
        return(null);
    }
    
    //////////////////
    // NOTE: Statement
    @Override public String
    visitAssign_stmt(EdenParser.Assign_stmtContext context) {
        String var_name = context.getChild(0).getText();
        String expr = visit(context.expr());
        string_builder.append("    ".repeat(tab_level));
        string_builder.append(var_name);
        if (context.getChild(1).getText().equals(".")) {
            String member_name = context.getChild(2).getText();
            string_builder.append(".");
            string_builder.append(member_name);
        }
        string_builder.append(" = ");
        string_builder.append(expr);
        string_builder.append(";\n");
        return(null);
    }
    
    @Override public String
    visitReturn_stmt(EdenParser.Return_stmtContext context) {
        String expr = visit(context.expr());
        string_builder.append("    ".repeat(tab_level));
        string_builder.append("return ");
        string_builder.append(expr);
        string_builder.append(";\n");
        return(null);
    }

    @Override public String
    visitIf_stmt(EdenParser.If_stmtContext context) {
        string_builder.append("    ".repeat(tab_level));
        String expr = visit(context.expr());
        string_builder.append("if ");
        string_builder.append("(" + expr + ") ");
        string_builder.append("{\n");
        tab_level += 1;
        var var_decl_list = context.var_decl();
        for (int var_decl_index = 0;
             var_decl_index < var_decl_list.size();
             ++var_decl_index) {
            visit(context.var_decl(var_decl_index));
        }
        var stmt_list = context.stmt();
        for (int stmt_index = 0;
             stmt_index < stmt_list.size();
             ++stmt_index) {
            visit(context.stmt(stmt_index));
        }
        tab_level -= 1;
        string_builder.append("    ".repeat(tab_level) + "}\n");
        return(null);
    }
    
    ///////////////////
    // NOTE: Expression
    @Override public String
    visitExpr(EdenParser.ExprContext context) {
        // IMPORTANT: THIS NEED WORK!!!!!!!!!!
        // THIS SHOULD NOT JUST RETURN A TEXT
        // THIS SHOULD ITERATE ON ITSELF
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
