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
	 * Enter a parse tree produced by {@link EdenParser#struct_decl}.
	 * @param ctx the parse tree
	 */
	void enterStruct_decl(EdenParser.Struct_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#struct_decl}.
	 * @param ctx the parse tree
	 */
	void exitStruct_decl(EdenParser.Struct_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(EdenParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(EdenParser.Func_declContext ctx);
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
	 * Enter a parse tree produced by {@link EdenParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(EdenParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(EdenParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(EdenParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(EdenParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(EdenParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(EdenParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EdenParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void enterStmt_block(EdenParser.Stmt_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void exitStmt_block(EdenParser.Stmt_blockContext ctx);
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
	 * Enter a parse tree produced by {@link EdenParser#add_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_op(EdenParser.Add_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link EdenParser#add_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_op(EdenParser.Add_opContext ctx);
}