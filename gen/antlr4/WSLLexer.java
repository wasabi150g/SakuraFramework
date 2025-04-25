// Generated from /Users/sushikouta/Desktop/SakuraFramework/src/main/resources/antlr4/WSLLexer.g4 by ANTLR 4.13.2
package antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class WSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLOCK=1, LINE_COMMENT=2, BLOCK_COMMENT=3, WHITESPACE=4, DEFINE=5, VERSION=6, 
		VERTEX=7, FRAGMENT=8, STRING=9, BLOCK_END=10;
	public static final int
		BRACE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "BRACE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LINE_COMMENT", "BLOCK_COMMENT", "BLOCK_START", "WHITESPACE", "DEFINE", 
			"VERSION", "VERTEX", "FRAGMENT", "STRING", "BLOCK_OPEN", "BLOCK_END", 
			"BLOCK_CONTENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'define'", "'version'", "'vertex'", "'fragment'", 
			null, "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLOCK", "LINE_COMMENT", "BLOCK_COMMENT", "WHITESPACE", "DEFINE", 
			"VERSION", "VERTEX", "FRAGMENT", "STRING", "BLOCK_END"
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

	 private int braceDepth = 0; 

	public WSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WSLLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2:
			BLOCK_START_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			BLOCK_OPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			BLOCK_END_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void BLOCK_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 braceDepth = 1; 
			break;
		}
	}
	private void BLOCK_OPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 braceDepth++; 
			break;
		}
	}
	private void BLOCK_END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			    braceDepth--;

			    if (braceDepth == 0) {
			        popMode();
			        setType(BLOCK);
			    } else {
			        more();
			    }

			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\np\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007"+
		"\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n"+
		"\u0007\n\u0002\u000b\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"*\b\u0001\n\u0001\f\u0001-\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003;\b\u0003\u000b\u0003"+
		"\f\u0003<\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\ba\b\b"+
		"\u000b\b\f\bb\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001+\u0000"+
		"\f\u0002\u0002\u0004\u0003\u0006\u0000\b\u0004\n\u0005\f\u0006\u000e\u0007"+
		"\u0010\b\u0012\t\u0014\u0000\u0016\n\u0018\u0000\u0002\u0000\u0001\u0003"+
		"\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u0004\u000009AZ__azr\u0000"+
		"\u0002\u0001\u0000\u0000\u0000\u0000\u0004\u0001\u0000\u0000\u0000\u0000"+
		"\u0006\u0001\u0000\u0000\u0000\u0000\b\u0001\u0000\u0000\u0000\u0000\n"+
		"\u0001\u0000\u0000\u0000\u0000\f\u0001\u0000\u0000\u0000\u0000\u000e\u0001"+
		"\u0000\u0000\u0000\u0000\u0010\u0001\u0000\u0000\u0000\u0000\u0012\u0001"+
		"\u0000\u0000\u0000\u0001\u0014\u0001\u0000\u0000\u0000\u0001\u0016\u0001"+
		"\u0000\u0000\u0000\u0001\u0018\u0001\u0000\u0000\u0000\u0002\u001a\u0001"+
		"\u0000\u0000\u0000\u0004%\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000"+
		"\u0000\b:\u0001\u0000\u0000\u0000\n@\u0001\u0000\u0000\u0000\fG\u0001"+
		"\u0000\u0000\u0000\u000eO\u0001\u0000\u0000\u0000\u0010V\u0001\u0000\u0000"+
		"\u0000\u0012`\u0001\u0000\u0000\u0000\u0014d\u0001\u0000\u0000\u0000\u0016"+
		"i\u0001\u0000\u0000\u0000\u0018l\u0001\u0000\u0000\u0000\u001a\u001b\u0005"+
		"/\u0000\u0000\u001b\u001c\u0005/\u0000\u0000\u001c \u0001\u0000\u0000"+
		"\u0000\u001d\u001f\b\u0000\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000"+
		"\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"#$\u0006\u0000\u0000\u0000$\u0003\u0001\u0000\u0000\u0000%&\u0005/\u0000"+
		"\u0000&\'\u0005*\u0000\u0000\'+\u0001\u0000\u0000\u0000(*\t\u0000\u0000"+
		"\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000./\u0005*\u0000\u0000/0\u0005/\u0000\u000001\u0001\u0000"+
		"\u0000\u000012\u0006\u0001\u0000\u00002\u0005\u0001\u0000\u0000\u0000"+
		"34\u0005{\u0000\u000045\u0006\u0002\u0001\u000056\u0001\u0000\u0000\u0000"+
		"67\u0006\u0002\u0002\u000078\u0006\u0002\u0003\u00008\u0007\u0001\u0000"+
		"\u0000\u00009;\u0007\u0001\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>?\u0006\u0003\u0000\u0000?\t\u0001\u0000\u0000"+
		"\u0000@A\u0005d\u0000\u0000AB\u0005e\u0000\u0000BC\u0005f\u0000\u0000"+
		"CD\u0005i\u0000\u0000DE\u0005n\u0000\u0000EF\u0005e\u0000\u0000F\u000b"+
		"\u0001\u0000\u0000\u0000GH\u0005v\u0000\u0000HI\u0005e\u0000\u0000IJ\u0005"+
		"r\u0000\u0000JK\u0005s\u0000\u0000KL\u0005i\u0000\u0000LM\u0005o\u0000"+
		"\u0000MN\u0005n\u0000\u0000N\r\u0001\u0000\u0000\u0000OP\u0005v\u0000"+
		"\u0000PQ\u0005e\u0000\u0000QR\u0005r\u0000\u0000RS\u0005t\u0000\u0000"+
		"ST\u0005e\u0000\u0000TU\u0005x\u0000\u0000U\u000f\u0001\u0000\u0000\u0000"+
		"VW\u0005f\u0000\u0000WX\u0005r\u0000\u0000XY\u0005a\u0000\u0000YZ\u0005"+
		"g\u0000\u0000Z[\u0005m\u0000\u0000[\\\u0005e\u0000\u0000\\]\u0005n\u0000"+
		"\u0000]^\u0005t\u0000\u0000^\u0011\u0001\u0000\u0000\u0000_a\u0007\u0002"+
		"\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u0013\u0001\u0000\u0000"+
		"\u0000de\u0005{\u0000\u0000ef\u0006\t\u0004\u0000fg\u0001\u0000\u0000"+
		"\u0000gh\u0006\t\u0002\u0000h\u0015\u0001\u0000\u0000\u0000ij\u0005}\u0000"+
		"\u0000jk\u0006\n\u0005\u0000k\u0017\u0001\u0000\u0000\u0000lm\t\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0006\u000b\u0002\u0000o\u0019"+
		"\u0001\u0000\u0000\u0000\u0006\u0000\u0001 +<b\u0006\u0006\u0000\u0000"+
		"\u0001\u0002\u0000\u0003\u0000\u0000\u0005\u0001\u0000\u0001\t\u0001\u0001"+
		"\n\u0002";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}