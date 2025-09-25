import java.io.*;
import java.util.*;
import java.nio.file.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

class ProgramVisitor extends EdenBaseVisitor<String> {
    public static final int STRING_BUILDER_DEFAULT = 0;
    public static final int STRING_BUILDER_STRUCT  = 1;
    public static final int STRING_BUILDER_MAX     = 2;

    StringBuilder builder_buf[]   = new StringBuilder[STRING_BUILDER_MAX];
    List<String> struct_list      = new ArrayList<>();
    Map<String, String> var_table = new HashMap<>();

    int current_builder = STRING_BUILDER_DEFAULT;
    int indent_level    = 1;

    public 
    ProgramVisitor() {
        for (int i = 0; i < STRING_BUILDER_MAX; ++i) {
            builder_buf[i] = new StringBuilder();
        }
    }
       
    public String
    generate_code(String class_name) {
        String result = String.format(
            "%s" +
            "public class %s {\n" +
            "%s" +
            "}\n",
            builder_buf[STRING_BUILDER_STRUCT].toString(),
            class_name, 
            builder_buf[STRING_BUILDER_DEFAULT].toString()
        );
        return(result);
    }
    
    ////////////////////
    // NOTE: Declaration
    @Override public String
    visitVar_decl(EdenParser.Var_declContext context) {
        String var_name = context.getChild(0).getText();
        String assign_op = context.getChild(1).getText();
        builder_buf[current_builder].append("    ".repeat(indent_level));
        if (assign_op.equals(":")) {
            String type_name = context.getChild(2).getText();
            builder_buf[current_builder].append(type_name);
            builder_buf[current_builder].append(" ");
            builder_buf[current_builder].append(var_name);
            if (struct_list.contains(type_name)) {
                builder_buf[current_builder].append(" = ");
                builder_buf[current_builder].append("new " + type_name + "()");
            } else if (context.getChildCount() > 4) {
                String expr = visit(context.expr());
                builder_buf[current_builder].append(" = ");
                builder_buf[current_builder].append(expr);
                var_table.put(var_name, expr);
            } else {
                var_table.put(var_name, null);
            }
        } else if (assign_op.equals(":=")) {
            String expr = visit(context.expr());
            builder_buf[current_builder].append("var ");
            builder_buf[current_builder].append(var_name);
            builder_buf[current_builder].append(" = ");
            builder_buf[current_builder].append(expr);
            var_table.put(var_name, expr);
        }
        builder_buf[current_builder].append(";\n");
        return(null);
    }
    
    @Override public String
    visitStruct_decl(EdenParser.Struct_declContext context) {
        current_builder = STRING_BUILDER_STRUCT;
        {
            String struct_name = context.getChild(0).getText();
            builder_buf[current_builder].append("class ");
            builder_buf[current_builder].append(struct_name);
            builder_buf[current_builder].append(" {\n");
            var var_decl_list = context.var_decl();
            for (int var_decl_index = 0;
            var_decl_index < var_decl_list.size();
            ++var_decl_index) {
                visit(context.var_decl(var_decl_index));
            }
            builder_buf[current_builder].append("}\n");
            struct_list.add(struct_name);
        }
        current_builder = STRING_BUILDER_DEFAULT;
        return(null);
    }

    @Override public String
    visitFunc_decl(EdenParser.Func_declContext context) {
        String var_name = context.getChild(0).getText();
        builder_buf[current_builder].append("    ".repeat(indent_level));
        builder_buf[current_builder].append("public static ");
        var return_list = context.return_list();
        if (return_list != null) {
            visit(return_list);
        } else {
            builder_buf[current_builder].append("void");
        }
        builder_buf[current_builder].append(" ");
        builder_buf[current_builder].append(var_name);
        builder_buf[current_builder].append("(");
        if (var_name.equals("main")) {
            builder_buf[current_builder].append("String[] args");
        } else {
            var param_list = context.param_list();
            if (param_list != null) {
                visit(param_list);
            }
        }
        builder_buf[current_builder].append(") ");
        builder_buf[current_builder].append("{\n");
        indent_level += 1;
        // TODO: change this to visitBlock()
        // {
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
        // }
        indent_level -= 1;
        builder_buf[current_builder].append("    ".repeat(indent_level));
        builder_buf[current_builder].append("}\n");
        return(null);
    }

    @Override public String
    visitParam_list(EdenParser.Param_listContext context) {
        String var_name = context.getChild(0).getText();
        String type_name = context.getChild(2).getText();
        builder_buf[current_builder].append(type_name);
        builder_buf[current_builder].append(" ");
        builder_buf[current_builder].append(var_name);
        int child_count = context.getChildCount();
        if (child_count > 3) {
            builder_buf[current_builder].append(", ");
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
        builder_buf[current_builder].append(type_name);
        return(null);
    }
    
    //////////////////
    // NOTE: Statement
    @Override public String
    visitAssign_stmt(EdenParser.Assign_stmtContext context) {
        String var_name = context.getChild(0).getText();
        String expr = visit(context.expr());
        builder_buf[current_builder].append("    ".repeat(indent_level));
        builder_buf[current_builder].append(var_name);
        if (context.getChild(1).getText().equals(".")) {
            String member_name = context.getChild(2).getText();
            builder_buf[current_builder].append(".");
            builder_buf[current_builder].append(member_name);
        }
        builder_buf[current_builder].append(" = ");
        builder_buf[current_builder].append(expr);
        builder_buf[current_builder].append(";\n");
        return(null);
    }
    
    @Override public String
    visitReturn_stmt(EdenParser.Return_stmtContext context) {
        builder_buf[current_builder].append("    ".repeat(indent_level));
        builder_buf[current_builder].append("return");
        if (!context.getChild(1).getText().equals(";")) {
            String expr = visit(context.expr());
            builder_buf[current_builder].append(" ");
            builder_buf[current_builder].append(expr);
        }
        builder_buf[current_builder].append(";\n");
        return(null);
    }

    @Override public String
    visitIf_stmt(EdenParser.If_stmtContext context) {
        String expr = visit(context.expr());
        builder_buf[current_builder].append("    ".repeat(indent_level));
        builder_buf[current_builder].append("if ");
        builder_buf[current_builder].append("(" + expr + ") ");
        builder_buf[current_builder].append("{\n");
        indent_level += 1;
        // TODO: change this to visitBlock()
        // {
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
        // }
        indent_level -= 1;
        builder_buf[current_builder].append("    ".repeat(indent_level));
        builder_buf[current_builder].append("}\n");
        return(null);
    }
    
    ///////////////////
    // NOTE: Expression
    @Override public String
    visitExpr(EdenParser.ExprContext context) {
        String expr = context.getText();
        return(expr);
    }
}

public class Eden {
    public static void 
    main(String[] args) throws Exception {
        if (args.length >= 1) {
            String output = "";
            for (int arg_index = 0;
                 arg_index < args.length;
                 ++arg_index) {
                String arg = args[arg_index];
                if (arg.contains("-o")) {
                    output = args[arg_index + 1] + "/";
                }
            }
            String filepath = args[0];
            
            int past_last_slash = filepath.lastIndexOf("/") + 1;
            String filename = filepath.substring(past_last_slash, filepath.length());
            String classname = filename.substring(0, filename.lastIndexOf("."));
            output += classname + ".java";

            CharStream char_stream = CharStreams.fromFileName(filepath);
            EdenLexer lexer = new EdenLexer(char_stream);

            CommonTokenStream token_stream = new CommonTokenStream(lexer);
            EdenParser parser = new EdenParser(token_stream);
            ParseTree tree = parser.prog();

            ProgramVisitor program = new ProgramVisitor();
            program.visit(tree);
            String code = program.generate_code(classname);

            try {
                Files.write(Paths.get(output), 
                            code.getBytes(),
                            StandardOpenOption.CREATE,
                            StandardOpenOption.TRUNCATE_EXISTING,
                            StandardOpenOption.WRITE);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.printf("[INFO]: file: %s\n", filename);
            System.out.printf("[INFO]: path: %s\n", filepath);
            System.out.printf("[INFO]:  out: %s\n", output);
            System.out.printf("-+-File%s+-\n", "-".repeat(classname.length()));
            System.out.printf("  %s.java \n", classname);
            System.out.printf("-+-Code%s+-\n", "-".repeat(classname.length()));
            System.out.printf(code);
            System.out.printf("-+-%s----+-\n", "-".repeat(classname.length()));
        } else {
            System.out.println("[INFO]: java Eden <filepath>");
        }
    }
}

// TODO: 
// - better if with else and else if.
// - elaborate on the visit expression function.
// - maybe add a stmt_block so you can easily copy the block contents to staments
// and declarations.
// - for, while loops. break. continue.
// - function calls
