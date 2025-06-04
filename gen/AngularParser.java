// Generated from D:/Antlr/AngularCompiler2/src/AngularParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, FROM=2, EXPORT=3, CLASS=4, THIS=5, NEW=6, CHAR=7, STRING=8, 
		INT=9, FLOAT=10, ARRAY=11, ANY=12, FOR=13, FOREACH=14, OF=15, WHILE=16, 
		DO=17, IF=18, ELSE_IF=19, ELSE=20, TRUE=21, FALSE=22, LET=23, VAR=24, 
		CONST=25, NUM=26, NULL=27, BOOLEAN=28, OPENCURLY=29, CLOSECURLY=30, OPENBRACKET=31, 
		CLOSEBRACKET=32, OPENSQUARE=33, CLOSESQUARE=34, COLON=35, CEMMI=36, COMMA=37, 
		AT=38, DOT=39, ASSIGN=40, LEFTARROW=41, RIGHTARROW=42, LEFTARROWOREQUAL=43, 
		RIGHTARROWOREQUAL=44, EQUAL=45, NOTEQUAL=46, MULT=47, DIVIDE=48, PLUS=49, 
		PLUSPLUS=50, SUB=51, SUBSUB=52, MARK=53, DOUBLQOUT=54, HASH=55, ARROW=56, 
		QUISTION=57, NUMBER=58, FLOATNUM=59, CHARACTER=60, WS=61, ID=62, STR=63, 
		SYBOLS=64;
	public static final int
		RULE_program = 0, RULE_imports = 1, RULE_thingsToImport = 2, RULE_directive = 3, 
		RULE_sittings = 4, RULE_structure = 5, RULE_body = 6, RULE_properties = 7, 
		RULE_dataType = 8, RULE_value = 9, RULE_functions = 10, RULE_arrowFunction = 11, 
		RULE_normalFunction = 12, RULE_parameters = 13, RULE_arrayorobject = 14, 
		RULE_functionCall = 15, RULE_controleStmts = 16, RULE_condition = 17, 
		RULE_elseIfStmts = 18, RULE_elseStmt = 19, RULE_varDec = 20, RULE_exp = 21, 
		RULE_loops = 22, RULE_foreachStmt = 23, RULE_forStmt = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "imports", "thingsToImport", "directive", "sittings", "structure", 
			"body", "properties", "dataType", "value", "functions", "arrowFunction", 
			"normalFunction", "parameters", "arrayorobject", "functionCall", "controleStmts", 
			"condition", "elseIfStmts", "elseStmt", "varDec", "exp", "loops", "foreachStmt", 
			"forStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'from'", "'export'", "'class'", "'this'", "'new'", 
			"'char'", "'string'", "'int'", "'float'", "'array'", "'any'", "'for'", 
			"'foreach'", "'of'", "'while'", "'do'", "'if'", "'elseif'", "'else'", 
			"'true'", "'false'", "'let'", "'var'", "'const'", "'number'", "'null'", 
			"'boolean'", "'{'", "'}'", "'('", "')'", "'['", "']'", "':'", "';'", 
			"','", "'@'", "'.'", "'='", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'*'", "'/'", "'+'", "'++'", "'-'", "'--'", "'!'", "'\"'", "'#'", "'=>'", 
			"'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "FROM", "EXPORT", "CLASS", "THIS", "NEW", "CHAR", "STRING", 
			"INT", "FLOAT", "ARRAY", "ANY", "FOR", "FOREACH", "OF", "WHILE", "DO", 
			"IF", "ELSE_IF", "ELSE", "TRUE", "FALSE", "LET", "VAR", "CONST", "NUM", 
			"NULL", "BOOLEAN", "OPENCURLY", "CLOSECURLY", "OPENBRACKET", "CLOSEBRACKET", 
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public StructureContext structure() {
			return getRuleContext(StructureContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				imports();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
			setState(55);
			directive();
			setState(56);
			structure();
			setState(57);
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
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public TerminalNode OPENCURLY() { return getToken(AngularParser.OPENCURLY, 0); }
		public ThingsToImportContext thingsToImport() {
			return getRuleContext(ThingsToImportContext.class,0);
		}
		public TerminalNode CLOSECURLY() { return getToken(AngularParser.CLOSECURLY, 0); }
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STR() { return getToken(AngularParser.STR, 0); }
		public TerminalNode CEMMI() { return getToken(AngularParser.CEMMI, 0); }
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(IMPORT);
			setState(60);
			match(OPENCURLY);
			setState(61);
			thingsToImport();
			setState(62);
			match(CLOSECURLY);
			setState(63);
			match(FROM);
			setState(64);
			match(STR);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CEMMI) {
				{
				setState(65);
				match(CEMMI);
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
	public static class ThingsToImportContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ThingsToImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thingsToImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThingsToImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThingsToImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThingsToImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThingsToImportContext thingsToImport() throws RecognitionException {
		ThingsToImportContext _localctx = new ThingsToImportContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_thingsToImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(69);
				match(COMMA);
				setState(70);
				match(ID);
				}
				}
				setState(75);
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
	public static class DirectiveContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AngularParser.AT, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode OPENBRACKET() { return getToken(AngularParser.OPENBRACKET, 0); }
		public TerminalNode OPENCURLY() { return getToken(AngularParser.OPENCURLY, 0); }
		public SittingsContext sittings() {
			return getRuleContext(SittingsContext.class,0);
		}
		public TerminalNode CLOSECURLY() { return getToken(AngularParser.CLOSECURLY, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(AngularParser.CLOSEBRACKET, 0); }
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(AT);
			setState(77);
			match(ID);
			setState(78);
			match(OPENBRACKET);
			setState(79);
			match(OPENCURLY);
			setState(80);
			sittings();
			setState(81);
			match(CLOSECURLY);
			setState(82);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SittingsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<TerminalNode> STR() { return getTokens(AngularParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(AngularParser.STR, i);
		}
		public List<TerminalNode> OPENSQUARE() { return getTokens(AngularParser.OPENSQUARE); }
		public TerminalNode OPENSQUARE(int i) {
			return getToken(AngularParser.OPENSQUARE, i);
		}
		public List<ThingsToImportContext> thingsToImport() {
			return getRuleContexts(ThingsToImportContext.class);
		}
		public ThingsToImportContext thingsToImport(int i) {
			return getRuleContext(ThingsToImportContext.class,i);
		}
		public List<TerminalNode> CLOSESQUARE() { return getTokens(AngularParser.CLOSESQUARE); }
		public TerminalNode CLOSESQUARE(int i) {
			return getToken(AngularParser.CLOSESQUARE, i);
		}
		public SittingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sittings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSittings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSittings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSittings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SittingsContext sittings() throws RecognitionException {
		SittingsContext _localctx = new SittingsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sittings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				{
				setState(84);
				match(ID);
				setState(85);
				match(COLON);
				setState(86);
				match(STR);
				}
				}
				break;
			case 2:
				{
				{
				setState(87);
				match(ID);
				setState(88);
				match(COLON);
				setState(89);
				match(OPENSQUARE);
				setState(90);
				thingsToImport();
				setState(91);
				match(CLOSESQUARE);
				}
				}
				break;
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					{
					setState(96);
					match(ID);
					setState(97);
					match(COLON);
					setState(98);
					match(STR);
					}
					}
					break;
				case 2:
					{
					{
					setState(99);
					match(ID);
					setState(100);
					match(COLON);
					setState(101);
					match(OPENSQUARE);
					setState(102);
					thingsToImport();
					setState(103);
					match(CLOSESQUARE);
					}
					}
					break;
				}
				}
				}
				setState(111);
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
	public static class StructureContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode OPENCURLY() { return getToken(AngularParser.OPENCURLY, 0); }
		public TerminalNode CLOSECURLY() { return getToken(AngularParser.CLOSECURLY, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(EXPORT);
			setState(113);
			match(CLASS);
			setState(114);
			match(ID);
			setState(115);
			match(OPENCURLY);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916671663497248L) != 0)) {
				{
				{
				setState(116);
				body();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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
	public static class BodyContext extends ParserRuleContext {
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public ControleStmtsContext controleStmts() {
			return getRuleContext(ControleStmtsContext.class,0);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				properties();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				functions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				controleStmts();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				loops();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				varDec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				exp(0);
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
	public static class PropertiesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CEMMI() { return getToken(AngularParser.CEMMI, 0); }
		public TerminalNode AT() { return getToken(AngularParser.AT, 0); }
		public List<TerminalNode> OPENBRACKET() { return getTokens(AngularParser.OPENBRACKET); }
		public TerminalNode OPENBRACKET(int i) {
			return getToken(AngularParser.OPENBRACKET, i);
		}
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(AngularParser.CLOSEBRACKET); }
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(AngularParser.CLOSEBRACKET, i);
		}
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public TerminalNode LEFTARROW() { return getToken(AngularParser.LEFTARROW, 0); }
		public TerminalNode RIGHTARROW() { return getToken(AngularParser.RIGHTARROW, 0); }
		public ArrayorobjectContext arrayorobject() {
			return getRuleContext(ArrayorobjectContext.class,0);
		}
		public TerminalNode OPENSQUARE() { return getToken(AngularParser.OPENSQUARE, 0); }
		public TerminalNode CLOSESQUARE() { return getToken(AngularParser.CLOSESQUARE, 0); }
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_properties);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(132);
					match(THIS);
					setState(133);
					match(DOT);
					}
				}

				setState(136);
				match(ID);
				setState(137);
				match(COLON);
				setState(138);
				dataType();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(139);
					match(ASSIGN);
					setState(140);
					value();
					}
				}

				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CEMMI) {
					{
					setState(143);
					match(CEMMI);
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(146);
				match(AT);
				setState(147);
				match(ID);
				setState(148);
				match(OPENBRACKET);
				setState(149);
				match(CLOSEBRACKET);
				setState(150);
				match(ID);
				setState(151);
				match(ASSIGN);
				setState(152);
				match(NEW);
				setState(153);
				match(ID);
				setState(154);
				match(LEFTARROW);
				setState(155);
				dataType();
				setState(156);
				match(RIGHTARROW);
				setState(157);
				match(OPENBRACKET);
				setState(158);
				match(CLOSEBRACKET);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CEMMI) {
					{
					setState(159);
					match(CEMMI);
					}
				}

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(162);
				match(AT);
				setState(163);
				match(ID);
				setState(164);
				match(OPENBRACKET);
				setState(165);
				match(CLOSEBRACKET);
				setState(166);
				match(ID);
				setState(167);
				match(COLON);
				setState(168);
				dataType();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CEMMI) {
					{
					setState(169);
					match(CEMMI);
					}
				}

				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(172);
					match(THIS);
					setState(173);
					match(DOT);
					}
				}

				setState(176);
				match(ID);
				setState(177);
				match(COLON);
				setState(178);
				dataType();
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPENSQUARE) {
					{
					setState(179);
					match(OPENSQUARE);
					setState(180);
					match(CLOSESQUARE);
					}
				}

				setState(183);
				match(ASSIGN);
				setState(184);
				arrayorobject();
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CEMMI) {
					{
					setState(185);
					match(CEMMI);
					}
				}

				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(188);
					match(THIS);
					setState(189);
					match(DOT);
					}
				}

				setState(192);
				match(ID);
				setState(193);
				match(ASSIGN);
				setState(194);
				value();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CEMMI) {
					{
					setState(195);
					match(CEMMI);
					}
				}

				}
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
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(AngularParser.CHAR, 0); }
		public TerminalNode NUM() { return getToken(AngularParser.NUM, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 335548800L) != 0)) ) {
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode CHARACTER() { return getToken(AngularParser.CHARACTER, 0); }
		public TerminalNode STR() { return getToken(AngularParser.STR, 0); }
		public TerminalNode TRUE() { return getToken(AngularParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AngularParser.FALSE, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(NUMBER);
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(CHARACTER);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(STR);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				match(FALSE);
				}
				break;
			case THIS:
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(207);
					match(THIS);
					setState(208);
					match(DOT);
					}
				}

				setState(211);
				match(ID);
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
	public static class FunctionsContext extends ParserRuleContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public NormalFunctionContext normalFunction() {
			return getRuleContext(NormalFunctionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public TerminalNode DO() { return getToken(AngularParser.DO, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functions);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				arrowFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				normalFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(216);
					match(THIS);
					setState(217);
					match(DO);
					}
				}

				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(220);
					match(ID);
					setState(221);
					match(DOT);
					}
					break;
				}
				setState(224);
				functionCall();
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
	public static class ArrowFunctionContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(AngularParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(AngularParser.CLOSEBRACKET, 0); }
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public TerminalNode OPENCURLY() { return getToken(AngularParser.OPENCURLY, 0); }
		public TerminalNode CLOSECURLY() { return getToken(AngularParser.CLOSECURLY, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(OPENBRACKET);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3170533853657825248L) != 0)) {
				{
				setState(228);
				parameters();
				}
			}

			setState(231);
			match(CLOSEBRACKET);
			setState(232);
			match(ARROW);
			setState(233);
			match(OPENCURLY);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916671663497248L) != 0)) {
				{
				{
				setState(234);
				body();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
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
	public static class NormalFunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode OPENBRACKET() { return getToken(AngularParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(AngularParser.CLOSEBRACKET, 0); }
		public TerminalNode OPENCURLY() { return getToken(AngularParser.OPENCURLY, 0); }
		public TerminalNode CLOSECURLY() { return getToken(AngularParser.CLOSECURLY, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public NormalFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNormalFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNormalFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNormalFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFunctionContext normalFunction() throws RecognitionException {
		NormalFunctionContext _localctx = new NormalFunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_normalFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(ID);
			setState(243);
			match(OPENBRACKET);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3170533853657825248L) != 0)) {
				{
				setState(244);
				parameters();
				}
			}

			setState(247);
			match(CLOSEBRACKET);
			setState(248);
			match(OPENCURLY);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916671663497248L) != 0)) {
				{
				{
				setState(249);
				body();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
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
	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<PropertiesContext> properties() {
			return getRuleContexts(PropertiesContext.class);
		}
		public PropertiesContext properties(int i) {
			return getRuleContext(PropertiesContext.class,i);
		}
		public List<ArrayorobjectContext> arrayorobject() {
			return getRuleContexts(ArrayorobjectContext.class);
		}
		public ArrayorobjectContext arrayorobject(int i) {
			return getRuleContext(ArrayorobjectContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(257);
				match(ID);
				}
				break;
			case 2:
				{
				setState(258);
				properties();
				}
				break;
			case 3:
				{
				setState(259);
				arrayorobject();
				}
				break;
			case 4:
				{
				setState(260);
				value();
				}
				break;
			}
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(263);
				match(COMMA);
				setState(268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(264);
					match(ID);
					}
					break;
				case 2:
					{
					setState(265);
					properties();
					}
					break;
				case 3:
					{
					setState(266);
					arrayorobject();
					}
					break;
				case 4:
					{
					setState(267);
					value();
					}
					break;
				}
				}
				}
				setState(274);
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
	public static class ArrayorobjectContext extends ParserRuleContext {
		public TerminalNode OPENSQUARE() { return getToken(AngularParser.OPENSQUARE, 0); }
		public TerminalNode OPENCURLY() { return getToken(AngularParser.OPENCURLY, 0); }
		public TerminalNode CLOSESQUARE() { return getToken(AngularParser.CLOSESQUARE, 0); }
		public TerminalNode CLOSECURLY() { return getToken(AngularParser.CLOSECURLY, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrayorobjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayorobject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayorobject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayorobject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayorobject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayorobjectContext arrayorobject() throws RecognitionException {
		ArrayorobjectContext _localctx = new ArrayorobjectContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayorobject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !(_la==OPENCURLY || _la==OPENSQUARE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(276);
			value();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(277);
				match(COMMA);
				setState(278);
				value();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(284);
			_la = _input.LA(1);
			if ( !(_la==CLOSECURLY || _la==CLOSESQUARE) ) {
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode OPENBRACKET() { return getToken(AngularParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(AngularParser.CLOSEBRACKET, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode CEMMI() { return getToken(AngularParser.CEMMI, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(ID);
			setState(287);
			match(OPENBRACKET);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3170533853657825248L) != 0)) {
				{
				setState(288);
				parameters();
				}
			}

			setState(291);
			match(CLOSEBRACKET);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CEMMI) {
				{
				setState(292);
				match(CEMMI);
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
	public static class ControleStmtsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode OPENBRACKET() { return getToken(AngularParser.OPENBRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(AngularParser.CLOSEBRACKET, 0); }
		public TerminalNode OPENCURLY() { return getToken(AngularParser.OPENCURLY, 0); }
		public TerminalNode CLOSECURLY() { return getToken(AngularParser.CLOSECURLY, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ElseIfStmtsContext elseIfStmts() {
			return getRuleContext(ElseIfStmtsContext.class,0);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public ControleStmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controleStmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterControleStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitControleStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitControleStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControleStmtsContext controleStmts() throws RecognitionException {
		ControleStmtsContext _localctx = new ControleStmtsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_controleStmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(IF);
			setState(296);
			match(OPENBRACKET);
			setState(297);
			condition();
			setState(298);
			match(CLOSEBRACKET);
			setState(299);
			match(OPENCURLY);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916671663497248L) != 0)) {
				{
				{
				setState(300);
				body();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(CLOSECURLY);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_IF) {
				{
				setState(307);
				elseIfStmts();
				}
			}

			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(310);
				elseStmt();
				}
				break;
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
	public static class ConditionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				exp(0);
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
	public static class ElseIfStmtsContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(AngularParser.ELSE_IF, 0); }
		public TerminalNode OPENBRACKET() { return getToken(AngularParser.OPENBRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(AngularParser.CLOSEBRACKET, 0); }
		public TerminalNode OPENCURLY() { return getToken(AngularParser.OPENCURLY, 0); }
		public TerminalNode CLOSECURLY() { return getToken(AngularParser.CLOSECURLY, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ElseIfStmtsContext elseIfStmts() {
			return getRuleContext(ElseIfStmtsContext.class,0);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public ElseIfStmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElseIfStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElseIfStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElseIfStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStmtsContext elseIfStmts() throws RecognitionException {
		ElseIfStmtsContext _localctx = new ElseIfStmtsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elseIfStmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(ELSE_IF);
			setState(318);
			match(OPENBRACKET);
			setState(319);
			condition();
			setState(320);
			match(CLOSEBRACKET);
			setState(321);
			match(OPENCURLY);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916671663497248L) != 0)) {
				{
				{
				setState(322);
				body();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(CLOSECURLY);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_IF) {
				{
				setState(329);
				elseIfStmts();
				}
			}

			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(332);
				elseStmt();
				}
				break;
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
	public static class ElseStmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public TerminalNode OPENCURLY() { return getToken(AngularParser.OPENCURLY, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode CLOSECURLY() { return getToken(AngularParser.CLOSECURLY, 0); }
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(ELSE);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPENCURLY) {
				{
				setState(336);
				match(OPENCURLY);
				}
			}

			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(339);
					body();
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(345);
				match(CLOSECURLY);
				}
				break;
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
	public static class VarDecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode CEMMI() { return getToken(AngularParser.CEMMI, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrayorobjectContext arrayorobject() {
			return getRuleContext(ArrayorobjectContext.class,0);
		}
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(349);
			match(ID);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(350);
				match(COLON);
				setState(351);
				dataType();
				}
			}

			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(354);
				match(ASSIGN);
				setState(357);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case THIS:
				case TRUE:
				case FALSE:
				case NUMBER:
				case CHARACTER:
				case ID:
				case STR:
					{
					setState(355);
					value();
					}
					break;
				case OPENCURLY:
				case OPENSQUARE:
					{
					setState(356);
					arrayorobject();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(361);
				match(CEMMI);
				}
				break;
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
	public static class ExpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MULT() { return getToken(AngularParser.MULT, 0); }
		public TerminalNode DIVIDE() { return getToken(AngularParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(AngularParser.SUB, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(AngularParser.NOTEQUAL, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode LEFTARROW() { return getToken(AngularParser.LEFTARROW, 0); }
		public TerminalNode RIGHTARROW() { return getToken(AngularParser.RIGHTARROW, 0); }
		public TerminalNode LEFTARROWOREQUAL() { return getToken(AngularParser.LEFTARROWOREQUAL, 0); }
		public TerminalNode RIGHTARROWOREQUAL() { return getToken(AngularParser.RIGHTARROWOREQUAL, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(365);
				match(ID);
				}
				break;
			case NUMBER:
				{
				setState(366);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(402);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(369);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(370);
						match(MULT);
						setState(371);
						exp(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(372);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(373);
						match(DIVIDE);
						setState(374);
						exp(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(375);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(376);
						match(PLUS);
						setState(377);
						exp(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(378);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(379);
						match(SUB);
						setState(380);
						exp(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(381);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(382);
						match(EQUAL);
						setState(383);
						exp(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(384);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(385);
						match(NOTEQUAL);
						setState(386);
						exp(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(387);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(388);
						match(ASSIGN);
						setState(389);
						exp(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(390);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(391);
						match(LEFTARROW);
						setState(392);
						exp(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(393);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(394);
						match(RIGHTARROW);
						setState(395);
						exp(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(396);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(397);
						match(LEFTARROWOREQUAL);
						setState(398);
						exp(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(399);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(400);
						match(RIGHTARROWOREQUAL);
						setState(401);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
	public static class LoopsContext extends ParserRuleContext {
		public ForeachStmtContext foreachStmt() {
			return getRuleContext(ForeachStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLoops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLoops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loops);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOREACH:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				foreachStmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				forStmt();
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
	public static class ForeachStmtContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(AngularParser.FOREACH, 0); }
		public TerminalNode OPENBRACKET() { return getToken(AngularParser.OPENBRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(AngularParser.CLOSEBRACKET, 0); }
		public TerminalNode OPENCURLY() { return getToken(AngularParser.OPENCURLY, 0); }
		public TerminalNode CLOSECURLY() { return getToken(AngularParser.CLOSECURLY, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ForeachStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForeachStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForeachStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForeachStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStmtContext foreachStmt() throws RecognitionException {
		ForeachStmtContext _localctx = new ForeachStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_foreachStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(FOREACH);
			setState(412);
			match(OPENBRACKET);
			setState(413);
			match(ID);
			setState(414);
			match(COLON);
			setState(415);
			dataType();
			setState(416);
			match(COLON);
			setState(417);
			match(ID);
			setState(418);
			match(CLOSEBRACKET);
			setState(419);
			match(OPENCURLY);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916671663497248L) != 0)) {
				{
				{
				setState(420);
				body();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
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
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode OPENBRACKET() { return getToken(AngularParser.OPENBRACKET, 0); }
		public List<TerminalNode> CEMMI() { return getTokens(AngularParser.CEMMI); }
		public TerminalNode CEMMI(int i) {
			return getToken(AngularParser.CEMMI, i);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(AngularParser.CLOSEBRACKET, 0); }
		public TerminalNode OPENCURLY() { return getToken(AngularParser.OPENCURLY, 0); }
		public TerminalNode CLOSECURLY() { return getToken(AngularParser.CLOSECURLY, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(FOR);
			setState(429);
			match(OPENBRACKET);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) {
				{
				setState(430);
				varDec();
				}
			}

			setState(433);
			match(CEMMI);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3170534137662537696L) != 0)) {
				{
				setState(434);
				condition();
				}
			}

			setState(437);
			match(CEMMI);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER || _la==ID) {
				{
				setState(438);
				exp(0);
				}
			}

			setState(441);
			match(CLOSEBRACKET);
			setState(442);
			match(OPENCURLY);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916671663497248L) != 0)) {
				{
				{
				setState(443);
				body();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001@\u01c4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0004\u00004\b\u0000\u000b\u0000\f\u00005\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004^\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004j\b\u0004\u0005\u0004l\b\u0004\n\u0004\f\u0004o\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005v\b\u0005"+
		"\n\u0005\f\u0005y\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0083\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0087\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008e\b\u0007\u0001\u0007"+
		"\u0003\u0007\u0091\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a1\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00ab\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00af\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00b6\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00bb\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00bf\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c5"+
		"\b\u0007\u0003\u0007\u00c7\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d2\b\t\u0001\t\u0003\t\u00d5"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00db\b\n\u0001\n\u0001\n"+
		"\u0003\n\u00df\b\n\u0001\n\u0003\n\u00e2\b\n\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00e6\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00ec\b\u000b\n\u000b\f\u000b\u00ef\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u00f6\b\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00fb\b\f\n\f\f\f\u00fe\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u0106\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u010d\b\r\u0005\r\u010f\b\r\n\r\f\r\u0112\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0118\b\u000e\n\u000e\f\u000e\u011b"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0122\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0126\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u012e\b\u0010\n\u0010\f\u0010\u0131\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0135\b\u0010\u0001\u0010\u0003\u0010\u0138\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u013c\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0144\b\u0012"+
		"\n\u0012\f\u0012\u0147\t\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u014b"+
		"\b\u0012\u0001\u0012\u0003\u0012\u014e\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0152\b\u0013\u0001\u0013\u0005\u0013\u0155\b\u0013\n\u0013"+
		"\f\u0013\u0158\t\u0013\u0001\u0013\u0003\u0013\u015b\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0161\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0166\b\u0014\u0003\u0014\u0168\b"+
		"\u0014\u0001\u0014\u0003\u0014\u016b\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0170\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u0193\b\u0015\n\u0015\f\u0015\u0196\t\u0015\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u019a\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u01a6\b\u0017\n\u0017\f\u0017\u01a9\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01b0\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01b4\b\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u01b8\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01bd"+
		"\b\u0018\n\u0018\f\u0018\u01c0\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0000\u0001*\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0004\u0004\u0000\u0007"+
		"\b\f\f\u001a\u001a\u001c\u001c\u0002\u0000\u001d\u001d!!\u0002\u0000\u001e"+
		"\u001e\"\"\u0001\u0000\u0017\u0019\u01fc\u00003\u0001\u0000\u0000\u0000"+
		"\u0002;\u0001\u0000\u0000\u0000\u0004D\u0001\u0000\u0000\u0000\u0006L"+
		"\u0001\u0000\u0000\u0000\b]\u0001\u0000\u0000\u0000\np\u0001\u0000\u0000"+
		"\u0000\f\u0082\u0001\u0000\u0000\u0000\u000e\u00c6\u0001\u0000\u0000\u0000"+
		"\u0010\u00c8\u0001\u0000\u0000\u0000\u0012\u00d4\u0001\u0000\u0000\u0000"+
		"\u0014\u00e1\u0001\u0000\u0000\u0000\u0016\u00e3\u0001\u0000\u0000\u0000"+
		"\u0018\u00f2\u0001\u0000\u0000\u0000\u001a\u0105\u0001\u0000\u0000\u0000"+
		"\u001c\u0113\u0001\u0000\u0000\u0000\u001e\u011e\u0001\u0000\u0000\u0000"+
		" \u0127\u0001\u0000\u0000\u0000\"\u013b\u0001\u0000\u0000\u0000$\u013d"+
		"\u0001\u0000\u0000\u0000&\u014f\u0001\u0000\u0000\u0000(\u015c\u0001\u0000"+
		"\u0000\u0000*\u016f\u0001\u0000\u0000\u0000,\u0199\u0001\u0000\u0000\u0000"+
		".\u019b\u0001\u0000\u0000\u00000\u01ac\u0001\u0000\u0000\u000024\u0003"+
		"\u0002\u0001\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000078\u0003\u0006\u0003\u000089\u0003\n\u0005\u00009:\u0005\u0000\u0000"+
		"\u0001:\u0001\u0001\u0000\u0000\u0000;<\u0005\u0001\u0000\u0000<=\u0005"+
		"\u001d\u0000\u0000=>\u0003\u0004\u0002\u0000>?\u0005\u001e\u0000\u0000"+
		"?@\u0005\u0002\u0000\u0000@B\u0005?\u0000\u0000AC\u0005$\u0000\u0000B"+
		"A\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0003\u0001\u0000"+
		"\u0000\u0000DI\u0005>\u0000\u0000EF\u0005%\u0000\u0000FH\u0005>\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0005\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000LM\u0005&\u0000\u0000MN\u0005>\u0000\u0000N"+
		"O\u0005\u001f\u0000\u0000OP\u0005\u001d\u0000\u0000PQ\u0003\b\u0004\u0000"+
		"QR\u0005\u001e\u0000\u0000RS\u0005 \u0000\u0000S\u0007\u0001\u0000\u0000"+
		"\u0000TU\u0005>\u0000\u0000UV\u0005#\u0000\u0000V^\u0005?\u0000\u0000"+
		"WX\u0005>\u0000\u0000XY\u0005#\u0000\u0000YZ\u0005!\u0000\u0000Z[\u0003"+
		"\u0004\u0002\u0000[\\\u0005\"\u0000\u0000\\^\u0001\u0000\u0000\u0000]"+
		"T\u0001\u0000\u0000\u0000]W\u0001\u0000\u0000\u0000^m\u0001\u0000\u0000"+
		"\u0000_i\u0005%\u0000\u0000`a\u0005>\u0000\u0000ab\u0005#\u0000\u0000"+
		"bj\u0005?\u0000\u0000cd\u0005>\u0000\u0000de\u0005#\u0000\u0000ef\u0005"+
		"!\u0000\u0000fg\u0003\u0004\u0002\u0000gh\u0005\"\u0000\u0000hj\u0001"+
		"\u0000\u0000\u0000i`\u0001\u0000\u0000\u0000ic\u0001\u0000\u0000\u0000"+
		"jl\u0001\u0000\u0000\u0000k_\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\t\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\u0003\u0000\u0000qr\u0005"+
		"\u0004\u0000\u0000rs\u0005>\u0000\u0000sw\u0005\u001d\u0000\u0000tv\u0003"+
		"\f\u0006\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000z{\u0005\u001e\u0000\u0000{\u000b\u0001\u0000"+
		"\u0000\u0000|\u0083\u0003\u000e\u0007\u0000}\u0083\u0003\u0014\n\u0000"+
		"~\u0083\u0003 \u0010\u0000\u007f\u0083\u0003,\u0016\u0000\u0080\u0083"+
		"\u0003(\u0014\u0000\u0081\u0083\u0003*\u0015\u0000\u0082|\u0001\u0000"+
		"\u0000\u0000\u0082}\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000\u0000"+
		"\u0082\u007f\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0083\r\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005\u0005\u0000\u0000\u0085\u0087\u0005\'\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005>\u0000\u0000\u0089\u008a\u0005"+
		"#\u0000\u0000\u008a\u008d\u0003\u0010\b\u0000\u008b\u008c\u0005(\u0000"+
		"\u0000\u008c\u008e\u0003\u0012\t\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000"+
		"\u008f\u0091\u0005$\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\u00c7\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0005&\u0000\u0000\u0093\u0094\u0005>\u0000\u0000\u0094\u0095\u0005"+
		"\u001f\u0000\u0000\u0095\u0096\u0005 \u0000\u0000\u0096\u0097\u0005>\u0000"+
		"\u0000\u0097\u0098\u0005(\u0000\u0000\u0098\u0099\u0005\u0006\u0000\u0000"+
		"\u0099\u009a\u0005>\u0000\u0000\u009a\u009b\u0005)\u0000\u0000\u009b\u009c"+
		"\u0003\u0010\b\u0000\u009c\u009d\u0005*\u0000\u0000\u009d\u009e\u0005"+
		"\u001f\u0000\u0000\u009e\u00a0\u0005 \u0000\u0000\u009f\u00a1\u0005$\u0000"+
		"\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00c7\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005&\u0000\u0000"+
		"\u00a3\u00a4\u0005>\u0000\u0000\u00a4\u00a5\u0005\u001f\u0000\u0000\u00a5"+
		"\u00a6\u0005 \u0000\u0000\u00a6\u00a7\u0005>\u0000\u0000\u00a7\u00a8\u0005"+
		"#\u0000\u0000\u00a8\u00aa\u0003\u0010\b\u0000\u00a9\u00ab\u0005$\u0000"+
		"\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00c7\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0005\u0000"+
		"\u0000\u00ad\u00af\u0005\'\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0005>\u0000\u0000\u00b1\u00b2\u0005#\u0000\u0000\u00b2\u00b5"+
		"\u0003\u0010\b\u0000\u00b3\u00b4\u0005!\u0000\u0000\u00b4\u00b6\u0005"+
		"\"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005(\u0000"+
		"\u0000\u00b8\u00ba\u0003\u001c\u000e\u0000\u00b9\u00bb\u0005$\u0000\u0000"+
		"\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bb\u00c7\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0005\u0000\u0000"+
		"\u00bd\u00bf\u0005\'\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0005>\u0000\u0000\u00c1\u00c2\u0005(\u0000\u0000\u00c2\u00c4\u0003"+
		"\u0012\t\u0000\u00c3\u00c5\u0005$\u0000\u0000\u00c4\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c6\u0086\u0001\u0000\u0000\u0000\u00c6\u0092\u0001\u0000"+
		"\u0000\u0000\u00c6\u00a2\u0001\u0000\u0000\u0000\u00c6\u00ae\u0001\u0000"+
		"\u0000\u0000\u00c6\u00be\u0001\u0000\u0000\u0000\u00c7\u000f\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0007\u0000\u0000\u0000\u00c9\u0011\u0001\u0000"+
		"\u0000\u0000\u00ca\u00d5\u0005:\u0000\u0000\u00cb\u00d5\u0005<\u0000\u0000"+
		"\u00cc\u00d5\u0005?\u0000\u0000\u00cd\u00d5\u0005\u0015\u0000\u0000\u00ce"+
		"\u00d5\u0005\u0016\u0000\u0000\u00cf\u00d0\u0005\u0005\u0000\u0000\u00d0"+
		"\u00d2\u0005\'\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5"+
		"\u0005>\u0000\u0000\u00d4\u00ca\u0001\u0000\u0000\u0000\u00d4\u00cb\u0001"+
		"\u0000\u0000\u0000\u00d4\u00cc\u0001\u0000\u0000\u0000\u00d4\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d4\u00ce\u0001\u0000\u0000\u0000\u00d4\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d5\u0013\u0001\u0000\u0000\u0000\u00d6\u00e2\u0003"+
		"\u0016\u000b\u0000\u00d7\u00e2\u0003\u0018\f\u0000\u00d8\u00d9\u0005\u0005"+
		"\u0000\u0000\u00d9\u00db\u0005\u0011\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0005>\u0000\u0000\u00dd\u00df\u0005\'\u0000"+
		"\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2\u0003\u001e\u000f"+
		"\u0000\u00e1\u00d6\u0001\u0000\u0000\u0000\u00e1\u00d7\u0001\u0000\u0000"+
		"\u0000\u00e1\u00da\u0001\u0000\u0000\u0000\u00e2\u0015\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e5\u0005\u001f\u0000\u0000\u00e4\u00e6\u0003\u001a\r\u0000"+
		"\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005 \u0000\u0000\u00e8"+
		"\u00e9\u00058\u0000\u0000\u00e9\u00ed\u0005\u001d\u0000\u0000\u00ea\u00ec"+
		"\u0003\f\u0006\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0005\u001e\u0000\u0000\u00f1\u0017\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0005>\u0000\u0000\u00f3\u00f5\u0005\u001f"+
		"\u0000\u0000\u00f4\u00f6\u0003\u001a\r\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0005 \u0000\u0000\u00f8\u00fc\u0005\u001d\u0000\u0000"+
		"\u00f9\u00fb\u0003\f\u0006\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fc\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u001e\u0000\u0000\u0100"+
		"\u0019\u0001\u0000\u0000\u0000\u0101\u0106\u0005>\u0000\u0000\u0102\u0106"+
		"\u0003\u000e\u0007\u0000\u0103\u0106\u0003\u001c\u000e\u0000\u0104\u0106"+
		"\u0003\u0012\t\u0000\u0105\u0101\u0001\u0000\u0000\u0000\u0105\u0102\u0001"+
		"\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0110\u0001\u0000\u0000\u0000\u0107\u010c\u0005"+
		"%\u0000\u0000\u0108\u010d\u0005>\u0000\u0000\u0109\u010d\u0003\u000e\u0007"+
		"\u0000\u010a\u010d\u0003\u001c\u000e\u0000\u010b\u010d\u0003\u0012\t\u0000"+
		"\u010c\u0108\u0001\u0000\u0000\u0000\u010c\u0109\u0001\u0000\u0000\u0000"+
		"\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000"+
		"\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u0107\u0001\u0000\u0000\u0000"+
		"\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u001b\u0001\u0000\u0000\u0000"+
		"\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0114\u0007\u0001\u0000\u0000"+
		"\u0114\u0119\u0003\u0012\t\u0000\u0115\u0116\u0005%\u0000\u0000\u0116"+
		"\u0118\u0003\u0012\t\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u011b"+
		"\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0001\u0000\u0000\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0007\u0002\u0000\u0000\u011d\u001d"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0005>\u0000\u0000\u011f\u0121\u0005"+
		"\u001f\u0000\u0000\u0120\u0122\u0003\u001a\r\u0000\u0121\u0120\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0123\u0125\u0005 \u0000\u0000\u0124\u0126\u0005$\u0000\u0000"+
		"\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000"+
		"\u0126\u001f\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u0012\u0000\u0000"+
		"\u0128\u0129\u0005\u001f\u0000\u0000\u0129\u012a\u0003\"\u0011\u0000\u012a"+
		"\u012b\u0005 \u0000\u0000\u012b\u012f\u0005\u001d\u0000\u0000\u012c\u012e"+
		"\u0003\f\u0006\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012e\u0131\u0001"+
		"\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001"+
		"\u0000\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u012f\u0001"+
		"\u0000\u0000\u0000\u0132\u0134\u0005\u001e\u0000\u0000\u0133\u0135\u0003"+
		"$\u0012\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000"+
		"\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0138\u0003&\u0013"+
		"\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000"+
		"\u0000\u0138!\u0001\u0000\u0000\u0000\u0139\u013c\u0003\u0012\t\u0000"+
		"\u013a\u013c\u0003*\u0015\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b"+
		"\u013a\u0001\u0000\u0000\u0000\u013c#\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0005\u0013\u0000\u0000\u013e\u013f\u0005\u001f\u0000\u0000\u013f\u0140"+
		"\u0003\"\u0011\u0000\u0140\u0141\u0005 \u0000\u0000\u0141\u0145\u0005"+
		"\u001d\u0000\u0000\u0142\u0144\u0003\f\u0006\u0000\u0143\u0142\u0001\u0000"+
		"\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148\u0001\u0000"+
		"\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u014a\u0005\u001e"+
		"\u0000\u0000\u0149\u014b\u0003$\u0012\u0000\u014a\u0149\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014d\u0001\u0000\u0000"+
		"\u0000\u014c\u014e\u0003&\u0013\u0000\u014d\u014c\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e%\u0001\u0000\u0000\u0000\u014f"+
		"\u0151\u0005\u0014\u0000\u0000\u0150\u0152\u0005\u001d\u0000\u0000\u0151"+
		"\u0150\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152"+
		"\u0156\u0001\u0000\u0000\u0000\u0153\u0155\u0003\f\u0006\u0000\u0154\u0153"+
		"\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156\u0154"+
		"\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u015a"+
		"\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u015b"+
		"\u0005\u001e\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u0001\u0000\u0000\u0000\u015b\'\u0001\u0000\u0000\u0000\u015c\u015d\u0007"+
		"\u0003\u0000\u0000\u015d\u0160\u0005>\u0000\u0000\u015e\u015f\u0005#\u0000"+
		"\u0000\u015f\u0161\u0003\u0010\b\u0000\u0160\u015e\u0001\u0000\u0000\u0000"+
		"\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0167\u0001\u0000\u0000\u0000"+
		"\u0162\u0165\u0005(\u0000\u0000\u0163\u0166\u0003\u0012\t\u0000\u0164"+
		"\u0166\u0003\u001c\u000e\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165"+
		"\u0164\u0001\u0000\u0000\u0000\u0166\u0168\u0001\u0000\u0000\u0000\u0167"+
		"\u0162\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168"+
		"\u016a\u0001\u0000\u0000\u0000\u0169\u016b\u0005$\u0000\u0000\u016a\u0169"+
		"\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b)\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0006\u0015\uffff\uffff\u0000\u016d\u0170"+
		"\u0005>\u0000\u0000\u016e\u0170\u0005:\u0000\u0000\u016f\u016c\u0001\u0000"+
		"\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0194\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\n\r\u0000\u0000\u0172\u0173\u0005/\u0000\u0000"+
		"\u0173\u0193\u0003*\u0015\u000e\u0174\u0175\n\f\u0000\u0000\u0175\u0176"+
		"\u00050\u0000\u0000\u0176\u0193\u0003*\u0015\r\u0177\u0178\n\u000b\u0000"+
		"\u0000\u0178\u0179\u00051\u0000\u0000\u0179\u0193\u0003*\u0015\f\u017a"+
		"\u017b\n\n\u0000\u0000\u017b\u017c\u00053\u0000\u0000\u017c\u0193\u0003"+
		"*\u0015\u000b\u017d\u017e\n\t\u0000\u0000\u017e\u017f\u0005-\u0000\u0000"+
		"\u017f\u0193\u0003*\u0015\n\u0180\u0181\n\b\u0000\u0000\u0181\u0182\u0005"+
		".\u0000\u0000\u0182\u0193\u0003*\u0015\t\u0183\u0184\n\u0007\u0000\u0000"+
		"\u0184\u0185\u0005(\u0000\u0000\u0185\u0193\u0003*\u0015\b\u0186\u0187"+
		"\n\u0006\u0000\u0000\u0187\u0188\u0005)\u0000\u0000\u0188\u0193\u0003"+
		"*\u0015\u0007\u0189\u018a\n\u0005\u0000\u0000\u018a\u018b\u0005*\u0000"+
		"\u0000\u018b\u0193\u0003*\u0015\u0006\u018c\u018d\n\u0004\u0000\u0000"+
		"\u018d\u018e\u0005+\u0000\u0000\u018e\u0193\u0003*\u0015\u0005\u018f\u0190"+
		"\n\u0003\u0000\u0000\u0190\u0191\u0005,\u0000\u0000\u0191\u0193\u0003"+
		"*\u0015\u0004\u0192\u0171\u0001\u0000\u0000\u0000\u0192\u0174\u0001\u0000"+
		"\u0000\u0000\u0192\u0177\u0001\u0000\u0000\u0000\u0192\u017a\u0001\u0000"+
		"\u0000\u0000\u0192\u017d\u0001\u0000\u0000\u0000\u0192\u0180\u0001\u0000"+
		"\u0000\u0000\u0192\u0183\u0001\u0000\u0000\u0000\u0192\u0186\u0001\u0000"+
		"\u0000\u0000\u0192\u0189\u0001\u0000\u0000\u0000\u0192\u018c\u0001\u0000"+
		"\u0000\u0000\u0192\u018f\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000"+
		"\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000"+
		"\u0000\u0000\u0195+\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000"+
		"\u0000\u0197\u019a\u0003.\u0017\u0000\u0198\u019a\u00030\u0018\u0000\u0199"+
		"\u0197\u0001\u0000\u0000\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u019a"+
		"-\u0001\u0000\u0000\u0000\u019b\u019c\u0005\u000e\u0000\u0000\u019c\u019d"+
		"\u0005\u001f\u0000\u0000\u019d\u019e\u0005>\u0000\u0000\u019e\u019f\u0005"+
		"#\u0000\u0000\u019f\u01a0\u0003\u0010\b\u0000\u01a0\u01a1\u0005#\u0000"+
		"\u0000\u01a1\u01a2\u0005>\u0000\u0000\u01a2\u01a3\u0005 \u0000\u0000\u01a3"+
		"\u01a7\u0005\u001d\u0000\u0000\u01a4\u01a6\u0003\f\u0006\u0000\u01a5\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa"+
		"\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa\u01ab"+
		"\u0005\u001e\u0000\u0000\u01ab/\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005"+
		"\r\u0000\u0000\u01ad\u01af\u0005\u001f\u0000\u0000\u01ae\u01b0\u0003("+
		"\u0014\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b3\u0005$\u0000"+
		"\u0000\u01b2\u01b4\u0003\"\u0011\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b7\u0005$\u0000\u0000\u01b6\u01b8\u0003*\u0015\u0000\u01b7\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005 \u0000\u0000\u01ba\u01be\u0005"+
		"\u001d\u0000\u0000\u01bb\u01bd\u0003\f\u0006\u0000\u01bc\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bd\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000"+
		"\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005\u001e"+
		"\u0000\u0000\u01c21\u0001\u0000\u0000\u000095BI]imw\u0082\u0086\u008d"+
		"\u0090\u00a0\u00aa\u00ae\u00b5\u00ba\u00be\u00c4\u00c6\u00d1\u00d4\u00da"+
		"\u00de\u00e1\u00e5\u00ed\u00f5\u00fc\u0105\u010c\u0110\u0119\u0121\u0125"+
		"\u012f\u0134\u0137\u013b\u0145\u014a\u014d\u0151\u0156\u015a\u0160\u0165"+
		"\u0167\u016a\u016f\u0192\u0194\u0199\u01a7\u01af\u01b3\u01b7\u01be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}