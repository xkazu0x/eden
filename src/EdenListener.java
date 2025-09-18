// Generated from Eden.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EdenParser}.
 */
public interface EdenListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link EdenParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EdenParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link EdenParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EdenParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link EdenParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(EdenParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link EdenParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(EdenParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link EdenParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(EdenParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link EdenParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(EdenParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link EdenParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(EdenParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link EdenParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(EdenParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link EdenParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(EdenParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link EdenParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(EdenParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link EdenParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(EdenParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link EdenParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(EdenParser.NumberContext ctx);
}