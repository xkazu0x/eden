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
	 * Enter a parse tree produced by {@link EdenParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(EdenParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(EdenParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(EdenParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(EdenParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#return_list}.
	 * @param ctx the parse tree
	 */
	void enterReturn_list(EdenParser.Return_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#return_list}.
	 * @param ctx the parse tree
	 */
	void exitReturn_list(EdenParser.Return_listContext ctx);
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
	 * Enter a parse tree produced by {@link EdenParser#add_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_op(EdenParser.Add_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#add_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_op(EdenParser.Add_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#mul_op}.
	 * @param ctx the parse tree
	 */
	void enterMul_op(EdenParser.Mul_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#mul_op}.
	 * @param ctx the parse tree
	 */
	void exitMul_op(EdenParser.Mul_opContext ctx);
}