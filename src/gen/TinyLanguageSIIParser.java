// Generated from E:/Documents/IdeaProjects/TP_Compile/src\TinyLanguageSII.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TinyLanguageSIIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, COMPIL=7, START=8, INTCOMPIL=9, 
		FLOATCOMPIL=10, STRINGCOMPIL=11, IF=12, THEN=13, ELSE=14, DO=15, WHILE=16, 
		PRINTFCOMPIL=17, SCANCOMPIL=18, PLUS=19, MOINS=20, MUL=21, DIV=22, SUP=23, 
		INF=24, SUPE=25, INFE=26, EGAL=27, DIFF=28, AFF=29, NOM_PROGRAMME=30, 
		ID=31, INTEGER=32, FLOAT=33, STRING=34, UNELIGNE=35, MULTILIGNE=36, WS=37;
	public static final int
		RULE_programme = 0, RULE_declarations = 1, RULE_type = 2, RULE_ids = 3, 
		RULE_instructions = 4, RULE_instruction = 5, RULE_inst_a = 6, RULE_inst_b = 7, 
		RULE_affectation = 8, RULE_boucle = 9, RULE_condition = 10, RULE_instElse = 11, 
		RULE_cdtIF = 12, RULE_cdtDO = 13, RULE_exp = 14, RULE_parG = 15, RULE_parD = 16, 
		RULE_opMD = 17, RULE_opPM = 18, RULE_oplog = 19, RULE_ecrire = 20, RULE_lire = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"programme", "declarations", "type", "ids", "instructions", "instruction", 
			"inst_a", "inst_b", "affectation", "boucle", "condition", "instElse", 
			"cdtIF", "cdtDO", "exp", "parG", "parD", "opMD", "opPM", "oplog", "ecrire", 
			"lire"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "','", "'('", "')'", "'compil'", "'start'", 
			"'intCompil'", "'floatCompil'", "'stringCompil'", "'if'", "'then'", "'else'", 
			"'do'", "'while'", "'printCompil'", "'scanCompil'", "'+'", "'-'", "'*'", 
			"'/'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "COMPIL", "START", "INTCOMPIL", 
			"FLOATCOMPIL", "STRINGCOMPIL", "IF", "THEN", "ELSE", "DO", "WHILE", "PRINTFCOMPIL", 
			"SCANCOMPIL", "PLUS", "MOINS", "MUL", "DIV", "SUP", "INF", "SUPE", "INFE", 
			"EGAL", "DIFF", "AFF", "NOM_PROGRAMME", "ID", "INTEGER", "FLOAT", "STRING", 
			"UNELIGNE", "MULTILIGNE", "WS"
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
	public String getGrammarFileName() { return "TinyLanguageSII.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TinyLanguageSIIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgrammeContext extends ParserRuleContext {
		public TerminalNode COMPIL() { return getToken(TinyLanguageSIIParser.COMPIL, 0); }
		public TerminalNode NOM_PROGRAMME() { return getToken(TinyLanguageSIIParser.NOM_PROGRAMME, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode START() { return getToken(TinyLanguageSIIParser.START, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitProgramme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitProgramme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(COMPIL);
			setState(45);
			match(NOM_PROGRAMME);
			setState(46);
			match(T__0);
			setState(47);
			declarations(0);
			setState(48);
			match(START);
			setState(49);
			instructions();
			setState(50);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		return declarations(0);
	}

	private DeclarationsContext declarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, _parentState);
		DeclarationsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_declarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarations);
					setState(53);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(54);
					type();
					setState(55);
					ids();
					setState(56);
					match(T__2);
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTCOMPIL() { return getToken(TinyLanguageSIIParser.INTCOMPIL, 0); }
		public TerminalNode FLOATCOMPIL() { return getToken(TinyLanguageSIIParser.FLOATCOMPIL, 0); }
		public TerminalNode STRINGCOMPIL() { return getToken(TinyLanguageSIIParser.STRINGCOMPIL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTCOMPIL) | (1L << FLOATCOMPIL) | (1L << STRINGCOMPIL))) != 0)) ) {
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

	public static class IdsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TinyLanguageSIIParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TinyLanguageSIIParser.ID, i);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitIds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ID);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(66);
				match(T__3);
				setState(67);
				match(ID);
				}
				}
				setState(72);
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

	public static class InstructionsContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			instruction();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO) | (1L << PRINTFCOMPIL) | (1L << SCANCOMPIL) | (1L << ID))) != 0)) {
				{
				setState(74);
				instructions();
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

	public static class InstructionContext extends ParserRuleContext {
		public Inst_aContext inst_a() {
			return getRuleContext(Inst_aContext.class,0);
		}
		public Inst_bContext inst_b() {
			return getRuleContext(Inst_bContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruction);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTFCOMPIL:
			case SCANCOMPIL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				inst_a();
				setState(78);
				match(T__2);
				}
				break;
			case IF:
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				inst_b();
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

	public static class Inst_aContext extends ParserRuleContext {
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public LireContext lire() {
			return getRuleContext(LireContext.class,0);
		}
		public EcrireContext ecrire() {
			return getRuleContext(EcrireContext.class,0);
		}
		public Inst_aContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterInst_a(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitInst_a(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitInst_a(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inst_aContext inst_a() throws RecognitionException {
		Inst_aContext _localctx = new Inst_aContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inst_a);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				affectation();
				}
				break;
			case SCANCOMPIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				lire();
				}
				break;
			case PRINTFCOMPIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				ecrire();
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

	public static class Inst_bContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BoucleContext boucle() {
			return getRuleContext(BoucleContext.class,0);
		}
		public Inst_bContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterInst_b(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitInst_b(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitInst_b(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inst_bContext inst_b() throws RecognitionException {
		Inst_bContext _localctx = new Inst_bContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inst_b);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				condition();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				boucle();
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

	public static class AffectationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TinyLanguageSIIParser.ID, 0); }
		public TerminalNode AFF() { return getToken(TinyLanguageSIIParser.AFF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode STRING() { return getToken(TinyLanguageSIIParser.STRING, 0); }
		public AffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterAffectation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitAffectation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitAffectation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_affectation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ID);
			setState(93);
			match(AFF);
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case MOINS:
			case ID:
			case INTEGER:
			case FLOAT:
				{
				setState(94);
				exp(0);
				}
				break;
			case STRING:
				{
				setState(95);
				match(STRING);
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

	public static class BoucleContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(TinyLanguageSIIParser.DO, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(TinyLanguageSIIParser.WHILE, 0); }
		public CdtDOContext cdtDO() {
			return getRuleContext(CdtDOContext.class,0);
		}
		public BoucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterBoucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitBoucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitBoucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoucleContext boucle() throws RecognitionException {
		BoucleContext _localctx = new BoucleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(DO);
			setState(99);
			match(T__0);
			setState(100);
			instructions();
			setState(101);
			match(T__1);
			setState(102);
			match(WHILE);
			setState(103);
			cdtDO();
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TinyLanguageSIIParser.IF, 0); }
		public CdtIFContext cdtIF() {
			return getRuleContext(CdtIFContext.class,0);
		}
		public TerminalNode THEN() { return getToken(TinyLanguageSIIParser.THEN, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public List<InstElseContext> instElse() {
			return getRuleContexts(InstElseContext.class);
		}
		public InstElseContext instElse(int i) {
			return getRuleContext(InstElseContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(IF);
			setState(106);
			cdtIF();
			setState(107);
			match(THEN);
			setState(108);
			match(T__0);
			setState(109);
			instructions();
			setState(110);
			match(T__1);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(111);
				instElse();
				setState(112);
				match(T__0);
				setState(113);
				instructions();
				setState(114);
				match(T__1);
				}
				}
				setState(120);
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

	public static class InstElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(TinyLanguageSIIParser.ELSE, 0); }
		public InstElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterInstElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitInstElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitInstElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstElseContext instElse() throws RecognitionException {
		InstElseContext _localctx = new InstElseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ELSE);
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

	public static class CdtIFContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public CdtIFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cdtIF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterCdtIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitCdtIF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitCdtIF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CdtIFContext cdtIF() throws RecognitionException {
		CdtIFContext _localctx = new CdtIFContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cdtIF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__4);
			setState(124);
			exp(0);
			setState(125);
			oplog();
			setState(126);
			exp(0);
			setState(127);
			match(T__5);
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

	public static class CdtDOContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public CdtDOContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cdtDO; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterCdtDO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitCdtDO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitCdtDO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CdtDOContext cdtDO() throws RecognitionException {
		CdtDOContext _localctx = new CdtDOContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cdtDO);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__4);
			setState(130);
			exp(0);
			setState(131);
			oplog();
			setState(132);
			exp(0);
			setState(133);
			match(T__5);
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode MOINS() { return getToken(TinyLanguageSIIParser.MOINS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ParGContext parG() {
			return getRuleContext(ParGContext.class,0);
		}
		public ParDContext parD() {
			return getRuleContext(ParDContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(TinyLanguageSIIParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(TinyLanguageSIIParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(TinyLanguageSIIParser.ID, 0); }
		public OpMDContext opMD() {
			return getRuleContext(OpMDContext.class,0);
		}
		public OpPMContext opPM() {
			return getRuleContext(OpPMContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitExp(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOINS:
				{
				setState(136);
				match(MOINS);
				setState(137);
				exp(7);
				}
				break;
			case T__4:
				{
				setState(138);
				parG();
				setState(139);
				exp(0);
				setState(140);
				parD();
				}
				break;
			case INTEGER:
				{
				setState(142);
				match(INTEGER);
				}
				break;
			case FLOAT:
				{
				setState(143);
				match(FLOAT);
				}
				break;
			case ID:
				{
				setState(144);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(147);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(148);
						opMD();
						setState(149);
						exp(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(151);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(152);
						opPM();
						setState(153);
						exp(5);
						}
						break;
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ParGContext extends ParserRuleContext {
		public ParGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parG; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterParG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitParG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitParG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParGContext parG() throws RecognitionException {
		ParGContext _localctx = new ParGContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__4);
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

	public static class ParDContext extends ParserRuleContext {
		public ParDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterParD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitParD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitParD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParDContext parD() throws RecognitionException {
		ParDContext _localctx = new ParDContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__5);
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

	public static class OpMDContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(TinyLanguageSIIParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TinyLanguageSIIParser.DIV, 0); }
		public OpMDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opMD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterOpMD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitOpMD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitOpMD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpMDContext opMD() throws RecognitionException {
		OpMDContext _localctx = new OpMDContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_opMD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==DIV) ) {
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

	public static class OpPMContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(TinyLanguageSIIParser.PLUS, 0); }
		public TerminalNode MOINS() { return getToken(TinyLanguageSIIParser.MOINS, 0); }
		public OpPMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opPM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterOpPM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitOpPM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitOpPM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpPMContext opPM() throws RecognitionException {
		OpPMContext _localctx = new OpPMContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_opPM);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MOINS) ) {
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

	public static class OplogContext extends ParserRuleContext {
		public TerminalNode SUP() { return getToken(TinyLanguageSIIParser.SUP, 0); }
		public TerminalNode INF() { return getToken(TinyLanguageSIIParser.INF, 0); }
		public TerminalNode SUPE() { return getToken(TinyLanguageSIIParser.SUPE, 0); }
		public TerminalNode INFE() { return getToken(TinyLanguageSIIParser.INFE, 0); }
		public TerminalNode EGAL() { return getToken(TinyLanguageSIIParser.EGAL, 0); }
		public TerminalNode DIFF() { return getToken(TinyLanguageSIIParser.DIFF, 0); }
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitOplog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitOplog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_oplog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUP) | (1L << INF) | (1L << SUPE) | (1L << INFE) | (1L << EGAL) | (1L << DIFF))) != 0)) ) {
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

	public static class EcrireContext extends ParserRuleContext {
		public TerminalNode PRINTFCOMPIL() { return getToken(TinyLanguageSIIParser.PRINTFCOMPIL, 0); }
		public TerminalNode STRING() { return getToken(TinyLanguageSIIParser.STRING, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public EcrireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ecrire; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterEcrire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitEcrire(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitEcrire(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EcrireContext ecrire() throws RecognitionException {
		EcrireContext _localctx = new EcrireContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ecrire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(PRINTFCOMPIL);
			setState(171);
			match(T__4);
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(172);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(173);
				ids();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(176);
			match(T__5);
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

	public static class LireContext extends ParserRuleContext {
		public TerminalNode SCANCOMPIL() { return getToken(TinyLanguageSIIParser.SCANCOMPIL, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public LireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lire; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterLire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitLire(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitLire(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LireContext lire() throws RecognitionException {
		LireContext _localctx = new LireContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(SCANCOMPIL);
			setState(179);
			match(T__4);
			setState(180);
			ids();
			setState(181);
			match(T__5);
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
		case 1:
			return declarations_sempred((DeclarationsContext)_localctx, predIndex);
		case 14:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean declarations_sempred(DeclarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\4\3\4\3"+
		"\5\3\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\6\3\6\5\6N\n\6\3\7\3\7\3\7\3\7\5"+
		"\7T\n\7\3\b\3\b\3\b\5\bY\n\b\3\t\3\t\5\t]\n\t\3\n\3\n\3\n\3\n\5\nc\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\fw\n\f\f\f\16\fz\13\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u0094\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u009e\n\20\f\20\16\20\u00a1\13\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00b1\n\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\2\4\4\36\30\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,\2\6\3\2\13\r\3\2\27\30\3\2\25\26\3\2\31\36\2\u00b3\2.\3"+
		"\2\2\2\4\66\3\2\2\2\6A\3\2\2\2\bC\3\2\2\2\nK\3\2\2\2\fS\3\2\2\2\16X\3"+
		"\2\2\2\20\\\3\2\2\2\22^\3\2\2\2\24d\3\2\2\2\26k\3\2\2\2\30{\3\2\2\2\32"+
		"}\3\2\2\2\34\u0083\3\2\2\2\36\u0093\3\2\2\2 \u00a2\3\2\2\2\"\u00a4\3\2"+
		"\2\2$\u00a6\3\2\2\2&\u00a8\3\2\2\2(\u00aa\3\2\2\2*\u00ac\3\2\2\2,\u00b4"+
		"\3\2\2\2./\7\t\2\2/\60\7 \2\2\60\61\7\3\2\2\61\62\5\4\3\2\62\63\7\n\2"+
		"\2\63\64\5\n\6\2\64\65\7\4\2\2\65\3\3\2\2\2\66>\b\3\1\2\678\f\4\2\289"+
		"\5\6\4\29:\5\b\5\2:;\7\5\2\2;=\3\2\2\2<\67\3\2\2\2=@\3\2\2\2><\3\2\2\2"+
		">?\3\2\2\2?\5\3\2\2\2@>\3\2\2\2AB\t\2\2\2B\7\3\2\2\2CH\7!\2\2DE\7\6\2"+
		"\2EG\7!\2\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\t\3\2\2\2JH\3\2\2"+
		"\2KM\5\f\7\2LN\5\n\6\2ML\3\2\2\2MN\3\2\2\2N\13\3\2\2\2OP\5\16\b\2PQ\7"+
		"\5\2\2QT\3\2\2\2RT\5\20\t\2SO\3\2\2\2SR\3\2\2\2T\r\3\2\2\2UY\5\22\n\2"+
		"VY\5,\27\2WY\5*\26\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\17\3\2\2\2Z]\5\26"+
		"\f\2[]\5\24\13\2\\Z\3\2\2\2\\[\3\2\2\2]\21\3\2\2\2^_\7!\2\2_b\7\37\2\2"+
		"`c\5\36\20\2ac\7$\2\2b`\3\2\2\2ba\3\2\2\2c\23\3\2\2\2de\7\21\2\2ef\7\3"+
		"\2\2fg\5\n\6\2gh\7\4\2\2hi\7\22\2\2ij\5\34\17\2j\25\3\2\2\2kl\7\16\2\2"+
		"lm\5\32\16\2mn\7\17\2\2no\7\3\2\2op\5\n\6\2px\7\4\2\2qr\5\30\r\2rs\7\3"+
		"\2\2st\5\n\6\2tu\7\4\2\2uw\3\2\2\2vq\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2"+
		"\2\2y\27\3\2\2\2zx\3\2\2\2{|\7\20\2\2|\31\3\2\2\2}~\7\7\2\2~\177\5\36"+
		"\20\2\177\u0080\5(\25\2\u0080\u0081\5\36\20\2\u0081\u0082\7\b\2\2\u0082"+
		"\33\3\2\2\2\u0083\u0084\7\7\2\2\u0084\u0085\5\36\20\2\u0085\u0086\5(\25"+
		"\2\u0086\u0087\5\36\20\2\u0087\u0088\7\b\2\2\u0088\35\3\2\2\2\u0089\u008a"+
		"\b\20\1\2\u008a\u008b\7\26\2\2\u008b\u0094\5\36\20\t\u008c\u008d\5 \21"+
		"\2\u008d\u008e\5\36\20\2\u008e\u008f\5\"\22\2\u008f\u0094\3\2\2\2\u0090"+
		"\u0094\7\"\2\2\u0091\u0094\7#\2\2\u0092\u0094\7!\2\2\u0093\u0089\3\2\2"+
		"\2\u0093\u008c\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092"+
		"\3\2\2\2\u0094\u009f\3\2\2\2\u0095\u0096\f\7\2\2\u0096\u0097\5$\23\2\u0097"+
		"\u0098\5\36\20\b\u0098\u009e\3\2\2\2\u0099\u009a\f\6\2\2\u009a\u009b\5"+
		"&\24\2\u009b\u009c\5\36\20\7\u009c\u009e\3\2\2\2\u009d\u0095\3\2\2\2\u009d"+
		"\u0099\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\37\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\7\2\2\u00a3!\3"+
		"\2\2\2\u00a4\u00a5\7\b\2\2\u00a5#\3\2\2\2\u00a6\u00a7\t\3\2\2\u00a7%\3"+
		"\2\2\2\u00a8\u00a9\t\4\2\2\u00a9\'\3\2\2\2\u00aa\u00ab\t\5\2\2\u00ab)"+
		"\3\2\2\2\u00ac\u00ad\7\23\2\2\u00ad\u00b0\7\7\2\2\u00ae\u00b1\7$\2\2\u00af"+
		"\u00b1\5\b\5\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b3\7\b\2\2\u00b3+\3\2\2\2\u00b4\u00b5\7\24\2\2\u00b5\u00b6"+
		"\7\7\2\2\u00b6\u00b7\5\b\5\2\u00b7\u00b8\7\b\2\2\u00b8-\3\2\2\2\16>HM"+
		"SX\\bx\u0093\u009d\u009f\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}