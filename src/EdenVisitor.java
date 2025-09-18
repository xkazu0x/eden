// Generated from Eden.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EdenParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EdenVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EdenParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(EdenParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(EdenParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(EdenParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_op(EdenParser.Assign_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(EdenParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(EdenParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expr(EdenParser.Or_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(EdenParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#cmp_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_expr(EdenParser.Cmp_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#add_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expr(EdenParser.Add_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#mul_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_expr(EdenParser.Mul_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#operand_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand_expr(EdenParser.Operand_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#or_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_op(EdenParser.Or_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#and_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_op(EdenParser.And_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#cmp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_op(EdenParser.Cmp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#add_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_op(EdenParser.Add_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#mul_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_op(EdenParser.Mul_opContext ctx);
}