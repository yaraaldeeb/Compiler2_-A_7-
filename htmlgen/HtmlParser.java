// Generated from D:/Antlr/AngularCompiler2/src/HtmlParser.g4 by ANTLR 4.13.2
package htmlgen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HtmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, FROM=2, EXPORT=3, THIS=4, NEW=5, CHAR=6, STRING=7, INT=8, FLOAT=9, 
		ARRAY=10, ANY=11, FOR=12, FOREACH=13, OF=14, WHILE=15, DO=16, IF=17, ELSE_IF=18, 
		ELSE=19, TRUE=20, FALSE=21, LET=22, VAR=23, CONST=24, NUM=25, NULL=26, 
		BOOLEAN=27, OPENCURLY=28, CLOSECURLY=29, OPENBRACKET=30, CLOSEBRACKET=31, 
		OPENSQUARE=32, CLOSESQUARE=33, COLON=34, CEMMI=35, COMMA=36, AT=37, DOT=38, 
		ASSIGN=39, LEFTARROW=40, RIGHTARROW=41, LEFTARROWOREQUAL=42, RIGHTARROWOREQUAL=43, 
		EQUAL=44, NOTEQUAL=45, MULT=46, DIVIDE=47, PLUS=48, PLUSPLUS=49, SUB=50, 
		SUBSUB=51, MARK=52, DOUBLQOUT=53, HASH=54, ARROW=55, QUISTION=56, NUMBER=57, 
		FLOATNUM=58, CHARACTER=59, WS=60, ID=61, STR=62, SYBOLS=63;
	public static final int
		RULE_html = 0, RULE_tags = 1, RULE_selfClosingTag = 2, RULE_normalTag = 3, 
		RULE_attributes = 4, RULE_value = 5, RULE_event = 6, RULE_var = 7, RULE_tagBody = 8, 
		RULE_enterpolation = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"html", "tags", "selfClosingTag", "normalTag", "attributes", "value", 
			"event", "var", "tagBody", "enterpolation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'from'", "'export'", "'this'", "'new'", "'char'", 
			"'string'", "'int'", "'float'", "'array'", "'any'", "'for'", "'foreach'", 
			"'of'", "'while'", "'do'", "'if'", "'elseif'", "'else'", "'true'", "'false'", 
			"'let'", "'var'", "'const'", "'number'", "'null'", "'boolean'", "'{'", 
			"'}'", "'('", "')'", "'['", "']'", "':'", "';'", "','", "'@'", "'.'", 
			"'='", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'*'", "'/'", "'+'", 
			"'++'", "'-'", "'--'", "'!'", "'\"'", "'#'", "'=>'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "FROM", "EXPORT", "THIS", "NEW", "CHAR", "STRING", "INT", 
			"FLOAT", "ARRAY", "ANY", "FOR", "FOREACH", "OF", "WHILE", "DO", "IF", 
			"ELSE_IF", "ELSE", "TRUE", "FALSE", "LET", "VAR", "CONST", "NUM", "NULL", 
			"BOOLEAN", "OPENCURLY", "CLOSECURLY", "OPENBRACKET", "CLOSEBRACKET", 
			"OPENSQUARE", "CLOSESQUARE", "COLON", "CEMMI", "COMMA", "AT", "DOT", 
			"ASSIGN", "LEFTARROW", "RIGHTARROW", "LEFTARROWOREQUAL", "RIGHTARROWOREQUAL", 
			"EQUAL", "NOTEQUAL", "MULT", "DIVIDE", "PLUS", "PLUSPLUS", "SUB", "SUBSUB", 
			"MARK", "DOUBLQOUT", "HASH", "ARROW", "QUISTION", "NUMBER", "FLOATNUM", 
			"CHARACTER", "WS", "ID", "STR", "SYBOLS"
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
	public String getGrammarFileName() { return "HtmlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HtmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HtmlParser.EOF, 0); }
		public List<TagsContext> tags() {
			return getRuleContexts(TagsContext.class);
		}
		public TagsContext tags(int i) {
			return getRuleContext(TagsContext.class,i);
		}
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_html);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTARROW) {
				{
				{
				setState(20);
				tags();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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
	public static class TagsContext extends ParserRuleContext {
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public NormalTagContext normalTag() {
			return getRuleContext(NormalTagContext.class,0);
		}
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitTags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitTags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tags);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				selfClosingTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				normalTag();
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
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode LEFTARROW() { return getToken(HtmlParser.LEFTARROW, 0); }
		public TerminalNode ID() { return getToken(HtmlParser.ID, 0); }
		public TerminalNode RIGHTARROW() { return getToken(HtmlParser.RIGHTARROW, 0); }
		public TerminalNode MARK() { return getToken(HtmlParser.MARK, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(HtmlParser.DIVIDE, 0); }
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(LEFTARROW);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MARK) {
				{
				setState(33);
				match(MARK);
				}
			}

			setState(36);
			match(ID);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305913383326580736L) != 0)) {
				{
				{
				setState(37);
				attributes();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIVIDE) {
				{
				setState(43);
				match(DIVIDE);
				}
			}

			setState(46);
			match(RIGHTARROW);
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
	public static class NormalTagContext extends ParserRuleContext {
		public List<TerminalNode> LEFTARROW() { return getTokens(HtmlParser.LEFTARROW); }
		public TerminalNode LEFTARROW(int i) {
			return getToken(HtmlParser.LEFTARROW, i);
		}
		public List<TerminalNode> ID() { return getTokens(HtmlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HtmlParser.ID, i);
		}
		public List<TerminalNode> RIGHTARROW() { return getTokens(HtmlParser.RIGHTARROW); }
		public TerminalNode RIGHTARROW(int i) {
			return getToken(HtmlParser.RIGHTARROW, i);
		}
		public TerminalNode DIVIDE() { return getToken(HtmlParser.DIVIDE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public List<TagBodyContext> tagBody() {
			return getRuleContexts(TagBodyContext.class);
		}
		public TagBodyContext tagBody(int i) {
			return getRuleContext(TagBodyContext.class,i);
		}
		public NormalTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterNormalTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitNormalTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitNormalTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalTagContext normalTag() throws RecognitionException {
		NormalTagContext _localctx = new NormalTagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_normalTag);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(LEFTARROW);
			setState(49);
			match(ID);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305913383326580736L) != 0)) {
				{
				{
				setState(50);
				attributes();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(RIGHTARROW);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					tagBody();
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(63);
			match(LEFTARROW);
			setState(64);
			match(DIVIDE);
			setState(65);
			match(ID);
			setState(66);
			match(RIGHTARROW);
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
	public static class AttributesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HtmlParser.ID, 0); }
		public TerminalNode MULT() { return getToken(HtmlParser.MULT, 0); }
		public TerminalNode ASSIGN() { return getToken(HtmlParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attributes);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MULT) {
					{
					setState(68);
					match(MULT);
					}
				}

				{
				setState(71);
				match(ID);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(72);
					match(ASSIGN);
					setState(73);
					value();
					}
				}

				}
				}
				break;
			case OPENBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				event();
				}
				break;
			case OPENSQUARE:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				var();
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(HtmlParser.STR, 0); }
		public TerminalNode ID() { return getToken(HtmlParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STR) ) {
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
	public static class EventContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(HtmlParser.OPENBRACKET, 0); }
		public TerminalNode ID() { return getToken(HtmlParser.ID, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(HtmlParser.CLOSEBRACKET, 0); }
		public TerminalNode ASSIGN() { return getToken(HtmlParser.ASSIGN, 0); }
		public TerminalNode STR() { return getToken(HtmlParser.STR, 0); }
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(OPENBRACKET);
			setState(83);
			match(ID);
			setState(84);
			match(CLOSEBRACKET);
			setState(85);
			match(ASSIGN);
			setState(86);
			match(STR);
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode OPENSQUARE() { return getToken(HtmlParser.OPENSQUARE, 0); }
		public TerminalNode ID() { return getToken(HtmlParser.ID, 0); }
		public TerminalNode CLOSESQUARE() { return getToken(HtmlParser.CLOSESQUARE, 0); }
		public TerminalNode ASSIGN() { return getToken(HtmlParser.ASSIGN, 0); }
		public TerminalNode STR() { return getToken(HtmlParser.STR, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(OPENSQUARE);
			setState(89);
			match(ID);
			setState(90);
			match(CLOSESQUARE);
			setState(91);
			match(ASSIGN);
			setState(92);
			match(STR);
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
	public static class TagBodyContext extends ParserRuleContext {
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public NormalTagContext normalTag() {
			return getRuleContext(NormalTagContext.class,0);
		}
		public EnterpolationContext enterpolation() {
			return getRuleContext(EnterpolationContext.class,0);
		}
		public TerminalNode ID() { return getToken(HtmlParser.ID, 0); }
		public TagBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterTagBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitTagBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitTagBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagBodyContext tagBody() throws RecognitionException {
		TagBodyContext _localctx = new TagBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tagBody);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				selfClosingTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				normalTag();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				enterpolation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(ID);
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
	public static class EnterpolationContext extends ParserRuleContext {
		public List<TerminalNode> OPENCURLY() { return getTokens(HtmlParser.OPENCURLY); }
		public TerminalNode OPENCURLY(int i) {
			return getToken(HtmlParser.OPENCURLY, i);
		}
		public List<TerminalNode> ID() { return getTokens(HtmlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HtmlParser.ID, i);
		}
		public List<TerminalNode> CLOSECURLY() { return getTokens(HtmlParser.CLOSECURLY); }
		public TerminalNode CLOSECURLY(int i) {
			return getToken(HtmlParser.CLOSECURLY, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HtmlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HtmlParser.DOT, i);
		}
		public EnterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enterpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).enterEnterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlParserListener ) ((HtmlParserListener)listener).exitEnterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitEnterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnterpolationContext enterpolation() throws RecognitionException {
		EnterpolationContext _localctx = new EnterpolationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_enterpolation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(OPENCURLY);
			setState(101);
			match(OPENCURLY);
			setState(102);
			match(ID);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(103);
				match(DOT);
				setState(104);
				match(ID);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(CLOSECURLY);
			setState(111);
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

	public static final String _serializedATN =
		"\u0004\u0001?r\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000\f\u0000"+
		"\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001f\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002#\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\'\b\u0002\n\u0002\f\u0002*\t\u0002\u0001\u0002"+
		"\u0003\u0002-\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u00034\b\u0003\n\u0003\f\u00037\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003;\b\u0003\n\u0003\f\u0003>\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004"+
		"F\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004K\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004O\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bc\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\tj\b\t\n\t\f\tm\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0000"+
		"\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0001\u0001"+
		"\u0000=>v\u0000\u0017\u0001\u0000\u0000\u0000\u0002\u001e\u0001\u0000"+
		"\u0000\u0000\u0004 \u0001\u0000\u0000\u0000\u00060\u0001\u0000\u0000\u0000"+
		"\bN\u0001\u0000\u0000\u0000\nP\u0001\u0000\u0000\u0000\fR\u0001\u0000"+
		"\u0000\u0000\u000eX\u0001\u0000\u0000\u0000\u0010b\u0001\u0000\u0000\u0000"+
		"\u0012d\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015"+
		"\u0014\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017"+
		"\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018"+
		"\u001a\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0005\u0000\u0000\u0001\u001b\u0001\u0001\u0000\u0000\u0000\u001c"+
		"\u001f\u0003\u0004\u0002\u0000\u001d\u001f\u0003\u0006\u0003\u0000\u001e"+
		"\u001c\u0001\u0000\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f"+
		"\u0003\u0001\u0000\u0000\u0000 \"\u0005(\u0000\u0000!#\u00054\u0000\u0000"+
		"\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$(\u0005=\u0000\u0000%\'\u0003\b\u0004\u0000&%\u0001\u0000\u0000"+
		"\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000"+
		"\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+-\u0005"+
		"/\u0000\u0000,+\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000./\u0005)\u0000\u0000/\u0005\u0001\u0000\u0000\u0000"+
		"01\u0005(\u0000\u000015\u0005=\u0000\u000024\u0003\b\u0004\u000032\u0001"+
		"\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u00008<\u0005)\u0000\u00009;\u0003\u0010\b\u0000:9\u0001\u0000\u0000"+
		"\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0005"+
		"(\u0000\u0000@A\u0005/\u0000\u0000AB\u0005=\u0000\u0000BC\u0005)\u0000"+
		"\u0000C\u0007\u0001\u0000\u0000\u0000DF\u0005.\u0000\u0000ED\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GJ\u0005"+
		"=\u0000\u0000HI\u0005\'\u0000\u0000IK\u0003\n\u0005\u0000JH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KO\u0001\u0000\u0000\u0000LO\u0003"+
		"\f\u0006\u0000MO\u0003\u000e\u0007\u0000NE\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000O\t\u0001\u0000\u0000\u0000"+
		"PQ\u0007\u0000\u0000\u0000Q\u000b\u0001\u0000\u0000\u0000RS\u0005\u001e"+
		"\u0000\u0000ST\u0005=\u0000\u0000TU\u0005\u001f\u0000\u0000UV\u0005\'"+
		"\u0000\u0000VW\u0005>\u0000\u0000W\r\u0001\u0000\u0000\u0000XY\u0005 "+
		"\u0000\u0000YZ\u0005=\u0000\u0000Z[\u0005!\u0000\u0000[\\\u0005\'\u0000"+
		"\u0000\\]\u0005>\u0000\u0000]\u000f\u0001\u0000\u0000\u0000^c\u0003\u0004"+
		"\u0002\u0000_c\u0003\u0006\u0003\u0000`c\u0003\u0012\t\u0000ac\u0005="+
		"\u0000\u0000b^\u0001\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000c\u0011\u0001\u0000\u0000"+
		"\u0000de\u0005\u001c\u0000\u0000ef\u0005\u001c\u0000\u0000fk\u0005=\u0000"+
		"\u0000gh\u0005&\u0000\u0000hj\u0005=\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005\u001d"+
		"\u0000\u0000op\u0005\u001d\u0000\u0000p\u0013\u0001\u0000\u0000\u0000"+
		"\f\u0017\u001e\"(,5<EJNbk";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}