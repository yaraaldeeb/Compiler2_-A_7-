// Generated from D:/Antlr/AngularCompiler2/src/CssParser.g4 by ANTLR 4.13.2
package cssgen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CssParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, FROM=2, EXPORT=3, THIS=4, NEW=5, CHAR=6, STRING=7, INT=8, FLOAT=9, 
		ARRAY=10, ANY=11, FOR=12, FOREACH=13, OF=14, WHILE=15, DO=16, IF=17, ELSE_IF=18, 
		ELSE=19, TRUE=20, FALSE=21, LET=22, OPENCURLY=23, CLOSECURLY=24, OPENBRACKET=25, 
		CLOSEBRACKET=26, OPENSQUARE=27, CLOSESQUARE=28, COLON=29, DOUBLECOLON=30, 
		CEMMI=31, COMMA=32, AT=33, DOT=34, ASSIGN=35, LEFTARROW=36, RIGHTARROW=37, 
		LEFTARROWOREQUAL=38, RIGHTARROWOREQUAL=39, EQUAL=40, NOTEQUAL=41, MULT=42, 
		DIVIDE=43, PLUS=44, SUB=45, MARK=46, DOUBLQOUT=47, HASH=48, OR=49, NUMBER=50, 
		FLOATNUM=51, CHARACTER=52, WS=53, ID=54, STR=55, SYBOLS=56;
	public static final int
		RULE_cssFile = 0, RULE_cssStyles = 1, RULE_pseudoClass = 2, RULE_pseudoElement = 3, 
		RULE_body = 4, RULE_functioncall = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"cssFile", "cssStyles", "pseudoClass", "pseudoElement", "body", "functioncall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'from'", "'export'", "'this'", "'new'", "'char'", 
			"'string'", "'int'", "'float'", "'array'", "'any'", "'for'", "'foreach'", 
			"'of'", "'while'", "'do'", "'if'", "'elseif'", "'else'", "'true'", "'false'", 
			"'let'", "'{'", "'}'", "'('", "')'", "'['", "']'", "':'", "'::'", "';'", 
			"','", "'@'", "'.'", "'='", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'*'", "'/'", "'+'", "'-'", "'!'", "'\"'", "'#'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "FROM", "EXPORT", "THIS", "NEW", "CHAR", "STRING", "INT", 
			"FLOAT", "ARRAY", "ANY", "FOR", "FOREACH", "OF", "WHILE", "DO", "IF", 
			"ELSE_IF", "ELSE", "TRUE", "FALSE", "LET", "OPENCURLY", "CLOSECURLY", 
			"OPENBRACKET", "CLOSEBRACKET", "OPENSQUARE", "CLOSESQUARE", "COLON", 
			"DOUBLECOLON", "CEMMI", "COMMA", "AT", "DOT", "ASSIGN", "LEFTARROW", 
			"RIGHTARROW", "LEFTARROWOREQUAL", "RIGHTARROWOREQUAL", "EQUAL", "NOTEQUAL", 
			"MULT", "DIVIDE", "PLUS", "SUB", "MARK", "DOUBLQOUT", "HASH", "OR", "NUMBER", 
			"FLOATNUM", "CHARACTER", "WS", "ID", "STR", "SYBOLS"
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
	public String getGrammarFileName() { return "CssParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CssParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CssParser.EOF, 0); }
		public List<CssStylesContext> cssStyles() {
			return getRuleContexts(CssStylesContext.class);
		}
		public CssStylesContext cssStyles(int i) {
			return getRuleContext(CssStylesContext.class,i);
		}
		public CssFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCssFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCssFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFileContext cssFile() throws RecognitionException {
		CssFileContext _localctx = new CssFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cssFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18295890666061824L) != 0)) {
				{
				{
				setState(12);
				cssStyles();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
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
	public static class CssStylesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CssParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CssParser.ID, i);
		}
		public TerminalNode OPENCURLY() { return getToken(CssParser.OPENCURLY, 0); }
		public TerminalNode CLOSECURLY() { return getToken(CssParser.CLOSECURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CssParser.COMMA, i);
		}
		public PseudoClassContext pseudoClass() {
			return getRuleContext(PseudoClassContext.class,0);
		}
		public PseudoElementContext pseudoElement() {
			return getRuleContext(PseudoElementContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(CssParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CssParser.DOT, i);
		}
		public List<TerminalNode> HASH() { return getTokens(CssParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(CssParser.HASH, i);
		}
		public CssStylesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssStyles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCssStyles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCssStyles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssStyles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssStylesContext cssStyles() throws RecognitionException {
		CssStylesContext _localctx = new CssStylesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cssStyles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT || _la==HASH) {
				{
				setState(20);
				_la = _input.LA(1);
				if ( !(_la==DOT || _la==HASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(23);
			match(ID);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(24);
				match(COMMA);
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT || _la==HASH) {
					{
					setState(25);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==HASH) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(28);
				match(ID);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(34);
				pseudoClass();
				}
			}

			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOUBLECOLON) {
				{
				setState(37);
				pseudoElement();
				}
			}

			setState(40);
			match(OPENCURLY);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18295890666061824L) != 0)) {
				{
				{
				setState(41);
				body();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(CLOSECURLY);
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
	public static class PseudoClassContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public TerminalNode ID() { return getToken(CssParser.ID, 0); }
		public PseudoClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPseudoClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPseudoClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPseudoClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoClassContext pseudoClass() throws RecognitionException {
		PseudoClassContext _localctx = new PseudoClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pseudoClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(COLON);
			setState(50);
			match(ID);
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
	public static class PseudoElementContext extends ParserRuleContext {
		public TerminalNode DOUBLECOLON() { return getToken(CssParser.DOUBLECOLON, 0); }
		public TerminalNode ID() { return getToken(CssParser.ID, 0); }
		public PseudoElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPseudoElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPseudoElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPseudoElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoElementContext pseudoElement() throws RecognitionException {
		PseudoElementContext _localctx = new PseudoElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pseudoElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(DOUBLECOLON);
			setState(53);
			match(ID);
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
	public static class BodyContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CssParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CssParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public TerminalNode CEMMI() { return getToken(CssParser.CEMMI, 0); }
		public TerminalNode STR() { return getToken(CssParser.STR, 0); }
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public TerminalNode FLOATNUM() { return getToken(CssParser.FLOATNUM, 0); }
		public TerminalNode NUMBER() { return getToken(CssParser.NUMBER, 0); }
		public List<CssStylesContext> cssStyles() {
			return getRuleContexts(CssStylesContext.class);
		}
		public CssStylesContext cssStyles(int i) {
			return getRuleContext(CssStylesContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		int _la;
		try {
			int _alt;
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(55);
				match(ID);
				setState(56);
				match(COLON);
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(57);
					match(STR);
					}
					break;
				case 2:
					{
					setState(58);
					functioncall();
					}
					break;
				case 3:
					{
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(59);
						match(ID);
						}
						}
						setState(62); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ID );
					}
					break;
				case 4:
					{
					setState(64);
					match(FLOATNUM);
					}
					break;
				case 5:
					{
					setState(65);
					match(NUMBER);
					}
					break;
				}
				setState(68);
				match(CEMMI);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(69);
						cssStyles();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(72); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class FunctioncallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CssParser.ID, 0); }
		public TerminalNode OPENBRACKET() { return getToken(CssParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(CssParser.CLOSEBRACKET, 0); }
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			setState(77);
			match(OPENBRACKET);
			setState(78);
			match(CLOSEBRACKET);
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
		"\u0004\u00018Q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000\u0011"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001\u0016\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001\u0001"+
		"\u0005\u0001\u001e\b\u0001\n\u0001\f\u0001!\t\u0001\u0001\u0001\u0003"+
		"\u0001$\b\u0001\u0001\u0001\u0003\u0001\'\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001+\b\u0001\n\u0001\f\u0001.\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"=\b\u0004\u000b\u0004\f\u0004>\u0001\u0004\u0001\u0004\u0003\u0004C\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0004\u0004G\b\u0004\u000b\u0004\f\u0004"+
		"H\u0003\u0004K\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0001"+
		"\u0002\u0000\"\"00X\u0000\u000f\u0001\u0000\u0000\u0000\u0002\u0015\u0001"+
		"\u0000\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000"+
		"\u0000\bJ\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000\u0000\f\u000e\u0003"+
		"\u0002\u0001\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u0011\u0001\u0000"+
		"\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000"+
		"\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000"+
		"\u0000\u0012\u0013\u0005\u0000\u0000\u0001\u0013\u0001\u0001\u0000\u0000"+
		"\u0000\u0014\u0016\u0007\u0000\u0000\u0000\u0015\u0014\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000"+
		"\u0000\u0017\u001f\u00056\u0000\u0000\u0018\u001a\u0005 \u0000\u0000\u0019"+
		"\u001b\u0007\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c"+
		"\u001e\u00056\u0000\u0000\u001d\u0018\u0001\u0000\u0000\u0000\u001e!\u0001"+
		"\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"\"$\u0003\u0004\u0002\u0000#\"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$&\u0001\u0000\u0000\u0000%\'\u0003\u0006\u0003\u0000&%\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(,\u0005"+
		"\u0017\u0000\u0000)+\u0003\b\u0004\u0000*)\u0001\u0000\u0000\u0000+.\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u0018\u0000"+
		"\u00000\u0003\u0001\u0000\u0000\u000012\u0005\u001d\u0000\u000023\u0005"+
		"6\u0000\u00003\u0005\u0001\u0000\u0000\u000045\u0005\u001e\u0000\u0000"+
		"56\u00056\u0000\u00006\u0007\u0001\u0000\u0000\u000078\u00056\u0000\u0000"+
		"8B\u0005\u001d\u0000\u00009C\u00057\u0000\u0000:C\u0003\n\u0005\u0000"+
		";=\u00056\u0000\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?C\u0001\u0000\u0000"+
		"\u0000@C\u00053\u0000\u0000AC\u00052\u0000\u0000B9\u0001\u0000\u0000\u0000"+
		"B:\u0001\u0000\u0000\u0000B<\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DK\u0005\u001f"+
		"\u0000\u0000EG\u0003\u0002\u0001\u0000FE\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"+
		"IK\u0001\u0000\u0000\u0000J7\u0001\u0000\u0000\u0000JF\u0001\u0000\u0000"+
		"\u0000K\t\u0001\u0000\u0000\u0000LM\u00056\u0000\u0000MN\u0005\u0019\u0000"+
		"\u0000NO\u0005\u001a\u0000\u0000O\u000b\u0001\u0000\u0000\u0000\u000b"+
		"\u000f\u0015\u001a\u001f#&,>BHJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}