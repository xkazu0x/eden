import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

// abstract class Expression {
// }
//
// class VariableDeclaration extends Expression {
//     public String name;
//     public String type;
//     public int val;
//     public VariableDeclaration(String name, String type, int val) {
//         this.name = name;
//         this.type = type;
//         this.val = val;
//     }
// }
//
// class Multiplication extends Expression {
//     public Expression left;
//     public Expression right;
//     public Multiplication(Expression left, Expression right) {
//         this.left = left;
//         this.right = right;
//     }
//     @Override public String
//     toString() {
//         return(left.toString() + " * " + right.toString());
//     }
// }
//
// class Addition extends Expression {
//     public Expression left;
//     public Expression right;
//     public Addition(Expression left, Expression right) {
//         this.left = left;
//         this.right = right;
//     }
//     @Override public String
//     toString() {
//         return(left.toString() + " + " + right.toString());
//     }
// }
//
// class Variable extends Expression {
//     public String name; 
//     public Variable(String name) {
//         this.name = name;
//     }
//     @Override public String
//     toString() {
//         return(name);
//     }
// }
//
// class Number extends Expression {
//     public int val;
//     public Number(int value) {
//         this.val = val;
//     }
//     @Override public String 
//     toString() {
//         return(Integer.toString(val));
//     }
// }
//
// class ExpressionVisitor extends EdenBaseVisitor<Expression> {
//     private List<String> var_name_list;
//     private List<String> semantic_error_list;
//
//     public ExpressionVisitor(List<String> semantic_error_list) {
//         this.var_name_list = new ArrayList<>();
//         this.semantic_error_list = semantic_error_list;
//     }
//
//     @Override public Expression 
//     visitVariableDeclaration(EdenParser.VariableDeclarationContext context) { 
//         String name = context.getChild(0).getText();
//         if (var_name_list.contains(name)) {
//             semantic_error_list.add("[ERROR]: variable already declared: " + name);
//         } else {
//             var_name_list.add(name);
//         }
//         String type = context.getChild(2).getText();
//         int val = Integer.parseInt(context.getChild(4).getText());
//         return new VariableDeclaration(name, type, val);
//     }
//
//     @Override public Expression 
//     visitMultiplication(EdenParser.MultiplicationContext context) { 
//         Expression left = visit(context.getChild(0)); 
//         Expression right = visit(context.getChild(2));
//         return new Multiplication(left, right);
//     }
//
//     @Override public Expression 
//     visitAddition(EdenParser.AdditionContext context) { 
//         Expression left = visit(context.getChild(0)); 
//         Expression right = visit(context.getChild(2));
//         return new Addition(left, right);
//     }
//
//     @Override public Expression 
//     visitVariable(EdenParser.VariableContext context) {
//         String name = context.getChild(0).getText();
//         if (!var_name_list.contains(name)) {
//             semantic_error_list.add("[ERROR]: reference to a undeclared variable: " + name);
//         }
//         return new Variable(name);
//     }
//
//     @Override public Expression 
//     visitNumber(EdenParser.NumberContext context) { 
//         String name = context.getChild(0).getText();
//         int val = Integer.parseInt(name);
//         return new Number(val);
//     }
// }
//
// class Program {
//     public List<Expression> expr_list;
//     public Program() {
//         this.expr_list = new ArrayList<>();
//     }
//     public void 
//     add_expr(Expression expr) {
//         expr_list.add(expr);
//     }
// }
//
// class ProgramVisitor extends EdenBaseVisitor<Program> {
//     public List<String> semantic_error_list;
//
//     @Override public Program 
//     visitProgram(EdenParser.ProgramContext context) {
//         Program prog = new Program();
//         semantic_error_list = new ArrayList<>();
//         ExpressionVisitor expr_visitor = new ExpressionVisitor(semantic_error_list);
//         for (int child_index = 0; child_index < context.getChildCount(); child_index++) {
//             if (child_index == (context.getChildCount() - 1)) {
//                 // EOF: do nothing 
//             } else {
//                 ParseTree child = context.getChild(child_index);
//                 Expression expr = expr_visitor.visit(child);
//                 prog.add_expr(expr);
//             }
//         }
//         return(prog);
//     }
// }
//
// class ExpressionProcessor {
//     public List<Expression> expr_list;
//     public Map<String, Integer> var_table;
//
//     public ExpressionProcessor(List<Expression> expr_list) {
//         this.expr_list = expr_list;
//         var_table = new HashMap<String, Integer>(); 
//     }
//
//     public List<String> 
//     eval_expr_list() {
//         List<String> eval_list = new ArrayList<>();
//         for (Expression expr: expr_list) {
//             if (expr instanceof VariableDeclaration) {
//                 VariableDeclaration decl = (VariableDeclaration)expr;
//                 String name = decl.name;
//                 int val = decl.val;
//                 var_table.put(name, val);
//                 eval_list.add("[INFO]: decl: " + name + " = " + Integer.toString(val));
//             } else {
//                 String str = expr.toString();
//                 int result = eval_expr(expr);
//                 eval_list.add("[INFO]: expr: " + str + " = " + result);
//             }
//         }
//         return(eval_list);
//     }
//
//     private int
//     eval_expr(Expression expr) {
//         int result = 0;
//         if (expr instanceof Number) {
//             Number num = (Number)expr;
//             result = num.val;
//         } else if (expr instanceof Variable) {
//             Variable var = (Variable)expr;
//             result = var_table.get(var.name);
//         } else if (expr instanceof Addition) {
//             Addition add = (Addition)expr;
//             int left = eval_expr(add.left);
//             int right = eval_expr(add.right);
//             result = left + right;
//         } else if (expr instanceof Multiplication) {
//             Multiplication mul = (Multiplication)expr;
//             int left = eval_expr(mul.left);
//             int right = eval_expr(mul.right);
//             result = left * right;
//         }
//         return(result);
//     }
// }

public class Eden {
    public static void 
    main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("[USAGE]: java Eden <filename>");
            return;
        }
        String filename = args[0];

        CharStream char_stream = CharStreams.fromFileName(filename);
        EdenLexer lexer = new EdenLexer(char_stream);

        CommonTokenStream token_stream = new CommonTokenStream(lexer);
        EdenParser parser = new EdenParser(token_stream);
        ParseTree tree = parser.prog();

        // ProgramVisitor prog_visitor = new ProgramVisitor();
        // Program prog = prog_visitor.visit(tree);
        // if (prog_visitor.semantic_error_list.isEmpty()) {
        //     ExpressionProcessor processor = new ExpressionProcessor(prog.expr_list);
        //     List<String> eval_list = processor.eval_expr_list();
        //     for (String eval: eval_list) {
        //         System.out.println(eval);
        //     }
        // } else {
        //     for (String error: prog_visitor.semantic_error_list) {
        //         System.out.println(error);
        //     }
        // }
    }
}
