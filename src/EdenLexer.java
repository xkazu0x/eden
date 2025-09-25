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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, INT=20, NAME=21, WHITESPACE=22, LINE_COMMENT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "INT", "NAME", "WHITESPACE", "LINE_COMMENT"
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
		"\u0004\u0000\u0017\u0086\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013g\b\u0013\n\u0013\f\u0013j\t\u0013\u0003\u0013l\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0005\u0014p\b\u0014\n\u0014\f\u0014s\t\u0014\u0001"+
		"\u0015\u0004\u0015v\b\u0015\u000b\u0015\f\u0015w\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0080\b\u0016"+
		"\n\u0016\f\u0016\u0083\t\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"\u0001\u0000\u0006\u0001\u000019\u0001\u000009\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u008a\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000"+
		"\u0000\u00031\u0001\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u0007"+
		"5\u0001\u0000\u0000\u0000\t8\u0001\u0000\u0000\u0000\u000b;\u0001\u0000"+
		"\u0000\u0000\rB\u0001\u0000\u0000\u0000\u000fD\u0001\u0000\u0000\u0000"+
		"\u0011F\u0001\u0000\u0000\u0000\u0013H\u0001\u0000\u0000\u0000\u0015J"+
		"\u0001\u0000\u0000\u0000\u0017L\u0001\u0000\u0000\u0000\u0019O\u0001\u0000"+
		"\u0000\u0000\u001bQ\u0001\u0000\u0000\u0000\u001dX\u0001\u0000\u0000\u0000"+
		"\u001f[\u0001\u0000\u0000\u0000!]\u0001\u0000\u0000\u0000#_\u0001\u0000"+
		"\u0000\u0000%a\u0001\u0000\u0000\u0000\'k\u0001\u0000\u0000\u0000)m\u0001"+
		"\u0000\u0000\u0000+u\u0001\u0000\u0000\u0000-{\u0001\u0000\u0000\u0000"+
		"/0\u0005:\u0000\u00000\u0002\u0001\u0000\u0000\u000012\u0005;\u0000\u0000"+
		"2\u0004\u0001\u0000\u0000\u000034\u0005=\u0000\u00004\u0006\u0001\u0000"+
		"\u0000\u000056\u0005:\u0000\u000067\u0005=\u0000\u00007\b\u0001\u0000"+
		"\u0000\u000089\u0005:\u0000\u00009:\u0005:\u0000\u0000:\n\u0001\u0000"+
		"\u0000\u0000;<\u0005s\u0000\u0000<=\u0005t\u0000\u0000=>\u0005r\u0000"+
		"\u0000>?\u0005u\u0000\u0000?@\u0005c\u0000\u0000@A\u0005t\u0000\u0000"+
		"A\f\u0001\u0000\u0000\u0000BC\u0005{\u0000\u0000C\u000e\u0001\u0000\u0000"+
		"\u0000DE\u0005}\u0000\u0000E\u0010\u0001\u0000\u0000\u0000FG\u0005(\u0000"+
		"\u0000G\u0012\u0001\u0000\u0000\u0000HI\u0005)\u0000\u0000I\u0014\u0001"+
		"\u0000\u0000\u0000JK\u0005,\u0000\u0000K\u0016\u0001\u0000\u0000\u0000"+
		"LM\u0005-\u0000\u0000MN\u0005>\u0000\u0000N\u0018\u0001\u0000\u0000\u0000"+
		"OP\u0005.\u0000\u0000P\u001a\u0001\u0000\u0000\u0000QR\u0005r\u0000\u0000"+
		"RS\u0005e\u0000\u0000ST\u0005t\u0000\u0000TU\u0005u\u0000\u0000UV\u0005"+
		"r\u0000\u0000VW\u0005n\u0000\u0000W\u001c\u0001\u0000\u0000\u0000XY\u0005"+
		"i\u0000\u0000YZ\u0005f\u0000\u0000Z\u001e\u0001\u0000\u0000\u0000[\\\u0005"+
		"*\u0000\u0000\\ \u0001\u0000\u0000\u0000]^\u0005/\u0000\u0000^\"\u0001"+
		"\u0000\u0000\u0000_`\u0005+\u0000\u0000`$\u0001\u0000\u0000\u0000ab\u0005"+
		"-\u0000\u0000b&\u0001\u0000\u0000\u0000cl\u00050\u0000\u0000dh\u0007\u0000"+
		"\u0000\u0000eg\u0007\u0001\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kc\u0001\u0000\u0000"+
		"\u0000kd\u0001\u0000\u0000\u0000l(\u0001\u0000\u0000\u0000mq\u0007\u0002"+
		"\u0000\u0000np\u0007\u0003\u0000\u0000on\u0001\u0000\u0000\u0000ps\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"r*\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tv\u0007\u0004\u0000"+
		"\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0006"+
		"\u0015\u0000\u0000z,\u0001\u0000\u0000\u0000{|\u0005/\u0000\u0000|}\u0005"+
		"/\u0000\u0000}\u0081\u0001\u0000\u0000\u0000~\u0080\b\u0005\u0000\u0000"+
		"\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0084\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0006\u0016\u0000\u0000\u0085.\u0001\u0000\u0000\u0000\u0006\u0000"+
		"hkqw\u0081\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}