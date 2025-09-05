package compiler;

import parser.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream stream = CharStreams.fromFileName("k:/Eden/sample.eden");
        
        EdenLexer lexer = new EdenLexer(stream);
        CommonTokenStream token_stream = new CommonTokenStream(lexer);
        
        EdenParser parser = new EdenParser(token_stream);
        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree(parser));
        
        //new Visitor().visit(tree);
    }
}
