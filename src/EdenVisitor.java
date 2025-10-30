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
	 * Visit a parse tree produced by {@link EdenParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(EdenParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(EdenParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link EdenParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(EdenParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(EdenParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link EdenParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(EdenParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link EdenParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(EdenParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(EdenParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link EdenParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(EdenParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link EdenParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(EdenParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdenParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(EdenParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link EdenParser#add_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(EdenParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link EdenParser#mul_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(EdenParser.MulExprContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link EdenParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(EdenParser.TermContext ctx);
}