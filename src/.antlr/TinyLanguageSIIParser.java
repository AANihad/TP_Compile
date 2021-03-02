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
		RULE_exp = 12, RULE_b = 13, RULE_c = 14, RULE_val = 15, RULE_op_moindre_prio = 16, 
		RULE_op_prio = 17, RULE_oplog = 18, RULE_ecrire = 19, RULE_lire = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"programme", "declarations", "type", "ids", "instructions", "instruction", 
			"inst_a", "inst_b", "affectation", "boucle", "condition", "cdt", "exp", 
			"b", "c", "val", "op_moindre_prio", "op_prio", "oplog", "ecrire", "lire"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "'compil'", "'start'", 
			"'intCompil'", "'floatCompil'", "'stringCompil'", "'if'", "'then'", "'else'", 
			"'do'", "'while'", "'printfCompil'", "'scanCompil'", "'+'", "'-'", "'*'", 
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
			setState(42);
			match(COMPIL);
			setState(43);
			match(NOM_PROGRAMME);
			setState(44);
			match(T__0);
			setState(45);
			match(T__1);
			setState(46);
			match(T__2);
			setState(47);
			declarations(0);
			setState(48);
			match(START);
			setState(49);
			instructions();
			setState(50);
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
					match(T__4);
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
			while (_la==T__5) {
				{
				{
				setState(66);
				match(T__5);
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
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instructions);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				instruction();
				setState(74);
				instructions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
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
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTFCOMPIL:
			case SCANCOMPIL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				inst_a();
				setState(80);
				match(T__4);
				}
				break;
			case IF:
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				affectation();
				}
				break;
			case SCANCOMPIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				lire();
				}
				break;
			case PRINTFCOMPIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				condition();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
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
			setState(94);
			match(ID);
			setState(95);
			match(AFF);
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(96);
				exp(0);
				}
				break;
			case 2:
				{
				setState(97);
				match(ID);
				}
				break;
			case 3:
				{
				setState(98);
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
			setState(101);
			match(DO);
			setState(102);
			match(T__2);
			setState(103);
			instructions();
			setState(104);
			match(T__3);
			setState(105);
			match(WHILE);
			setState(106);
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
			setState(108);
			match(IF);
			setState(109);
			cdt();
			setState(110);
			match(THEN);
			setState(111);
			match(T__2);
			setState(112);
			instructions();
			setState(113);
			match(T__3);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(114);
				match(ELSE);
				setState(115);
				match(T__2);
				setState(116);
				instructions();
				setState(117);
				match(T__3);
				}
				}
				setState(123);
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
			setState(124);
			match(T__0);
			setState(125);
			exp(0);
			setState(126);
			oplog();
			setState(127);
			exp(0);
			setState(128);
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
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Op_moindre_prioContext op_moindre_prio() {
			return getRuleContext(Op_moindre_prioContext.class,0);
		}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(131);
			b(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(133);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(134);
					op_moindre_prio();
					setState(135);
					b(0);
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class BContext extends ParserRuleContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public Op_prioContext op_prio() {
			return getRuleContext(Op_prioContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
	}

	public final BContext b() throws RecognitionException {
		return b(0);
	}

	private BContext b(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BContext _localctx = new BContext(_ctx, _parentState);
		BContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_b, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(143);
			c();
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_b);
					setState(145);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(146);
					op_prio();
					setState(147);
					c();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class CContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(TinyLanguageSIIParser.ID, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_c);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(T__0);
				setState(155);
				exp(0);
				setState(156);
				match(T__1);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(ID);
				}
				break;
			case INTEGER:
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				val();
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TinyLanguageSIIParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(TinyLanguageSIIParser.FLOAT, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_val);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(INTEGER);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(FLOAT);

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

	public static class Op_moindre_prioContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(TinyLanguageSIIParser.PLUS, 0); }
		public TerminalNode MOINS() { return getToken(TinyLanguageSIIParser.MOINS, 0); }
		public Op_moindre_prioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_moindre_prio; }
	}

	public final Op_moindre_prioContext op_moindre_prio() throws RecognitionException {
		Op_moindre_prioContext _localctx = new Op_moindre_prioContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_op_moindre_prio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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

	public static class Op_prioContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(TinyLanguageSIIParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TinyLanguageSIIParser.DIV, 0); }
		public Op_prioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_prio; }
	}

	public final Op_prioContext op_prio() throws RecognitionException {
		Op_prioContext _localctx = new Op_prioContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op_prio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
		enterRule(_localctx, 36, RULE_oplog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
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
		enterRule(_localctx, 38, RULE_ecrire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(PRINTFCOMPIL);
			setState(174);
			match(T__0);
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(175);
				match(ID);
				}
				break;
			case 2:
				{
				setState(176);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(177);
				ids();
				}
				break;
			}
			setState(180);
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
		enterRule(_localctx, 40, RULE_lire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(SCANCOMPIL);
			setState(183);
			match(T__0);
			setState(184);
			ids();
			setState(185);
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
		case 13:
			return b_sempred((BContext)_localctx, predIndex);
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
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean b_sempred(BContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\4\3\4\3\5"+
		"\3\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\6\3\6\3\6\3\6\5\6P\n\6\3\7\3\7\3\7"+
		"\3\7\5\7V\n\7\3\b\3\b\3\b\5\b[\n\b\3\t\3\t\5\t_\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\5\nf\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\fz\n\f\f\f\16\f}\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u008c\n\16\f\16\16\16\u008f\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0098\n\17\f\17\16\17\u009b"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a3\n\20\3\21\3\21\3\21\5"+
		"\21\u00a8\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00b5\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\2\5\4\32\34\27"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\6\3\2\13\r\3\2\25\26"+
		"\3\2\27\30\3\2\31\34\2\u00b9\2,\3\2\2\2\4\66\3\2\2\2\6A\3\2\2\2\bC\3\2"+
		"\2\2\nO\3\2\2\2\fU\3\2\2\2\16Z\3\2\2\2\20^\3\2\2\2\22`\3\2\2\2\24g\3\2"+
		"\2\2\26n\3\2\2\2\30~\3\2\2\2\32\u0084\3\2\2\2\34\u0090\3\2\2\2\36\u00a2"+
		"\3\2\2\2 \u00a7\3\2\2\2\"\u00a9\3\2\2\2$\u00ab\3\2\2\2&\u00ad\3\2\2\2"+
		"(\u00af\3\2\2\2*\u00b8\3\2\2\2,-\7\t\2\2-.\7\36\2\2./\7\3\2\2/\60\7\4"+
		"\2\2\60\61\7\5\2\2\61\62\5\4\3\2\62\63\7\n\2\2\63\64\5\n\6\2\64\65\7\6"+
		"\2\2\65\3\3\2\2\2\66>\b\3\1\2\678\f\4\2\289\5\6\4\29:\5\b\5\2:;\7\7\2"+
		"\2;=\3\2\2\2<\67\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\5\3\2\2\2@>\3"+
		"\2\2\2AB\t\2\2\2B\7\3\2\2\2CH\7\37\2\2DE\7\b\2\2EG\7\37\2\2FD\3\2\2\2"+
		"GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\t\3\2\2\2JH\3\2\2\2KL\5\f\7\2LM\5\n\6"+
		"\2MP\3\2\2\2NP\5\f\7\2OK\3\2\2\2ON\3\2\2\2P\13\3\2\2\2QR\5\16\b\2RS\7"+
		"\7\2\2SV\3\2\2\2TV\5\20\t\2UQ\3\2\2\2UT\3\2\2\2V\r\3\2\2\2W[\5\22\n\2"+
		"X[\5*\26\2Y[\5(\25\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\17\3\2\2\2\\_\5\26"+
		"\f\2]_\5\24\13\2^\\\3\2\2\2^]\3\2\2\2_\21\3\2\2\2`a\7\37\2\2ae\7\35\2"+
		"\2bf\5\32\16\2cf\7\37\2\2df\7\"\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\23"+
		"\3\2\2\2gh\7\21\2\2hi\7\5\2\2ij\5\n\6\2jk\7\6\2\2kl\7\22\2\2lm\5\30\r"+
		"\2m\25\3\2\2\2no\7\16\2\2op\5\30\r\2pq\7\17\2\2qr\7\5\2\2rs\5\n\6\2s{"+
		"\7\6\2\2tu\7\20\2\2uv\7\5\2\2vw\5\n\6\2wx\7\6\2\2xz\3\2\2\2yt\3\2\2\2"+
		"z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\27\3\2\2\2}{\3\2\2\2~\177\7\3\2\2\177"+
		"\u0080\5\32\16\2\u0080\u0081\5&\24\2\u0081\u0082\5\32\16\2\u0082\u0083"+
		"\7\4\2\2\u0083\31\3\2\2\2\u0084\u0085\b\16\1\2\u0085\u0086\5\34\17\2\u0086"+
		"\u008d\3\2\2\2\u0087\u0088\f\4\2\2\u0088\u0089\5\"\22\2\u0089\u008a\5"+
		"\34\17\2\u008a\u008c\3\2\2\2\u008b\u0087\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\33\3\2\2\2\u008f\u008d\3\2\2"+
		"\2\u0090\u0091\b\17\1\2\u0091\u0092\5\36\20\2\u0092\u0099\3\2\2\2\u0093"+
		"\u0094\f\4\2\2\u0094\u0095\5$\23\2\u0095\u0096\5\36\20\2\u0096\u0098\3"+
		"\2\2\2\u0097\u0093\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\35\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\3\2"+
		"\2\u009d\u009e\5\32\16\2\u009e\u009f\7\4\2\2\u009f\u00a3\3\2\2\2\u00a0"+
		"\u00a3\7\37\2\2\u00a1\u00a3\5 \21\2\u00a2\u009c\3\2\2\2\u00a2\u00a0\3"+
		"\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\37\3\2\2\2\u00a4\u00a8\7 \2\2\u00a5\u00a6"+
		"\7!\2\2\u00a6\u00a8\b\21\1\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"!\3\2\2\2\u00a9\u00aa\t\3\2\2\u00aa#\3\2\2\2\u00ab\u00ac\t\4\2\2\u00ac"+
		"%\3\2\2\2\u00ad\u00ae\t\5\2\2\u00ae\'\3\2\2\2\u00af\u00b0\7\23\2\2\u00b0"+
		"\u00b4\7\3\2\2\u00b1\u00b5\7\37\2\2\u00b2\u00b5\7\"\2\2\u00b3\u00b5\5"+
		"\b\5\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\7\4\2\2\u00b7)\3\2\2\2\u00b8\u00b9\7\24\2\2"+
		"\u00b9\u00ba\7\3\2\2\u00ba\u00bb\5\b\5\2\u00bb\u00bc\7\4\2\2\u00bc+\3"+
		"\2\2\2\17>HOUZ^e{\u008d\u0099\u00a2\u00a7\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}