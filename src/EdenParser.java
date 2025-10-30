// Generated from Eden.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EdenParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, INT=16, REAL=17, 
		BOOL=18, CHAR=19, STRING=20, NAME=21, WHITESPACE=22, LINE_COMMENT=23;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_decl = 2, RULE_var_decl = 3, RULE_attr = 4, 
		RULE_func_call = 5, RULE_param_list = 6, RULE_stmt = 7, RULE_if_stmt = 8, 
		RULE_while_stmt = 9, RULE_expr = 10, RULE_add_expr = 11, RULE_mul_expr = 12, 
		RULE_add_op = 13, RULE_mul_op = 14, RULE_term = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "block", "decl", "var_decl", "attr", "func_call", "param_list", 
			"stmt", "if_stmt", "while_stmt", "expr", "add_expr", "mul_expr", "add_op", 
			"mul_op", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "';'", "'('", "')'", "','", "'if'", "'{'", "'}'", 
			"'else'", "'while'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "INT", "REAL", "BOOL", "CHAR", "STRING", "NAME", 
			"WHITESPACE", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Eden.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EdenParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2099328L) != 0)) {
				{
				setState(36);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(34);
					decl();
					}
					break;
				case T__6:
				case T__10:
					{
					setState(35);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				attr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				func_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends Var_declContext {
		public List<TerminalNode> NAME() { return getTokens(EdenParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(EdenParser.NAME, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		try {
			_localctx = new VarDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(NAME);
			setState(47);
			match(T__0);
			setState(48);
			match(NAME);
			setState(49);
			match(T__1);
			setState(50);
			expr();
			setState(51);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttrContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EdenParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(NAME);
			setState(54);
			match(T__1);
			setState(55);
			expr();
			setState(56);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_callContext extends ParserRuleContext {
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	 
		public Func_callContext() { }
		public void copyFrom(Func_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends Func_callContext {
		public TerminalNode NAME() { return getToken(EdenParser.NAME, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public FuncCallContext(Func_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_call);
		int _la;
		try {
			_localctx = new FuncCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(NAME);
			setState(59);
			match(T__3);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0)) {
				{
				setState(60);
				param_list();
				}
			}

			setState(63);
			match(T__4);
			setState(64);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Param_listContext extends ParserRuleContext {
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
	 
		public Param_listContext() { }
		public void copyFrom(Param_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends Param_listContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ParamListContext(Param_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param_list);
		int _la;
		try {
			_localctx = new ParamListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			expr();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(67);
				match(T__5);
				setState(68);
				expr();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				if_stmt();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				while_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	 
		public If_stmtContext() { }
		public void copyFrom(If_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends If_stmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStmtContext(If_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_stmt);
		int _la;
		try {
			_localctx = new IfStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__6);
			setState(79);
			expr();
			setState(80);
			match(T__7);
			setState(81);
			block();
			setState(82);
			match(T__8);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(83);
				match(T__9);
				setState(84);
				match(T__7);
				setState(85);
				block();
				setState(86);
				match(T__8);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_stmtContext extends ParserRuleContext {
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
	 
		public While_stmtContext() { }
		public void copyFrom(While_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends While_stmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(While_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_stmt);
		try {
			_localctx = new WhileStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__10);
			setState(91);
			expr();
			setState(92);
			match(T__7);
			setState(93);
			block();
			setState(94);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Add_exprContext add_expr() {
			return getRuleContext(Add_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			add_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Add_exprContext extends ParserRuleContext {
		public Add_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expr; }
	 
		public Add_exprContext() { }
		public void copyFrom(Add_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends Add_exprContext {
		public List<Mul_exprContext> mul_expr() {
			return getRuleContexts(Mul_exprContext.class);
		}
		public Mul_exprContext mul_expr(int i) {
			return getRuleContext(Mul_exprContext.class,i);
		}
		public List<Add_opContext> add_op() {
			return getRuleContexts(Add_opContext.class);
		}
		public Add_opContext add_op(int i) {
			return getRuleContext(Add_opContext.class,i);
		}
		public AddExprContext(Add_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_exprContext add_expr() throws RecognitionException {
		Add_exprContext _localctx = new Add_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_add_expr);
		int _la;
		try {
			_localctx = new AddExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			mul_expr();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__12) {
				{
				{
				setState(99);
				add_op();
				setState(100);
				mul_expr();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mul_exprContext extends ParserRuleContext {
		public Mul_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_expr; }
	 
		public Mul_exprContext() { }
		public void copyFrom(Mul_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulExprContext extends Mul_exprContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Mul_opContext> mul_op() {
			return getRuleContexts(Mul_opContext.class);
		}
		public Mul_opContext mul_op(int i) {
			return getRuleContext(Mul_opContext.class,i);
		}
		public MulExprContext(Mul_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_exprContext mul_expr() throws RecognitionException {
		Mul_exprContext _localctx = new Mul_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mul_expr);
		int _la;
		try {
			_localctx = new MulExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			term();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__14) {
				{
				{
				setState(108);
				mul_op();
				setState(109);
				term();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Add_opContext extends ParserRuleContext {
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterAdd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitAdd_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitAdd_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mul_opContext extends ParserRuleContext {
		public Mul_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterMul_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitMul_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitMul_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_opContext mul_op() throws RecognitionException {
		Mul_opContext _localctx = new Mul_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mul_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EdenParser.NAME, 0); }
		public TerminalNode INT() { return getToken(EdenParser.INT, 0); }
		public TerminalNode REAL() { return getToken(EdenParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(EdenParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(EdenParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(EdenParser.STRING, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017{\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001%\b\u0001"+
		"\n\u0001\f\u0001(\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"-\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005>\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006F\b\u0006\n\u0006\f\u0006I\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007M\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bY\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000bg\b\u000b\n\u000b\f\u000bj\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\fp\b\f\n\f\f\fs\t\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e\u0000\u0003\u0001\u0000\f\r\u0001\u0000\u000e\u000f\u0001"+
		"\u0000\u0010\u0015t\u0000 \u0001\u0000\u0000\u0000\u0002&\u0001\u0000"+
		"\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000"+
		"\b5\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000\fB\u0001\u0000"+
		"\u0000\u0000\u000eL\u0001\u0000\u0000\u0000\u0010N\u0001\u0000\u0000\u0000"+
		"\u0012Z\u0001\u0000\u0000\u0000\u0014`\u0001\u0000\u0000\u0000\u0016b"+
		"\u0001\u0000\u0000\u0000\u0018k\u0001\u0000\u0000\u0000\u001at\u0001\u0000"+
		"\u0000\u0000\u001cv\u0001\u0000\u0000\u0000\u001ex\u0001\u0000\u0000\u0000"+
		" !\u0003\u0002\u0001\u0000!\u0001\u0001\u0000\u0000\u0000\"%\u0003\u0004"+
		"\u0002\u0000#%\u0003\u000e\u0007\u0000$\"\u0001\u0000\u0000\u0000$#\u0001"+
		"\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000)-\u0003\u0006\u0003\u0000*-\u0003\b\u0004\u0000+-\u0003\n"+
		"\u0005\u0000,)\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,+\u0001"+
		"\u0000\u0000\u0000-\u0005\u0001\u0000\u0000\u0000./\u0005\u0015\u0000"+
		"\u0000/0\u0005\u0001\u0000\u000001\u0005\u0015\u0000\u000012\u0005\u0002"+
		"\u0000\u000023\u0003\u0014\n\u000034\u0005\u0003\u0000\u00004\u0007\u0001"+
		"\u0000\u0000\u000056\u0005\u0015\u0000\u000067\u0005\u0002\u0000\u0000"+
		"78\u0003\u0014\n\u000089\u0005\u0003\u0000\u00009\t\u0001\u0000\u0000"+
		"\u0000:;\u0005\u0015\u0000\u0000;=\u0005\u0004\u0000\u0000<>\u0003\f\u0006"+
		"\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?@\u0005\u0005\u0000\u0000@A\u0005\u0003\u0000\u0000A\u000b"+
		"\u0001\u0000\u0000\u0000BG\u0003\u0014\n\u0000CD\u0005\u0006\u0000\u0000"+
		"DF\u0003\u0014\n\u0000EC\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\r\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000JM\u0003\u0010\b\u0000KM\u0003\u0012\t"+
		"\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\u000f\u0001"+
		"\u0000\u0000\u0000NO\u0005\u0007\u0000\u0000OP\u0003\u0014\n\u0000PQ\u0005"+
		"\b\u0000\u0000QR\u0003\u0002\u0001\u0000RX\u0005\t\u0000\u0000ST\u0005"+
		"\n\u0000\u0000TU\u0005\b\u0000\u0000UV\u0003\u0002\u0001\u0000VW\u0005"+
		"\t\u0000\u0000WY\u0001\u0000\u0000\u0000XS\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y\u0011\u0001\u0000\u0000\u0000Z[\u0005\u000b\u0000"+
		"\u0000[\\\u0003\u0014\n\u0000\\]\u0005\b\u0000\u0000]^\u0003\u0002\u0001"+
		"\u0000^_\u0005\t\u0000\u0000_\u0013\u0001\u0000\u0000\u0000`a\u0003\u0016"+
		"\u000b\u0000a\u0015\u0001\u0000\u0000\u0000bh\u0003\u0018\f\u0000cd\u0003"+
		"\u001a\r\u0000de\u0003\u0018\f\u0000eg\u0001\u0000\u0000\u0000fc\u0001"+
		"\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000i\u0017\u0001\u0000\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000kq\u0003\u001e\u000f\u0000lm\u0003\u001c\u000e\u0000mn\u0003"+
		"\u001e\u000f\u0000np\u0001\u0000\u0000\u0000ol\u0001\u0000\u0000\u0000"+
		"ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000r\u0019\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0007"+
		"\u0000\u0000\u0000u\u001b\u0001\u0000\u0000\u0000vw\u0007\u0001\u0000"+
		"\u0000w\u001d\u0001\u0000\u0000\u0000xy\u0007\u0002\u0000\u0000y\u001f"+
		"\u0001\u0000\u0000\u0000\t$&,=GLXhq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}