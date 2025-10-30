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
	 * Enter a parse tree produced by {@link EdenParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(EdenParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(EdenParser.BlockContext ctx);
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
	 * Enter a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link EdenParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(EdenParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link EdenParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(EdenParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(EdenParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(EdenParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link EdenParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(EdenParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link EdenParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(EdenParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link EdenParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParamList(EdenParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link EdenParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParamList(EdenParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(EdenParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(EdenParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link EdenParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(EdenParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link EdenParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(EdenParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link EdenParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(EdenParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link EdenParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(EdenParser.WhileStmtContext ctx);
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
	 * Enter a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link EdenParser#mul_expr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(EdenParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link EdenParser#mul_expr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(EdenParser.MulExprContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link EdenParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(EdenParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(EdenParser.TermContext ctx);
}