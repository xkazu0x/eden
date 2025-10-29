// Generated from Eden.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EdenLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ADD_OP=4, MUL_OP=5, NUM=6, INT=7, REAL=8, BOOL=9, 
		NAME=10, WHITESPACE=11, LINE_COMMENT=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ADD_OP", "MUL_OP", "NUM", "INT", "REAL", "BOOL", 
			"NAME", "WHITESPACE", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ADD_OP", "MUL_OP", "NUM", "INT", "REAL", "BOOL", 
			"NAME", "WHITESPACE", "LINE_COMMENT"
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


	public EdenLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Eden.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\fp\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\'\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006,\b\u0006\n\u0006\f\u0006/\t\u0006\u0003\u0006"+
		"1\b\u0006\u0001\u0007\u0005\u00074\b\u0007\n\u0007\f\u00077\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0004\u0007;\b\u0007\u000b\u0007\f\u0007<\u0001\u0007"+
		"\u0004\u0007@\b\u0007\u000b\u0007\f\u0007A\u0001\u0007\u0001\u0007\u0005"+
		"\u0007F\b\u0007\n\u0007\f\u0007I\t\u0007\u0003\u0007K\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bV\b\b\u0001\t\u0001\t\u0005\tZ\b\t\n\t\f\t]\t\t\u0001\n\u0004\n`\b\n"+
		"\u000b\n\f\na\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000bj\b\u000b\n\u000b\f\u000bm\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0001\u0000\b\u0002\u0000++--\u0002\u0000**//\u0001\u000019\u0001\u0000"+
		"09\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u0002\u0000"+
		"\n\n\r\r|\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0001\u0019\u0001\u0000\u0000\u0000\u0003\u001b\u0001\u0000\u0000\u0000"+
		"\u0005\u001d\u0001\u0000\u0000\u0000\u0007\u001f\u0001\u0000\u0000\u0000"+
		"\t!\u0001\u0000\u0000\u0000\u000b&\u0001\u0000\u0000\u0000\r0\u0001\u0000"+
		"\u0000\u0000\u000fJ\u0001\u0000\u0000\u0000\u0011U\u0001\u0000\u0000\u0000"+
		"\u0013W\u0001\u0000\u0000\u0000\u0015_\u0001\u0000\u0000\u0000\u0017e"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0005:\u0000\u0000\u001a\u0002\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0005=\u0000\u0000\u001c\u0004\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005;\u0000\u0000\u001e\u0006\u0001\u0000\u0000"+
		"\u0000\u001f \u0007\u0000\u0000\u0000 \b\u0001\u0000\u0000\u0000!\"\u0007"+
		"\u0001\u0000\u0000\"\n\u0001\u0000\u0000\u0000#\'\u0003\r\u0006\u0000"+
		"$\'\u0003\u000f\u0007\u0000%\'\u0003\u0011\b\u0000&#\u0001\u0000\u0000"+
		"\u0000&$\u0001\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'\f\u0001\u0000"+
		"\u0000\u0000(1\u00050\u0000\u0000)-\u0007\u0002\u0000\u0000*,\u0007\u0003"+
		"\u0000\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u00000(\u0001\u0000\u0000\u00000)\u0001\u0000\u0000"+
		"\u00001\u000e\u0001\u0000\u0000\u000024\u0007\u0003\u0000\u000032\u0001"+
		"\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u00008:\u0005.\u0000\u00009;\u0007\u0003\u0000\u0000:9\u0001\u0000\u0000"+
		"\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=K\u0001\u0000\u0000\u0000>@\u0007\u0003\u0000\u0000?>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CG\u0005.\u0000\u0000"+
		"DF\u0007\u0003\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HK\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000J5\u0001\u0000\u0000\u0000J?\u0001"+
		"\u0000\u0000\u0000K\u0010\u0001\u0000\u0000\u0000LM\u0005t\u0000\u0000"+
		"MN\u0005r\u0000\u0000NO\u0005u\u0000\u0000OV\u0005e\u0000\u0000PQ\u0005"+
		"f\u0000\u0000QR\u0005a\u0000\u0000RS\u0005l\u0000\u0000ST\u0005s\u0000"+
		"\u0000TV\u0005e\u0000\u0000UL\u0001\u0000\u0000\u0000UP\u0001\u0000\u0000"+
		"\u0000V\u0012\u0001\u0000\u0000\u0000W[\u0007\u0004\u0000\u0000XZ\u0007"+
		"\u0005\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0014\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000^`\u0007\u0006\u0000\u0000_^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0006\n\u0000\u0000"+
		"d\u0016\u0001\u0000\u0000\u0000ef\u0005/\u0000\u0000fg\u0005/\u0000\u0000"+
		"gk\u0001\u0000\u0000\u0000hj\b\u0007\u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0006\u000b"+
		"\u0000\u0000o\u0018\u0001\u0000\u0000\u0000\r\u0000&-05<AGJU[ak\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}