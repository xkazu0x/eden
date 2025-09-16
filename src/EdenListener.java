// Generated from Eden.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EdenParser}.
 */
public interface EdenListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EdenParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(EdenParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(EdenParser.ProgContext ctx);
}