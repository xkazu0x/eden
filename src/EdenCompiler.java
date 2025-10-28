import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;
import java.io.*;
import java.nio.file.*;

class Builder {
    public static final int DEFAULT = 0;
    public static final int STRUCT  = 1;
    public static final int MAX     = 2;
}

class ProgramVisitor extends EdenBaseVisitor<String> {
    StringBuilder builder_buf[]    = new StringBuilder[Builder.MAX];
    Map<String, String> type_table = new HashMap<>();
    Map<String, String> var_table  = new HashMap<>();
    List<String> struct_list       = new ArrayList<>();

    int current_builder = Builder.DEFAULT;
    int indent_level    = 1;

    public 
    ProgramVisitor() {
        for (int i = 0; i < Builder.MAX; ++i) {
            builder_buf[i] = new StringBuilder();
        }

        type_table.put("u16",    "char");
        type_table.put("s32",    "int");
        type_table.put("f32",    "float");
        type_table.put("f64",    "double");

        type_table.put("char",   "char");
        type_table.put("int",    "int");
        type_table.put("float",  "float");
        type_table.put("double", "double");
        type_table.put("string", "String");
    }

    public String
    get_code_str(String class_name) {
        String result = String.format(
            "%s" +
            "public class %s {\n" +
            "%s" +
            "}\n",
            builder_buf[Builder.STRUCT].toString(),
            class_name, 
            builder_buf[Builder.DEFAULT].toString()
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
            if (type_table.containsKey(type_name)) {
                builder_buf[current_builder].append(type_table.get(type_name));
            } else {
                builder_buf[current_builder].append(type_name);
            }
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
        current_builder = Builder.STRUCT;
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
        current_builder = Builder.DEFAULT;
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
        visit(context.stmt_block());
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
    visitFunc_call_stmt(EdenParser.Func_call_stmtContext context) {
        builder_buf[current_builder].append("    ".repeat(indent_level));
        visit(context.func_call_expr());
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
        visit(context.stmt_block());
        indent_level -= 1;
        builder_buf[current_builder].append("    ".repeat(indent_level));
        builder_buf[current_builder].append("}\n");
        return(null);
    }

    @Override public String
    visitStmt_block(EdenParser.Stmt_blockContext context) {
        var stmt_list = context.stmt();
        for (int stmt_index = 0;
             stmt_index < stmt_list.size();
             ++stmt_index) {
            visit(context.stmt(stmt_index));
        }
        return(null);
    }

    ///////////////////
    // NOTE: Expression
    @Override public String
    visitExpr(EdenParser.ExprContext context) {
        String expr = context.getText();
        return(expr);
    }
    
    @Override public String
    visitFunc_call_expr(EdenParser.Func_call_exprContext context) {
        String func_name = context.getChild(0).getText();
        builder_buf[current_builder].append(func_name);
        builder_buf[current_builder].append("(");
        var expr_list = context.expr();
        for (int expr_index = 0;
             expr_index < expr_list.size();
             ++expr_index) {
            String expr = visit(context.expr(expr_index));
            builder_buf[current_builder].append(expr);
            if (expr_index != expr_list.size() - 1) {
                builder_buf[current_builder].append(", ");
            }
        }
        builder_buf[current_builder].append(")");
        return(null);
    }
}

public class EdenCompiler {
  private static EdenLexer
  eden_create_lexer(String file_path) {
    EdenLexer result = null;
    try {
      CharStream char_stream = CharStreams.fromFileName(file_path);
      result = new EdenLexer(char_stream);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return(result);
  }

  private static EdenParser
  eden_create_parser(EdenLexer lexer) {
    CommonTokenStream token_stream = new CommonTokenStream(lexer);
    EdenParser result = new EdenParser(token_stream);
    return(result);
  }

  private static void
  write_file(String path, String data) {
    try {
      Files.write(
        Paths.get(path), 
        data.getBytes(),
        StandardOpenOption.CREATE,
        StandardOpenOption.TRUNCATE_EXISTING,
        StandardOpenOption.WRITE
      );
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void 
  main(String[] args) throws Exception {
    CmdLineParser cmd_parser = new CmdLineParser(args);
    if (cmd_parser.parse()) {
      String src_file_path = cmd_parser.get_src_file_path();
      String dst_file_path = cmd_parser.get_dst_file_path();
      String class_name = cmd_parser.get_class_name();

      EdenLexer lexer = eden_create_lexer(src_file_path);
      EdenParser parser = eden_create_parser(lexer);

      ProgramVisitor program = new ProgramVisitor();
      program.visit(parser.prog());

      String code_str = program.get_code_str(class_name);
      write_file(dst_file_path, code_str);

      System.out.printf("[INFO]: src: %s\n", src_file_path);
      System.out.printf("[INFO]: dst: %s\n", dst_file_path);
      System.out.printf("-+-File%s+-\n", "-".repeat(class_name.length()));
      System.out.printf("  %s.java \n", class_name);
      System.out.printf("-+-Code%s+-\n", "-".repeat(class_name.length()));
      System.out.printf(code_str);
      System.out.printf("-+-%s----+-\n", "-".repeat(class_name.length()));
    }
  }
}
