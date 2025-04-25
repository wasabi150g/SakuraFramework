// Generated from /Users/sushikouta/Desktop/SakuraFramework/src/main/resources/antlr4/GLSLParser.g4 by ANTLR 4.13.2
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
public class GLSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLOCK=1, LINE_COMMENT=2, BLOCK_COMMENT=3, WHITESPACE=4, LAYOUT=5, UNIFORM=6, 
		LPAREN=7, RPAREN=8, LOCATION=9, EQUAL=10, IN=11, OUT=12, SEMICOLON=13, 
		VOID=14, MAIN=15, STRING=16, BLOCK_END=17;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_layout = 2, RULE_uniform = 3, RULE_in = 4, 
		RULE_out = 5, RULE_main_function = 6, RULE_location = 7, RULE_type = 8, 
		RULE_name = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "layout", "uniform", "in", "out", "main_function", "location", 
			"type", "name"
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

	@Override
	public String getGrammarFileName() { return "GLSLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GLSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitProg(this);
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
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22624L) != 0)) {
				{
				{
				setState(20);
				line();
				}
				}
				setState(25);
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
	public static class LineContext extends ParserRuleContext {
		public LayoutContext layout() {
			return getRuleContext(LayoutContext.class,0);
		}
		public UniformContext uniform() {
			return getRuleContext(UniformContext.class,0);
		}
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public OutContext out() {
			return getRuleContext(OutContext.class,0);
		}
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LAYOUT:
				{
				setState(26);
				layout();
				}
				break;
			case UNIFORM:
				{
				setState(27);
				uniform();
				}
				break;
			case IN:
				{
				setState(28);
				in();
				}
				break;
			case OUT:
				{
				setState(29);
				out();
				}
				break;
			case VOID:
				{
				setState(30);
				main_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class LayoutContext extends ParserRuleContext {
		public TerminalNode LAYOUT() { return getToken(GLSLParser.LAYOUT, 0); }
		public TerminalNode LPAREN() { return getToken(GLSLParser.LPAREN, 0); }
		public TerminalNode LOCATION() { return getToken(GLSLParser.LOCATION, 0); }
		public TerminalNode EQUAL() { return getToken(GLSLParser.EQUAL, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GLSLParser.RPAREN, 0); }
		public TerminalNode IN() { return getToken(GLSLParser.IN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public LayoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterLayout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitLayout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitLayout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoutContext layout() throws RecognitionException {
		LayoutContext _localctx = new LayoutContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_layout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(LAYOUT);
			setState(34);
			match(LPAREN);
			setState(35);
			match(LOCATION);
			setState(36);
			match(EQUAL);
			setState(37);
			location();
			setState(38);
			match(RPAREN);
			setState(39);
			match(IN);
			setState(40);
			type();
			setState(41);
			name();
			setState(42);
			match(SEMICOLON);
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
	public static class UniformContext extends ParserRuleContext {
		public TerminalNode UNIFORM() { return getToken(GLSLParser.UNIFORM, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public UniformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterUniform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitUniform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitUniform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniformContext uniform() throws RecognitionException {
		UniformContext _localctx = new UniformContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_uniform);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(UNIFORM);
			setState(45);
			type();
			setState(46);
			name();
			setState(47);
			match(SEMICOLON);
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
	public static class InContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(GLSLParser.IN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(IN);
			setState(50);
			type();
			setState(51);
			name();
			setState(52);
			match(SEMICOLON);
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
	public static class OutContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(GLSLParser.OUT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_out);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(OUT);
			setState(55);
			type();
			setState(56);
			name();
			setState(57);
			match(SEMICOLON);
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
	public static class Main_functionContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(GLSLParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(GLSLParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(GLSLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GLSLParser.RPAREN, 0); }
		public TerminalNode BLOCK() { return getToken(GLSLParser.BLOCK, 0); }
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterMain_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitMain_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitMain_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(VOID);
			setState(60);
			match(MAIN);
			setState(61);
			match(LPAREN);
			setState(62);
			match(RPAREN);
			setState(63);
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
	public static class LocationContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GLSLParser.STRING, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GLSLParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
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
	public static class NameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GLSLParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0011H\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000B\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004!\u0001\u0000"+
		"\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b1\u0001\u0000\u0000\u0000"+
		"\n6\u0001\u0000\u0000\u0000\f;\u0001\u0000\u0000\u0000\u000eA\u0001\u0000"+
		"\u0000\u0000\u0010C\u0001\u0000\u0000\u0000\u0012E\u0001\u0000\u0000\u0000"+
		"\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000"+
		"\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0001\u0001\u0000\u0000\u0000"+
		"\u0019\u0017\u0001\u0000\u0000\u0000\u001a \u0003\u0004\u0002\u0000\u001b"+
		" \u0003\u0006\u0003\u0000\u001c \u0003\b\u0004\u0000\u001d \u0003\n\u0005"+
		"\u0000\u001e \u0003\f\u0006\u0000\u001f\u001a\u0001\u0000\u0000\u0000"+
		"\u001f\u001b\u0001\u0000\u0000\u0000\u001f\u001c\u0001\u0000\u0000\u0000"+
		"\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000"+
		" \u0003\u0001\u0000\u0000\u0000!\"\u0005\u0005\u0000\u0000\"#\u0005\u0007"+
		"\u0000\u0000#$\u0005\t\u0000\u0000$%\u0005\n\u0000\u0000%&\u0003\u000e"+
		"\u0007\u0000&\'\u0005\b\u0000\u0000\'(\u0005\u000b\u0000\u0000()\u0003"+
		"\u0010\b\u0000)*\u0003\u0012\t\u0000*+\u0005\r\u0000\u0000+\u0005\u0001"+
		"\u0000\u0000\u0000,-\u0005\u0006\u0000\u0000-.\u0003\u0010\b\u0000./\u0003"+
		"\u0012\t\u0000/0\u0005\r\u0000\u00000\u0007\u0001\u0000\u0000\u000012"+
		"\u0005\u000b\u0000\u000023\u0003\u0010\b\u000034\u0003\u0012\t\u00004"+
		"5\u0005\r\u0000\u00005\t\u0001\u0000\u0000\u000067\u0005\f\u0000\u0000"+
		"78\u0003\u0010\b\u000089\u0003\u0012\t\u00009:\u0005\r\u0000\u0000:\u000b"+
		"\u0001\u0000\u0000\u0000;<\u0005\u000e\u0000\u0000<=\u0005\u000f\u0000"+
		"\u0000=>\u0005\u0007\u0000\u0000>?\u0005\b\u0000\u0000?@\u0005\u0001\u0000"+
		"\u0000@\r\u0001\u0000\u0000\u0000AB\u0005\u0010\u0000\u0000B\u000f\u0001"+
		"\u0000\u0000\u0000CD\u0005\u0010\u0000\u0000D\u0011\u0001\u0000\u0000"+
		"\u0000EF\u0005\u0010\u0000\u0000F\u0013\u0001\u0000\u0000\u0000\u0002"+
		"\u0017\u001f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}