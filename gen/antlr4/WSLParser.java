// Generated from /Users/sushikouta/Desktop/SakuraFramework/src/main/resources/antlr4/WSLParser.g4 by ANTLR 4.13.2
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class WSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLOCK=1, LINE_COMMENT=2, BLOCK_COMMENT=3, WHITESPACE=4, DEFINE=5, VERSION=6, 
		VERTEX=7, FRAGMENT=8, STRING=9, BLOCK_END=10;
	public static final int
		RULE_prog = 0, RULE_version = 1, RULE_define_vert = 2, RULE_define_frag = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "version", "define_vert", "define_frag"
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

	@Override
	public String getGrammarFileName() { return "WSLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public List<TerminalNode> DEFINE() { return getTokens(WSLParser.DEFINE); }
		public TerminalNode DEFINE(int i) {
			return getToken(WSLParser.DEFINE, i);
		}
		public List<Define_vertContext> define_vert() {
			return getRuleContexts(Define_vertContext.class);
		}
		public Define_vertContext define_vert(int i) {
			return getRuleContext(Define_vertContext.class,i);
		}
		public List<Define_fragContext> define_frag() {
			return getRuleContexts(Define_fragContext.class);
		}
		public Define_fragContext define_frag(int i) {
			return getRuleContext(Define_fragContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSLParserListener ) ((WSLParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSLParserListener ) ((WSLParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSLParserVisitor ) return ((WSLParserVisitor<? extends T>)visitor).visitProg(this);
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
			setState(8);
			version();
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFINE) {
				{
				{
				{
				setState(9);
				match(DEFINE);
				setState(12);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VERTEX:
					{
					setState(10);
					define_vert();
					}
					break;
				case FRAGMENT:
					{
					setState(11);
					define_frag();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				}
				setState(18);
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
	public static class VersionContext extends ParserRuleContext {
		public TerminalNode VERSION() { return getToken(WSLParser.VERSION, 0); }
		public TerminalNode STRING() { return getToken(WSLParser.STRING, 0); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSLParserListener ) ((WSLParserListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSLParserListener ) ((WSLParserListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSLParserVisitor ) return ((WSLParserVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(VERSION);
			setState(20);
			match(STRING);
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
	public static class Define_vertContext extends ParserRuleContext {
		public TerminalNode VERTEX() { return getToken(WSLParser.VERTEX, 0); }
		public TerminalNode BLOCK() { return getToken(WSLParser.BLOCK, 0); }
		public Define_vertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_vert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSLParserListener ) ((WSLParserListener)listener).enterDefine_vert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSLParserListener ) ((WSLParserListener)listener).exitDefine_vert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSLParserVisitor ) return ((WSLParserVisitor<? extends T>)visitor).visitDefine_vert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_vertContext define_vert() throws RecognitionException {
		Define_vertContext _localctx = new Define_vertContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_define_vert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(VERTEX);
			setState(23);
			match(BLOCK);
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
	public static class Define_fragContext extends ParserRuleContext {
		public TerminalNode FRAGMENT() { return getToken(WSLParser.FRAGMENT, 0); }
		public TerminalNode BLOCK() { return getToken(WSLParser.BLOCK, 0); }
		public Define_fragContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_frag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSLParserListener ) ((WSLParserListener)listener).enterDefine_frag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSLParserListener ) ((WSLParserListener)listener).exitDefine_frag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSLParserVisitor ) return ((WSLParserVisitor<? extends T>)visitor).visitDefine_frag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_fragContext define_frag() throws RecognitionException {
		Define_fragContext _localctx = new Define_fragContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_define_frag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(FRAGMENT);
			setState(26);
			match(BLOCK);
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
		"\u0004\u0001\n\u001d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\r\b\u0000\u0005\u0000\u000f\b\u0000\n\u0000"+
		"\f\u0000\u0012\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0000\u001a\u0000\b\u0001"+
		"\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000\u0000\u0004\u0016\u0001"+
		"\u0000\u0000\u0000\u0006\u0019\u0001\u0000\u0000\u0000\b\u0010\u0003\u0002"+
		"\u0001\u0000\t\f\u0005\u0005\u0000\u0000\n\r\u0003\u0004\u0002\u0000\u000b"+
		"\r\u0003\u0006\u0003\u0000\f\n\u0001\u0000\u0000\u0000\f\u000b\u0001\u0000"+
		"\u0000\u0000\r\u000f\u0001\u0000\u0000\u0000\u000e\t\u0001\u0000\u0000"+
		"\u0000\u000f\u0012\u0001\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000"+
		"\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0001\u0001\u0000\u0000"+
		"\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0006\u0000"+
		"\u0000\u0014\u0015\u0005\t\u0000\u0000\u0015\u0003\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0005\u0007\u0000\u0000\u0017\u0018\u0005\u0001\u0000\u0000"+
		"\u0018\u0005\u0001\u0000\u0000\u0000\u0019\u001a\u0005\b\u0000\u0000\u001a"+
		"\u001b\u0005\u0001\u0000\u0000\u001b\u0007\u0001\u0000\u0000\u0000\u0002"+
		"\f\u0010";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}