// Generated from /Users/sushikouta/Desktop/SakuraFramework/src/main/resources/antlr4/GLSLLexer.g4 by ANTLR 4.13.2
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
public class GLSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLOCK=1, LINE_COMMENT=2, BLOCK_COMMENT=3, WHITESPACE=4, LAYOUT=5, UNIFORM=6, 
		LPAREN=7, RPAREN=8, LOCATION=9, EQUAL=10, IN=11, OUT=12, SEMICOLON=13, 
		VOID=14, MAIN=15, STRING=16, BLOCK_END=17;
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
			"LINE_COMMENT", "BLOCK_COMMENT", "BLOCK_START", "WHITESPACE", "LAYOUT", 
			"UNIFORM", "LPAREN", "RPAREN", "LOCATION", "EQUAL", "IN", "OUT", "SEMICOLON", 
			"VOID", "MAIN", "STRING", "BLOCK_OPEN", "BLOCK_END", "BLOCK_CONTENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'layout'", "'uniform'", "'('", "')'", 
			"'location'", "'='", "'in'", "'out'", "';'", "'void'", "'main'", null, 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLOCK", "LINE_COMMENT", "BLOCK_COMMENT", "WHITESPACE", "LAYOUT", 
			"UNIFORM", "LPAREN", "RPAREN", "LOCATION", "EQUAL", "IN", "OUT", "SEMICOLON", 
			"VOID", "MAIN", "STRING", "BLOCK_END"
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

	public GLSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GLSLLexer.g4"; }

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
		case 16:
			BLOCK_OPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
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
		"\u0004\u0000\u0011\u0090\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000"+
		"\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003"+
		"\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006"+
		"\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002"+
		"\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002"+
		"\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002"+
		"\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000-\b\u0000\n\u0000\f\u00000\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u00018\b\u0001\n\u0001\f\u0001;\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003I\b\u0003\u000b"+
		"\u0003\f\u0003J\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u0081"+
		"\b\u000f\u000b\u000f\f\u000f\u0082\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u00019\u0000\u0013\u0002\u0002\u0004"+
		"\u0003\u0006\u0000\b\u0004\n\u0005\f\u0006\u000e\u0007\u0010\b\u0012\t"+
		"\u0014\n\u0016\u000b\u0018\f\u001a\r\u001c\u000e\u001e\u000f \u0010\""+
		"\u0000$\u0011&\u0000\u0002\u0000\u0001\u0003\u0002\u0000\n\n\r\r\u0003"+
		"\u0000\t\n\r\r  \u0004\u000009AZ__az\u0092\u0000\u0002\u0001\u0000\u0000"+
		"\u0000\u0000\u0004\u0001\u0000\u0000\u0000\u0000\u0006\u0001\u0000\u0000"+
		"\u0000\u0000\b\u0001\u0000\u0000\u0000\u0000\n\u0001\u0000\u0000\u0000"+
		"\u0000\f\u0001\u0000\u0000\u0000\u0000\u000e\u0001\u0000\u0000\u0000\u0000"+
		"\u0010\u0001\u0000\u0000\u0000\u0000\u0012\u0001\u0000\u0000\u0000\u0000"+
		"\u0014\u0001\u0000\u0000\u0000\u0000\u0016\u0001\u0000\u0000\u0000\u0000"+
		"\u0018\u0001\u0000\u0000\u0000\u0000\u001a\u0001\u0000\u0000\u0000\u0000"+
		"\u001c\u0001\u0000\u0000\u0000\u0000\u001e\u0001\u0000\u0000\u0000\u0000"+
		" \u0001\u0000\u0000\u0000\u0001\"\u0001\u0000\u0000\u0000\u0001$\u0001"+
		"\u0000\u0000\u0000\u0001&\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000"+
		"\u0000\u00043\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000\b"+
		"H\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000"+
		"\u0000\u000e]\u0001\u0000\u0000\u0000\u0010_\u0001\u0000\u0000\u0000\u0012"+
		"a\u0001\u0000\u0000\u0000\u0014j\u0001\u0000\u0000\u0000\u0016l\u0001"+
		"\u0000\u0000\u0000\u0018o\u0001\u0000\u0000\u0000\u001as\u0001\u0000\u0000"+
		"\u0000\u001cu\u0001\u0000\u0000\u0000\u001ez\u0001\u0000\u0000\u0000 "+
		"\u0080\u0001\u0000\u0000\u0000\"\u0084\u0001\u0000\u0000\u0000$\u0089"+
		"\u0001\u0000\u0000\u0000&\u008c\u0001\u0000\u0000\u0000()\u0005/\u0000"+
		"\u0000)*\u0005/\u0000\u0000*.\u0001\u0000\u0000\u0000+-\b\u0000\u0000"+
		"\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000012\u0006\u0000\u0000\u00002\u0003\u0001\u0000\u0000"+
		"\u000034\u0005/\u0000\u000045\u0005*\u0000\u000059\u0001\u0000\u0000\u0000"+
		"68\t\u0000\u0000\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000<=\u0005*\u0000\u0000=>\u0005/\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?@\u0006\u0001\u0000\u0000@\u0005\u0001\u0000"+
		"\u0000\u0000AB\u0005{\u0000\u0000BC\u0006\u0002\u0001\u0000CD\u0001\u0000"+
		"\u0000\u0000DE\u0006\u0002\u0002\u0000EF\u0006\u0002\u0003\u0000F\u0007"+
		"\u0001\u0000\u0000\u0000GI\u0007\u0001\u0000\u0000HG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0006\u0003\u0000\u0000M\t\u0001"+
		"\u0000\u0000\u0000NO\u0005l\u0000\u0000OP\u0005a\u0000\u0000PQ\u0005y"+
		"\u0000\u0000QR\u0005o\u0000\u0000RS\u0005u\u0000\u0000ST\u0005t\u0000"+
		"\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0005u\u0000\u0000VW\u0005n\u0000"+
		"\u0000WX\u0005i\u0000\u0000XY\u0005f\u0000\u0000YZ\u0005o\u0000\u0000"+
		"Z[\u0005r\u0000\u0000[\\\u0005m\u0000\u0000\\\r\u0001\u0000\u0000\u0000"+
		"]^\u0005(\u0000\u0000^\u000f\u0001\u0000\u0000\u0000_`\u0005)\u0000\u0000"+
		"`\u0011\u0001\u0000\u0000\u0000ab\u0005l\u0000\u0000bc\u0005o\u0000\u0000"+
		"cd\u0005c\u0000\u0000de\u0005a\u0000\u0000ef\u0005t\u0000\u0000fg\u0005"+
		"i\u0000\u0000gh\u0005o\u0000\u0000hi\u0005n\u0000\u0000i\u0013\u0001\u0000"+
		"\u0000\u0000jk\u0005=\u0000\u0000k\u0015\u0001\u0000\u0000\u0000lm\u0005"+
		"i\u0000\u0000mn\u0005n\u0000\u0000n\u0017\u0001\u0000\u0000\u0000op\u0005"+
		"o\u0000\u0000pq\u0005u\u0000\u0000qr\u0005t\u0000\u0000r\u0019\u0001\u0000"+
		"\u0000\u0000st\u0005;\u0000\u0000t\u001b\u0001\u0000\u0000\u0000uv\u0005"+
		"v\u0000\u0000vw\u0005o\u0000\u0000wx\u0005i\u0000\u0000xy\u0005d\u0000"+
		"\u0000y\u001d\u0001\u0000\u0000\u0000z{\u0005m\u0000\u0000{|\u0005a\u0000"+
		"\u0000|}\u0005i\u0000\u0000}~\u0005n\u0000\u0000~\u001f\u0001\u0000\u0000"+
		"\u0000\u007f\u0081\u0007\u0002\u0000\u0000\u0080\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083!\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005{\u0000\u0000\u0085\u0086\u0006\u0010\u0004\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0006\u0010\u0002\u0000\u0088"+
		"#\u0001\u0000\u0000\u0000\u0089\u008a\u0005}\u0000\u0000\u008a\u008b\u0006"+
		"\u0011\u0005\u0000\u008b%\u0001\u0000\u0000\u0000\u008c\u008d\t\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0006\u0012"+
		"\u0002\u0000\u008f\'\u0001\u0000\u0000\u0000\u0006\u0000\u0001.9J\u0082"+
		"\u0006\u0006\u0000\u0000\u0001\u0002\u0000\u0003\u0000\u0000\u0005\u0001"+
		"\u0000\u0001\u0010\u0001\u0001\u0011\u0002";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}