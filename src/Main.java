import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream char_stream = CharStreams.fromFileName("../example.eden");

        EdenLexer lexer = new EdenLexer(char_stream);
        CommonTokenStream token_stream = new CommonTokenStream(lexer);
        
        EdenParser parser = new EdenParser(token_stream);
        ParseTree tree = parser.prog();

        System.out.println(tree.toStringTree(parser));
    }
}
