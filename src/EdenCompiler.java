import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;
import java.io.*;
import java.nio.file.*;

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

  Map<String, String> type_table;
  Map<String, Variable> var_table;

  public List<String> warnings;
  public List<String> errors;

  public 
  ProgramVisitor(String class_name) {
    this.class_name = class_name;
    indent_level = 0;

    type_table = new HashMap<>();
    type_table.put("int", "int");
    type_table.put("float", "float");
    type_table.put("double", "double");
    type_table.put("bool", "boolean");
    type_table.put("char", "char");
    type_table.put("string", "String");

    var_table = new HashMap<>();

    warnings = new ArrayList<>();
    errors = new ArrayList<>();
  }

  private String
  indent_string(String str) {
    String result = "  ".repeat(indent_level);
    result += str;
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
    String result = "";
    result += "import java.util.Scanner;\n\n";
    result += "public class " + class_name + " {\n";
    indent_level += 1;

    result += indent_string("static void output(String str) {\n");
    indent_level += 1;
    result += indent_string("System.out.println(str);\n");
    indent_level -= 1;
    result += indent_string("}\n");

    result += indent_string("static void output(int num) {\n");
    indent_level += 1;
    result += indent_string("System.out.println(num);\n");
    indent_level -= 1;
    result += indent_string("}\n");

    result += indent_string("static String input() {\n");
    indent_level += 1;
    result += indent_string("Scanner scan = new Scanner(System.in);\n");
    result += indent_string("String result = scan.nextLine();\n");
    result += indent_string("return(result);\n");
    indent_level -= 1;
    result += indent_string("}\n");

    result += indent_string("public static void main(String[] args) {\n");
    result += visit(context.block());
    result += indent_string("}\n");
    indent_level -= 1;
    result += "}\n";
    return(result);
  }

  @Override public String
  visitBlock(EdenParser.BlockContext context) {
    indent_level += 1;
    String result = "";
    int child_count = context.getChildCount();
    for (int i = 0; i < child_count; ++i) {
      result += visit(context.getChild(i));
    }
    indent_level -= 1;
    return(result);
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

    String result = indent_string(type + " " + name + " = " + expr + ";\n");
    return(result);
  }

  @Override public String
  visitImplVarDecl(EdenParser.ImplVarDeclContext context) {
    String name = context.getChild(0).getText();
    String expr = visit(context.getChild(2));
    String type = "var";
    String result = indent_string(type + " " + name + " = " + expr + ";\n");
    return(result);
  }

  @Override public String
  visitStmt(EdenParser.StmtContext context) {
    String stmt = visit(context.getChild(0));
    return(stmt);
  }

  @Override public String
  visitAssignStmt(EdenParser.AssignStmtContext context) {
    String var_name = context.getChild(0).getText();
    String expr = visit(context.getChild(2));
    if (var_table.containsKey(var_name)) {
      Variable var = var_table.get(var_name);
      check_expr_type(expr, var.get_type());
      var.set_expr(expr);
    } else {
      errors.add("use of undeclared variable: " + var_name);
    }
    String result = indent_string(var_name + " = " + expr + ";\n");
    return(result);
  }

  @Override public String
  visitFuncCallStmt(EdenParser.FuncCallStmtContext context) {
    String result = visit(context.getChild(0));
    result += ";\n";
    return(result);
  }

  @Override public String
  visitIfStmt(EdenParser.IfStmtContext context) {
    String expr = visit(context.getChild(1));
    String result = indent_string("if (" + expr + ") {\n");
    result += visit(context.block(0));
    int child_count = context.getChildCount();
    if (child_count > 5) {
      result += indent_string("} else {\n");
      result += visit(context.block(1));
    }
    result += indent_string("}\n");
    return(result);
  }

  @Override public String
  visitWhileStmt(EdenParser.WhileStmtContext context) {
    String expr = visit(context.getChild(1));
    String result = indent_string("while (" + expr + ") {\n");
    result += visit(context.block());
    result += indent_string("}\n");
    return(result);
  }

  @Override public String
  visitFuncCallExpr(EdenParser.FuncCallExprContext context) {
    String func_name = context.getChild(0).getText();
    String params = "";
    if (context.getChildCount() > 3) { 
      params = visit(context.getChild(2));
    }
    ParseTree tree = context.getParent();
    String result = func_name + "(" + params + ")";
    if (tree.getChildCount() > 1) {
      result = indent_string(result);
    }
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
  visitTerm(EdenParser.TermContext context) {
    String result = "";
    int child_count = context.getChildCount();
    if (child_count > 1) {
      result = "(" + visit(context.getChild(1)) + ")";
    } else {
      result = visit(context.getChild(0));
    }
    return(result);
  }

  @Override public String
  visitType_expr(EdenParser.Type_exprContext context) {
    String result = context.getChild(0).getText();
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
