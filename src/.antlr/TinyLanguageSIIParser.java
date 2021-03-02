// Generated from e:\Documents\IdeaProjects\TP_Compile\src\TinyLanguageSII.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, COMPIL=7, START=8, INTCOMPIL=9, 
		FLOATCOMPIL=10, STRINGCOMPIL=11, IF=12, THEN=13, ELSE=14, DO=15, WHILE=16, 
		PRINTFCOMPIL=17, SCANCOMPIL=18, PLUS=19, MOINS=20, MUL=21, DIV=22, SUP=23, 
		INF=24, EGAL=25, DIFF=26, AFF=27, NOM_PROGRAMME=28, ID=29, INTEGER=30, 
		FLOAT=31, STRING=32, UNELIGNE=33, MULTILIGNE=34, WS=35;
	public static final int
		RULE_programme = 0, RULE_declarations = 1, RULE_type = 2, RULE_ids = 3, 
		RULE_instructions = 4, RULE_instruction = 5, RULE_inst_a = 6, RULE_inst_b = 7, 
		RULE_affectation = 8, RULE_boucle = 9, RULE_condition = 10, RULE_cdt = 11, 
		RULE_exp = 12, RULE_oplog = 13, RULE_ecrire = 14, RULE_lire = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programme", "declarations", "type", "ids", "instructions", "instruction", 
			"inst_a", "inst_b", "affectation", "boucle", "condition", "cdt", "exp", 
			"oplog", "ecrire", "lire"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "'compil'", "'start'", 
			"'intCompil'", "'floatCompil'", "'stringCompil'", "'if'", "'then'", "'else'", 
			"'do'", "'while'", "'printCompil'", "'scanCompil'", "'+'", "'-'", "'*'", 
			"'/'", "'>'", "'<'", "'=='", "'!='", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "COMPIL", "START", "INTCOMPIL", 
			"FLOATCOMPIL", "STRINGCOMPIL", "IF", "THEN", "ELSE", "DO", "WHILE", "PRINTFCOMPIL", 
			"SCANCOMPIL", "PLUS", "MOINS", "MUL", "DIV", "SUP", "INF", "EGAL", "DIFF", 
			"AFF", "NOM_PROGRAMME", "ID", "INTEGER", "FLOAT", "STRING", "UNELIGNE", 
			"MULTILIGNE", "WS"
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
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(COMPIL);
			setState(33);
			match(NOM_PROGRAMME);
			setState(34);
			match(T__0);
			setState(35);
			match(T__1);
			setState(36);
			match(T__2);
			setState(37);
			declarations(0);
			setState(38);
			match(START);
			setState(39);
			instructions();
			setState(40);
			match(T__3);
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
			setState(50);
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
					setState(43);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(44);
					type();
					setState(45);
					ids();
					setState(46);
					match(T__4);
					}
					} 
				}
				setState(52);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
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
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(ID);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(56);
				match(T__5);
				setState(57);
				match(ID);
				}
				}
				setState(62);
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
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instructions);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				instruction();
				setState(64);
				instructions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				instruction();
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
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruction);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTFCOMPIL:
			case SCANCOMPIL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				inst_a();
				setState(70);
				match(T__4);
				}
				break;
			case IF:
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
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
	}

	public final Inst_aContext inst_a() throws RecognitionException {
		Inst_aContext _localctx = new Inst_aContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inst_a);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				affectation();
				}
				break;
			case SCANCOMPIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				lire();
				}
				break;
			case PRINTFCOMPIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
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
	}

	public final Inst_bContext inst_b() throws RecognitionException {
		Inst_bContext _localctx = new Inst_bContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inst_b);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				condition();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
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
		public List<TerminalNode> ID() { return getTokens(TinyLanguageSIIParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TinyLanguageSIIParser.ID, i);
		}
		public TerminalNode AFF() { return getToken(TinyLanguageSIIParser.AFF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode STRING() { return getToken(TinyLanguageSIIParser.STRING, 0); }
		public AffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectation; }
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_affectation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ID);
			setState(85);
			match(AFF);
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(86);
				exp(0);
				}
				break;
			case 2:
				{
				setState(87);
				match(ID);
				}
				break;
			case 3:
				{
				setState(88);
				match(STRING);
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

	public static class BoucleContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(TinyLanguageSIIParser.DO, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(TinyLanguageSIIParser.WHILE, 0); }
		public CdtContext cdt() {
			return getRuleContext(CdtContext.class,0);
		}
		public BoucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boucle; }
	}

	public final BoucleContext boucle() throws RecognitionException {
		BoucleContext _localctx = new BoucleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(DO);
			setState(92);
			match(T__2);
			setState(93);
			instructions();
			setState(94);
			match(T__3);
			setState(95);
			match(WHILE);
			setState(96);
			cdt();
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
		public CdtContext cdt() {
			return getRuleContext(CdtContext.class,0);
		}
		public TerminalNode THEN() { return getToken(TinyLanguageSIIParser.THEN, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(TinyLanguageSIIParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(TinyLanguageSIIParser.ELSE, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(IF);
			setState(99);
			cdt();
			setState(100);
			match(THEN);
			setState(101);
			match(T__2);
			setState(102);
			instructions();
			setState(103);
			match(T__3);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(104);
				match(ELSE);
				setState(105);
				match(T__2);
				setState(106);
				instructions();
				setState(107);
				match(T__3);
				}
				}
				setState(113);
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

	public static class CdtContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public CdtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cdt; }
	}

	public final CdtContext cdt() throws RecognitionException {
		CdtContext _localctx = new CdtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cdt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__0);
			setState(115);
			exp(0);
			setState(116);
			oplog();
			setState(117);
			exp(0);
			setState(118);
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode MOINS() { return getToken(TinyLanguageSIIParser.MOINS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode INTEGER() { return getToken(TinyLanguageSIIParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(TinyLanguageSIIParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(TinyLanguageSIIParser.ID, 0); }
		public TerminalNode MUL() { return getToken(TinyLanguageSIIParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TinyLanguageSIIParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(TinyLanguageSIIParser.PLUS, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOINS:
				{
				setState(121);
				match(MOINS);
				setState(122);
				exp(7);
				}
				break;
			case T__0:
				{
				setState(123);
				match(T__0);
				setState(124);
				exp(0);
				setState(125);
				match(T__1);
				}
				break;
			case INTEGER:
				{
				setState(127);
				match(INTEGER);
				}
				break;
			case FLOAT:
				{
				setState(128);
				match(FLOAT);
				}
				break;
			case ID:
				{
				setState(129);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(134);
						exp(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(135);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(136);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MOINS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(137);
						exp(5);
						}
						break;
					}
					} 
				}
				setState(142);
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

	public static class OplogContext extends ParserRuleContext {
		public TerminalNode SUP() { return getToken(TinyLanguageSIIParser.SUP, 0); }
		public TerminalNode INF() { return getToken(TinyLanguageSIIParser.INF, 0); }
		public TerminalNode EGAL() { return getToken(TinyLanguageSIIParser.EGAL, 0); }
		public TerminalNode DIFF() { return getToken(TinyLanguageSIIParser.DIFF, 0); }
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_oplog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUP) | (1L << INF) | (1L << EGAL) | (1L << DIFF))) != 0)) ) {
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
		public TerminalNode ID() { return getToken(TinyLanguageSIIParser.ID, 0); }
		public TerminalNode STRING() { return getToken(TinyLanguageSIIParser.STRING, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public EcrireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ecrire; }
	}

	public final EcrireContext ecrire() throws RecognitionException {
		EcrireContext _localctx = new EcrireContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ecrire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(PRINTFCOMPIL);
			setState(146);
			match(T__0);
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(147);
				match(ID);
				}
				break;
			case 2:
				{
				setState(148);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(149);
				ids();
				}
				break;
			}
			setState(152);
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

	public static class LireContext extends ParserRuleContext {
		public TerminalNode SCANCOMPIL() { return getToken(TinyLanguageSIIParser.SCANCOMPIL, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public LireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lire; }
	}

	public final LireContext lire() throws RecognitionException {
		LireContext _localctx = new LireContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(SCANCOMPIL);
			setState(155);
			match(T__0);
			setState(156);
			ids();
			setState(157);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return declarations_sempred((DeclarationsContext)_localctx, predIndex);
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00a2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\63\n\3\f\3"+
		"\16\3\66\13\3\3\4\3\4\3\5\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\6\3\6\3\6"+
		"\3\6\5\6F\n\6\3\7\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\5\bQ\n\b\3\t\3\t\5"+
		"\tU\n\t\3\n\3\n\3\n\3\n\3\n\5\n\\\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\fp\n\f\f\f\16\fs\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0085\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u008d\n\16\f"+
		"\16\16\16\u0090\13\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u0099\n"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\2\4\4\32\22\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \2\6\3\2\13\r\3\2\27\30\3\2\25\26\3\2\31\34\2"+
		"\u00a3\2\"\3\2\2\2\4,\3\2\2\2\6\67\3\2\2\2\b9\3\2\2\2\nE\3\2\2\2\fK\3"+
		"\2\2\2\16P\3\2\2\2\20T\3\2\2\2\22V\3\2\2\2\24]\3\2\2\2\26d\3\2\2\2\30"+
		"t\3\2\2\2\32\u0084\3\2\2\2\34\u0091\3\2\2\2\36\u0093\3\2\2\2 \u009c\3"+
		"\2\2\2\"#\7\t\2\2#$\7\36\2\2$%\7\3\2\2%&\7\4\2\2&\'\7\5\2\2\'(\5\4\3\2"+
		"()\7\n\2\2)*\5\n\6\2*+\7\6\2\2+\3\3\2\2\2,\64\b\3\1\2-.\f\4\2\2./\5\6"+
		"\4\2/\60\5\b\5\2\60\61\7\7\2\2\61\63\3\2\2\2\62-\3\2\2\2\63\66\3\2\2\2"+
		"\64\62\3\2\2\2\64\65\3\2\2\2\65\5\3\2\2\2\66\64\3\2\2\2\678\t\2\2\28\7"+
		"\3\2\2\29>\7\37\2\2:;\7\b\2\2;=\7\37\2\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2"+
		">?\3\2\2\2?\t\3\2\2\2@>\3\2\2\2AB\5\f\7\2BC\5\n\6\2CF\3\2\2\2DF\5\f\7"+
		"\2EA\3\2\2\2ED\3\2\2\2F\13\3\2\2\2GH\5\16\b\2HI\7\7\2\2IL\3\2\2\2JL\5"+
		"\20\t\2KG\3\2\2\2KJ\3\2\2\2L\r\3\2\2\2MQ\5\22\n\2NQ\5 \21\2OQ\5\36\20"+
		"\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\17\3\2\2\2RU\5\26\f\2SU\5\24\13\2TR"+
		"\3\2\2\2TS\3\2\2\2U\21\3\2\2\2VW\7\37\2\2W[\7\35\2\2X\\\5\32\16\2Y\\\7"+
		"\37\2\2Z\\\7\"\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\23\3\2\2\2]^\7\21\2"+
		"\2^_\7\5\2\2_`\5\n\6\2`a\7\6\2\2ab\7\22\2\2bc\5\30\r\2c\25\3\2\2\2de\7"+
		"\16\2\2ef\5\30\r\2fg\7\17\2\2gh\7\5\2\2hi\5\n\6\2iq\7\6\2\2jk\7\20\2\2"+
		"kl\7\5\2\2lm\5\n\6\2mn\7\6\2\2np\3\2\2\2oj\3\2\2\2ps\3\2\2\2qo\3\2\2\2"+
		"qr\3\2\2\2r\27\3\2\2\2sq\3\2\2\2tu\7\3\2\2uv\5\32\16\2vw\5\34\17\2wx\5"+
		"\32\16\2xy\7\4\2\2y\31\3\2\2\2z{\b\16\1\2{|\7\26\2\2|\u0085\5\32\16\t"+
		"}~\7\3\2\2~\177\5\32\16\2\177\u0080\7\4\2\2\u0080\u0085\3\2\2\2\u0081"+
		"\u0085\7 \2\2\u0082\u0085\7!\2\2\u0083\u0085\7\37\2\2\u0084z\3\2\2\2\u0084"+
		"}\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2"+
		"\u0085\u008e\3\2\2\2\u0086\u0087\f\7\2\2\u0087\u0088\t\3\2\2\u0088\u008d"+
		"\5\32\16\b\u0089\u008a\f\6\2\2\u008a\u008b\t\4\2\2\u008b\u008d\5\32\16"+
		"\7\u008c\u0086\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\33\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\t\5\2\2\u0092\35\3\2\2\2\u0093\u0094\7\23\2\2\u0094\u0098\7\3\2"+
		"\2\u0095\u0099\7\37\2\2\u0096\u0099\7\"\2\2\u0097\u0099\5\b\5\2\u0098"+
		"\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009b\7\4\2\2\u009b\37\3\2\2\2\u009c\u009d\7\24\2\2\u009d\u009e"+
		"\7\3\2\2\u009e\u009f\5\b\5\2\u009f\u00a0\7\4\2\2\u00a0!\3\2\2\2\16\64"+
		">EKPT[q\u0084\u008c\u008e\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}