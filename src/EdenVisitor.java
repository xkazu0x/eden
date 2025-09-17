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
	 * Visit a parse tree produced by {@link EdenParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(EdenParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#return_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_list(EdenParser.Return_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(EdenParser.ExprContext ctx);
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