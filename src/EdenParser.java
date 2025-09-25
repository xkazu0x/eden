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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, INT=20, NAME=21, WHITESPACE=22, LINE_COMMENT=23;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_var_decl = 2, RULE_struct_decl = 3, 
		RULE_func_decl = 4, RULE_param_list = 5, RULE_return_list = 6, RULE_stmt = 7, 
		RULE_assign_stmt = 8, RULE_return_stmt = 9, RULE_if_stmt = 10, RULE_stmt_block = 11, 
		RULE_expr = 12, RULE_mul_op = 13, RULE_add_op = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "var_decl", "struct_decl", "func_decl", "param_list", 
			"return_list", "stmt", "assign_stmt", "return_stmt", "if_stmt", "stmt_block", 
			"expr", "mul_op", "add_op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'='", "':='", "'::'", "'struct'", "'{'", "'}'", 
			"'('", "')'", "','", "'->'", "'.'", "'return'", "'if'", "'*'", "'/'", 
			"'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "INT", "NAME", "WHITESPACE", 
			"LINE_COMMENT"
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
		public TerminalNode EOF() { return getToken(EdenParser.EOF, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(32);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(30);
					decl();
					}
					break;
				case 2:
					{
					setState(31);
					stmt();
					}
					break;
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2146304L) != 0) );
			setState(36);
			match(EOF);
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
		public Struct_declContext struct_decl() {
			return getRuleContext(Struct_declContext.class,0);
		}
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
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
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				struct_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				func_decl();
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
		public List<TerminalNode> NAME() { return getTokens(EdenParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(EdenParser.NAME, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(NAME);
				setState(44);
				match(T__0);
				setState(45);
				match(NAME);
				setState(46);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(NAME);
				setState(48);
				match(T__0);
				setState(49);
				match(NAME);
				setState(50);
				match(T__2);
				setState(51);
				expr(0);
				setState(52);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(NAME);
				setState(55);
				match(T__3);
				setState(56);
				expr(0);
				setState(57);
				match(T__1);
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
	public static class Struct_declContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EdenParser.NAME, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public Struct_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterStruct_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitStruct_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitStruct_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declContext struct_decl() throws RecognitionException {
		Struct_declContext _localctx = new Struct_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_struct_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(NAME);
			setState(62);
			match(T__4);
			setState(63);
			match(T__5);
			setState(64);
			match(T__6);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(65);
				var_decl();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(T__7);
			setState(72);
			match(T__1);
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
	public static class Func_declContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EdenParser.NAME, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public Return_listContext return_list() {
			return getRuleContext(Return_listContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitFunc_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitFunc_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(NAME);
			setState(75);
			match(T__4);
			setState(76);
			match(T__8);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(77);
				param_list();
				}
			}

			setState(80);
			match(T__9);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(81);
				return_list();
				}
			}

			setState(84);
			stmt_block();
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
		public List<TerminalNode> NAME() { return getTokens(EdenParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(EdenParser.NAME, i);
		}
		public List<Param_listContext> param_list() {
			return getRuleContexts(Param_listContext.class);
		}
		public Param_listContext param_list(int i) {
			return getRuleContext(Param_listContext.class,i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitParam_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(NAME);
			setState(87);
			match(T__0);
			setState(88);
			match(NAME);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					match(T__10);
					setState(90);
					param_list();
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class Return_listContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EdenParser.NAME, 0); }
		public Return_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterReturn_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitReturn_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitReturn_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_listContext return_list() throws RecognitionException {
		Return_listContext _localctx = new Return_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_return_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__11);
			setState(97);
			match(NAME);
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
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				assign_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				return_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				if_stmt();
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
	public static class Assign_stmtContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(EdenParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(EdenParser.NAME, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(NAME);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(106);
				match(T__12);
				setState(107);
				match(NAME);
				}
			}

			setState(110);
			match(T__2);
			setState(111);
			expr(0);
			setState(112);
			match(T__1);
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
	public static class Return_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__13);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3146240L) != 0)) {
				{
				setState(115);
				expr(0);
				}
			}

			setState(118);
			match(T__1);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__14);
			setState(121);
			expr(0);
			setState(122);
			stmt_block();
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
	public static class Stmt_blockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).enterStmt_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EdenListener ) ((EdenListener)listener).exitStmt_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdenVisitor ) return ((EdenVisitor<? extends T>)visitor).visitStmt_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_blockContext stmt_block() throws RecognitionException {
		Stmt_blockContext _localctx = new Stmt_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmt_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__6);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2146304L) != 0)) {
				{
				{
				setState(125);
				stmt();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(T__7);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NAME() { return getToken(EdenParser.NAME, 0); }
		public TerminalNode INT() { return getToken(EdenParser.INT, 0); }
		public Mul_opContext mul_op() {
			return getRuleContext(Mul_opContext.class,0);
		}
		public Add_opContext add_op() {
			return getRuleContext(Add_opContext.class,0);
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(134);
				match(T__8);
				setState(135);
				expr(0);
				setState(136);
				match(T__9);
				}
				break;
			case 2:
				{
				setState(138);
				match(NAME);
				setState(139);
				match(T__8);
				setState(140);
				expr(0);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(141);
					match(T__10);
					setState(142);
					expr(0);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(T__9);
				}
				break;
			case 3:
				{
				setState(150);
				match(NAME);
				}
				break;
			case 4:
				{
				setState(151);
				match(INT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(155);
						mul_op();
						setState(156);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(159);
						add_op();
						setState(160);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 26, RULE_mul_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
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
		enterRule(_localctx, 28, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017\u00ac\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0004\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003C\b\u0003"+
		"\n\u0003\f\u0003F\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004O\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004S\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\\\b\u0005"+
		"\n\u0005\f\u0005_\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007h\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0003\bm\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0003\tu\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u007f\b\u000b\n\u000b\f\u000b\u0082\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0090\b\f\n\f\f\f\u0093\t\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0099\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a3\b\f\n\f\f\f\u00a6"+
		"\t\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0001\u0018"+
		"\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u0000\u0002\u0001\u0000\u0010\u0011\u0001\u0000\u0012\u0013"+
		"\u00b2\u0000 \u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004"+
		";\u0001\u0000\u0000\u0000\u0006=\u0001\u0000\u0000\u0000\bJ\u0001\u0000"+
		"\u0000\u0000\nV\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000e"+
		"g\u0001\u0000\u0000\u0000\u0010i\u0001\u0000\u0000\u0000\u0012r\u0001"+
		"\u0000\u0000\u0000\u0014x\u0001\u0000\u0000\u0000\u0016|\u0001\u0000\u0000"+
		"\u0000\u0018\u0098\u0001\u0000\u0000\u0000\u001a\u00a7\u0001\u0000\u0000"+
		"\u0000\u001c\u00a9\u0001\u0000\u0000\u0000\u001e!\u0003\u0002\u0001\u0000"+
		"\u001f!\u0003\u000e\u0007\u0000 \u001e\u0001\u0000\u0000\u0000 \u001f"+
		"\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0005\u0000"+
		"\u0000\u0001%\u0001\u0001\u0000\u0000\u0000&*\u0003\u0004\u0002\u0000"+
		"\'*\u0003\u0006\u0003\u0000(*\u0003\b\u0004\u0000)&\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0003\u0001"+
		"\u0000\u0000\u0000+,\u0005\u0015\u0000\u0000,-\u0005\u0001\u0000\u0000"+
		"-.\u0005\u0015\u0000\u0000.<\u0005\u0002\u0000\u0000/0\u0005\u0015\u0000"+
		"\u000001\u0005\u0001\u0000\u000012\u0005\u0015\u0000\u000023\u0005\u0003"+
		"\u0000\u000034\u0003\u0018\f\u000045\u0005\u0002\u0000\u00005<\u0001\u0000"+
		"\u0000\u000067\u0005\u0015\u0000\u000078\u0005\u0004\u0000\u000089\u0003"+
		"\u0018\f\u00009:\u0005\u0002\u0000\u0000:<\u0001\u0000\u0000\u0000;+\u0001"+
		"\u0000\u0000\u0000;/\u0001\u0000\u0000\u0000;6\u0001\u0000\u0000\u0000"+
		"<\u0005\u0001\u0000\u0000\u0000=>\u0005\u0015\u0000\u0000>?\u0005\u0005"+
		"\u0000\u0000?@\u0005\u0006\u0000\u0000@D\u0005\u0007\u0000\u0000AC\u0003"+
		"\u0004\u0002\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000GH\u0005\b\u0000\u0000HI\u0005\u0002\u0000"+
		"\u0000I\u0007\u0001\u0000\u0000\u0000JK\u0005\u0015\u0000\u0000KL\u0005"+
		"\u0005\u0000\u0000LN\u0005\t\u0000\u0000MO\u0003\n\u0005\u0000NM\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PR\u0005\n\u0000\u0000QS\u0003\f\u0006\u0000RQ\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0003\u0016\u000b"+
		"\u0000U\t\u0001\u0000\u0000\u0000VW\u0005\u0015\u0000\u0000WX\u0005\u0001"+
		"\u0000\u0000X]\u0005\u0015\u0000\u0000YZ\u0005\u000b\u0000\u0000Z\\\u0003"+
		"\n\u0005\u0000[Y\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000]["+
		"\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u000b\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005\f\u0000\u0000ab\u0005\u0015"+
		"\u0000\u0000b\r\u0001\u0000\u0000\u0000ch\u0003\u0004\u0002\u0000dh\u0003"+
		"\u0010\b\u0000eh\u0003\u0012\t\u0000fh\u0003\u0014\n\u0000gc\u0001\u0000"+
		"\u0000\u0000gd\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001"+
		"\u0000\u0000\u0000h\u000f\u0001\u0000\u0000\u0000il\u0005\u0015\u0000"+
		"\u0000jk\u0005\r\u0000\u0000km\u0005\u0015\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005\u0003"+
		"\u0000\u0000op\u0003\u0018\f\u0000pq\u0005\u0002\u0000\u0000q\u0011\u0001"+
		"\u0000\u0000\u0000rt\u0005\u000e\u0000\u0000su\u0003\u0018\f\u0000ts\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vw\u0005\u0002\u0000\u0000w\u0013\u0001\u0000\u0000\u0000xy\u0005\u000f"+
		"\u0000\u0000yz\u0003\u0018\f\u0000z{\u0003\u0016\u000b\u0000{\u0015\u0001"+
		"\u0000\u0000\u0000|\u0080\u0005\u0007\u0000\u0000}\u007f\u0003\u000e\u0007"+
		"\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005\b\u0000\u0000\u0084\u0017\u0001\u0000\u0000\u0000\u0085\u0086\u0006"+
		"\f\uffff\uffff\u0000\u0086\u0087\u0005\t\u0000\u0000\u0087\u0088\u0003"+
		"\u0018\f\u0000\u0088\u0089\u0005\n\u0000\u0000\u0089\u0099\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0005\u0015\u0000\u0000\u008b\u008c\u0005\t\u0000"+
		"\u0000\u008c\u0091\u0003\u0018\f\u0000\u008d\u008e\u0005\u000b\u0000\u0000"+
		"\u008e\u0090\u0003\u0018\f\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090"+
		"\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0005\n\u0000\u0000\u0095\u0099"+
		"\u0001\u0000\u0000\u0000\u0096\u0099\u0005\u0015\u0000\u0000\u0097\u0099"+
		"\u0005\u0014\u0000\u0000\u0098\u0085\u0001\u0000\u0000\u0000\u0098\u008a"+
		"\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u00a4\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\n\u0006\u0000\u0000\u009b\u009c\u0003\u001a\r\u0000\u009c\u009d\u0003"+
		"\u0018\f\u0007\u009d\u00a3\u0001\u0000\u0000\u0000\u009e\u009f\n\u0005"+
		"\u0000\u0000\u009f\u00a0\u0003\u001c\u000e\u0000\u00a0\u00a1\u0003\u0018"+
		"\f\u0006\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u009a\u0001\u0000\u0000"+
		"\u0000\u00a2\u009e\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\u0019\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0007\u0000\u0000\u0000\u00a8\u001b\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0007\u0001\u0000\u0000\u00aa\u001d\u0001\u0000\u0000"+
		"\u0000\u0010 \");DNR]glt\u0080\u0091\u0098\u00a2\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}