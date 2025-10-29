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
	/**
	 * Enter a parse tree produced by {@link EdenParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EdenParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EdenParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link EdenParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(EdenParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link EdenParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(EdenParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(EdenParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(EdenParser.DeclContext ctx);
}