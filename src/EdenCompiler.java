import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;
import java.io.*;
import java.nio.file.*;

class Builder {
    public static final int DEFAULT = 0;
    public static final int IMPORT  = 1;
    public static final int STRUCT  = 2;
    public static final int FUNC    = 3;
    public static final int MAX     = 4;
}

class Variable {
  String name;
  String type;
  String expr;

  public
  Variable(String name, String type, String expr) {
    this.name = name;
    this.type = type;
    this.expr = expr;
  }

  public String
  get_type() {
    return(type);
  }

  public void
  set_expr(String expr) {
    this.expr = expr;
  }
}

class ProgramVisitor extends EdenBaseVisitor<String> {
  String class_name;
  int indent_level;
  int curr_builder_index;
  StringBuilder builders[];

  Map<String, String> type_table;
  Map<String, Variable> var_table;
  Map<String, String> func_table;

  public List<String> warnings;
  public List<String> errors;

  public 
  ProgramVisitor(String class_name) {
    this.class_name = class_name;
    indent_level = 0;
    curr_builder_index = Builder.DEFAULT;
    builders = new StringBuilder[Builder.MAX];
    for (int i = 0; i < Builder.MAX; ++i) {
      builders[i] = new StringBuilder();
    }

    type_table = new HashMap<>();
    type_table.put("int", "int");
    type_table.put("float", "float");
    type_table.put("double", "double");
    type_table.put("bool", "boolean");
    type_table.put("char", "char");
    type_table.put("string", "String");

    var_table = new HashMap<>();
    func_table = new HashMap<>();

    builders[Builder.IMPORT].append("import java.util.Scanner;\n");
    builders[Builder.IMPORT].append("\n");

    String output_proc = "  static void output(String str) {\n" +
                         "    System.out.println(str);\n" +
                         "  }";
    String input_proc =  "  static String input() {\n" +
                         "    Scanner scan = new Scanner(System.in);\n" +
                         "    String result = scan.nextLine();\n" +
                         "    return(result);\n" +
                         "  }";
    builders[Builder.FUNC].append("  ".repeat(indent_level));
    builders[Builder.FUNC].append(output_proc);
    builders[Builder.FUNC].append("\n");
    builders[Builder.FUNC].append("  ".repeat(indent_level));
    builders[Builder.FUNC].append(input_proc);
    builders[Builder.FUNC].append("\n");

    warnings = new ArrayList<>();
    errors = new ArrayList<>();
  }
  
  private void
  block_start() {
    indent_level += 1;
  };

  private void
  block_end() {
    indent_level -= 1;
  }

  private void
  block_add(String str) {
    builders[curr_builder_index].append("  ".repeat(indent_level));
    builders[curr_builder_index].append(str);
    builders[curr_builder_index].append("\n");
  }

  private String
  build_code() {
    String result = String.format(
      "%s" + 
      "%s" +
      "public class %s {\n" +
      "%s" +
      "%s" +
      "}\n",
      builders[Builder.IMPORT].toString(),
      builders[Builder.STRUCT].toString(),
      class_name, 
      builders[Builder.FUNC].toString(),
      builders[Builder.DEFAULT].toString()
    );
    return(result);
  }
  
  private void
  check_expr_type(String expr, String type) {
    if (type.equals("int")) {
      if (expr.contains(".")) {
        warnings.add("incompatible type: conversion from 'float' to 'int'");
      } else if (expr.contains("\"")) {
        errors.add("incompatible type: assigning 'string' to 'int'");
      } else if (expr.contains("true") || expr.contains("false")) {
        errors.add("incompatible type: assigning 'bool' to 'int'");
      }
    }
  }

  @Override public String
  visitProg(EdenParser.ProgContext context) {
    block_start();
    block_add("public static void main(String[] args) {");
    visit(context.block());
    block_add("}");
    block_end();
    String result = build_code();
    return(result);
  }

  @Override public String
  visitBlock(EdenParser.BlockContext context) {
    block_start();
    int child_count = context.getChildCount();
    for (int i = 0; i < child_count; ++i) {
      String block = visit(context.getChild(i));
      if (block != null) {
        block_add(block);
      }
    }
    block_end();
    return(null);
  }

  @Override public String
  visitDecl(EdenParser.DeclContext context) {
    String decl = visit(context.getChild(0));
    return(decl);
  }

  @Override public String
  visitVarDecl(EdenParser.VarDeclContext context) {
    String name = context.getChild(0).getText();
    String type = context.getChild(2).getText();
    String expr = visit(context.getChild(4));
    type = type_table.get(type);
    if (type.equals("float")) expr += "f";
    check_expr_type(expr, type);
    Variable var = new Variable(name, type, expr);
    if (var_table.containsKey(name)) {
      errors.add("variable already defined: " + name);
    } else {
      var_table.put(name, var);
    }
    String result = type + " " + name + " = " + expr + ";";
    return(result);
  }

  @Override public String
  visitAttr(EdenParser.AttrContext context) {
    String var_name = context.getChild(0).getText();
    String expr = visit(context.getChild(2));
    if (var_table.containsKey(var_name)) {
      Variable var = var_table.get(var_name);
      check_expr_type(expr, var.get_type());
      var.set_expr(expr);
    } else {
      errors.add("use of undeclared variable: " + var_name);
    }
    String result = var_name + " = " + expr + ";";
    return(result);
  }

  @Override public String
  visitFuncCall(EdenParser.FuncCallContext context) {
    String func_name = context.getChild(0).getText();
    String params = "";
    if (context.getChildCount() > 3) { 
      params = visit(context.getChild(2));
    }
    String result = func_name + "(" + params + ");";
    return(result);
  }

  @Override public String
  visitParamList(EdenParser.ParamListContext context) {
    String result = visit(context.getChild(0));
    int child_count = context.getChildCount();
    if (child_count > 1) {
      for (int i = 1; i < child_count; ++i) {
        result += ", " + visit(context.getChild(i));
      }
    }
    return(result);
  }

  @Override public String
  visitIfStmt(EdenParser.IfStmtContext context) {
    String expr = visit(context.getChild(1));
    block_add("if (" + expr + ") {");
    visit(context.block(0));
    int child_count = context.getChildCount();
    if (child_count > 5) {
      block_add("} else {");
      visit(context.block(1));
    }
    block_add("}");
    return(null);
  }

  @Override public String
  visitWhileStmt(EdenParser.WhileStmtContext context) {
    String expr = visit(context.getChild(1));
    block_add("while (" + expr + ") {");
    visit(context.block());
    block_add("}");
    return(null);
  }

  @Override public String
  visitExpr(EdenParser.ExprContext context) {
    String expr = visit(context.getChild(0));
    return(expr);
  }
  
  @Override public String
  visitAddExpr(EdenParser.AddExprContext context) {
    String left = visit(context.getChild(0));
    String result = left;
    int child_count = context.getChildCount();
    for (int i = 1; i < child_count; i += 2) {
      String op = context.getChild(i).getText();
      String right = visit(context.getChild(i+1));
      result += " " + op + " " + right;
    }
    return(result);
  }

  @Override public String
  visitMulExpr(EdenParser.MulExprContext context) {
    String left = context.getChild(0).getText();
    String result = left;
    int child_count = context.getChildCount();
    for (int i = 1; i < child_count; i += 2) {
      String op = context.getChild(i).getText();
      String right = context.getChild(i+1).getText();
      result += " " + op + " " + right;
    }
    return(result);
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
  main(String[] args) {
    CmdLineParser cmd_parser = new CmdLineParser(args);
    if (cmd_parser.parse()) {
      String src_file_path = cmd_parser.get_src_file_path();
      String dst_file_path = cmd_parser.get_dst_file_path();
      String class_name = cmd_parser.get_class_name();

      EdenLexer lexer = eden_create_lexer(src_file_path);
      EdenParser parser = eden_create_parser(lexer);

      ProgramVisitor program = new ProgramVisitor(class_name);
      String code = program.visit(parser.prog());
      if (!program.warnings.isEmpty()) {
        for (String str : program.warnings) {
          System.out.printf("[WARN]: %s\n", str);
        }
      }
      if (!program.errors.isEmpty()) {
        for (String str : program.errors) {
          System.out.printf("[ERROR]: %s\n", str);
        }
      }
      write_file(dst_file_path, code);
      System.out.printf("[INFO]: src: %s\n", src_file_path);
      System.out.printf("[INFO]: dst: %s\n", dst_file_path);
      System.out.printf("-+-File%s+-\n", "-".repeat(class_name.length()));
      System.out.printf("  %s.java \n", class_name);
      System.out.printf("-+-Code%s+-\n", "-".repeat(class_name.length()));
      System.out.printf(code);
      System.out.printf("-+-%s----+-\n", "-".repeat(class_name.length()));
    }
  }
}
