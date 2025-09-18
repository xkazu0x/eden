import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

abstract class Expression {
}

class VariableDeclaration extends Expression {
    public String name;
    public String type;
    public int value;
    public VariableDeclaration(String name, String type, int value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }
}

class Multiplication extends Expression {
    public Expression left;
    public Expression right;
    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}

class Addition extends Expression {
    public Expression left;
    public Expression right;
    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}

class Variable extends Expression {
    public String name; 
    public Variable(String name) {
        this.name = name;
    }
}

class Number extends Expression {
    public int value;
    public Number(int value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return Integer.toString(value);
    }
}

class ExpressionVisitor extends EdenBaseVisitor<Expression> {
    private List<String> variable_names;
    private List<String> semantic_errors;

    public ExpressionVisitor(List<String> semantic_errors) {
        this.variable_names = new ArrayList<>();
        this.semantic_errors = semantic_errors;
    }

    @Override 
    public Expression visitVariableDeclaration(EdenParser.VariableDeclarationContext context) { 
        String name = context.getChild(0).getText();
        if (variable_names.contains(name)) {
            semantic_errors.add("[ERROR]: variable already declared: " + name);
        } else {
            variable_names.add(name);
        }
        String type = context.getChild(2).getText();
        int value = Integer.parseInt(context.getChild(4).getText());
        return new VariableDeclaration(name, type, value);
    }
    
    @Override 
    public Expression visitMultiplication(EdenParser.MultiplicationContext context) { 
        Expression left = visit(context.getChild(0)); 
        Expression right = visit(context.getChild(2));
        return new Multiplication(left, right);
    }

    @Override 
    public Expression visitAddition(EdenParser.AdditionContext context) { 
        Expression left = visit(context.getChild(0)); 
        Expression right = visit(context.getChild(2));
        return new Addition(left, right);
    }

    @Override 
    public Expression visitVariable(EdenParser.VariableContext context) {
        Token token = context.NAME().getSymbol();
        int line = token.getLine();
        int column = token.getCharPositionInLine() + 1;
        String name = context.getChild(0).getText();
        if (!variable_names.contains(name)) {
            semantic_errors.add("[ERROR]:" + line + ":" + column + ": reference to a undeclared variable: " + name);
        }
        return new Variable(name);
    }

    @Override 
    public Expression visitNumber(EdenParser.NumberContext context) { 
        String name = context.getChild(0).getText();
        int value = Integer.parseInt(name);
        return new Number(value);
    }
}

class Program {
    public List<Expression> expressions;
    public Program() {
        this.expressions = new ArrayList<>();
    }
    public void addExpression(Expression expression) {
        expressions.add(expression);
    }
}

class ProgramVisitor extends EdenBaseVisitor<Program> {
    public List<String> semantic_errors;

    @Override
    public Program visitProgram(EdenParser.ProgramContext context) {
        Program program = new Program();
        semantic_errors = new ArrayList<>();
        ExpressionVisitor expression_visitor = new ExpressionVisitor(semantic_errors);
        int child_count = context.getChildCount();
        for (int child_index = 0; child_index < child_count; child_index++) {
            if (child_index == (child_count - 1)) {
                // EOF: do nothing
            } else {
                ParseTree child = context.getChild(child_index);
                Expression expression = expression_visitor.visit(child);
                program.addExpression(expression);
            }
        }
        return program;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream char_stream = CharStreams.fromFileName("../example.eden");

        EdenLexer lexer = new EdenLexer(char_stream);
        CommonTokenStream token_stream = new CommonTokenStream(lexer);
        
        EdenParser parser = new EdenParser(token_stream);
        ParseTree tree = parser.prog();

        // System.out.println(tree.toStringTree(parser));
    }
}
