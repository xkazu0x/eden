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
	 * Enter a parse tree produced by {@link EdenParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(EdenParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(EdenParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(EdenParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(EdenParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(EdenParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(EdenParser.TypeContext ctx);
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
	 * Enter a parse tree produced by {@link EdenParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void enterOr_expr(EdenParser.Or_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void exitOr_expr(EdenParser.Or_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(EdenParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(EdenParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#cmp_expr}.
	 * @param ctx the parse tree
	 */
	void enterCmp_expr(EdenParser.Cmp_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#cmp_expr}.
	 * @param ctx the parse tree
	 */
	void exitCmp_expr(EdenParser.Cmp_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr(EdenParser.Add_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr(EdenParser.Add_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#mul_expr}.
	 * @param ctx the parse tree
	 */
	void enterMul_expr(EdenParser.Mul_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#mul_expr}.
	 * @param ctx the parse tree
	 */
	void exitMul_expr(EdenParser.Mul_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#operand_expr}.
	 * @param ctx the parse tree
	 */
	void enterOperand_expr(EdenParser.Operand_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#operand_expr}.
	 * @param ctx the parse tree
	 */
	void exitOperand_expr(EdenParser.Operand_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#or_op}.
	 * @param ctx the parse tree
	 */
	void enterOr_op(EdenParser.Or_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#or_op}.
	 * @param ctx the parse tree
	 */
	void exitOr_op(EdenParser.Or_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#and_op}.
	 * @param ctx the parse tree
	 */
	void enterAnd_op(EdenParser.And_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#and_op}.
	 * @param ctx the parse tree
	 */
	void exitAnd_op(EdenParser.And_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#cmp_op}.
	 * @param ctx the parse tree
	 */
	void enterCmp_op(EdenParser.Cmp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#cmp_op}.
	 * @param ctx the parse tree
	 */
	void exitCmp_op(EdenParser.Cmp_opContext ctx);
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