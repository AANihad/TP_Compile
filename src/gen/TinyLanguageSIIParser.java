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
		RULE_cdt = 12, RULE_exp = 13, RULE_opMD = 14, RULE_opPM = 15, RULE_oplog = 16, 
		RULE_ecrire = 17, RULE_lire = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"programme", "declarations", "type", "ids", "instructions", "instruction", 
			"inst_a", "inst_b", "affectation", "boucle", "condition", "instElse", 
			"cdt", "exp", "opMD", "opPM", "oplog", "ecrire", "lire"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "'compil'", "'start'", 
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
			setState(38);
			match(COMPIL);
			setState(39);
			match(NOM_PROGRAMME);
			setState(40);
			match(T__0);
			setState(41);
			match(T__1);
			setState(42);
			match(T__2);
			setState(43);
			declarations(0);
			setState(44);
			match(START);
			setState(45);
			instructions();
			setState(46);
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
			setState(56);
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
					setState(49);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(50);
					type();
					setState(51);
					ids();
					setState(52);
					match(T__4);
					}
					} 
				}
				setState(58);
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
			setState(59);
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
			setState(61);
			match(ID);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(62);
				match(T__5);
				setState(63);
				match(ID);
				}
				}
				setState(68);
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
			setState(69);
			instruction();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DO) | (1L << PRINTFCOMPIL) | (1L << SCANCOMPIL) | (1L << ID))) != 0)) {
				{
				setState(70);
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
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTFCOMPIL:
			case SCANCOMPIL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				inst_a();
				setState(74);
				match(T__4);
				}
				break;
			case IF:
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
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
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				affectation();
				}
				break;
			case SCANCOMPIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				lire();
				}
				break;
			case PRINTFCOMPIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
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
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				condition();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
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
			setState(88);
			match(ID);
			setState(89);
			match(AFF);
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case MOINS:
			case ID:
			case INTEGER:
			case FLOAT:
				{
				setState(90);
				exp(0);
				}
				break;
			case STRING:
				{
				setState(91);
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
		public CdtContext cdt() {
			return getRuleContext(CdtContext.class,0);
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
			setState(94);
			match(DO);
			setState(95);
			match(T__2);
			setState(96);
			instructions();
			setState(97);
			match(T__3);
			setState(98);
			match(WHILE);
			setState(99);
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
			setState(101);
			match(IF);
			setState(102);
			cdt();
			setState(103);
			match(THEN);
			setState(104);
			match(T__2);
			setState(105);
			instructions();
			setState(106);
			match(T__3);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(107);
				instElse();
				setState(108);
				match(T__2);
				setState(109);
				instructions();
				setState(110);
				match(T__3);
				}
				}
				setState(116);
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
			setState(117);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).enterCdt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguageSIIListener ) ((TinyLanguageSIIListener)listener).exitCdt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguageSIIVisitor ) return ((TinyLanguageSIIVisitor<? extends T>)visitor).visitCdt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CdtContext cdt() throws RecognitionException {
		CdtContext _localctx = new CdtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cdt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__0);
			setState(120);
			exp(0);
			setState(121);
			oplog();
			setState(122);
			exp(0);
			setState(123);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOINS:
				{
				setState(126);
				match(MOINS);
				setState(127);
				exp(7);
				}
				break;
			case T__0:
				{
				setState(128);
				match(T__0);
				setState(129);
				exp(0);
				setState(130);
				match(T__1);
				}
				break;
			case INTEGER:
				{
				setState(132);
				match(INTEGER);
				}
				break;
			case FLOAT:
				{
				setState(133);
				match(FLOAT);
				}
				break;
			case ID:
				{
				setState(134);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(137);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(138);
						opMD();
						setState(139);
						exp(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(141);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(142);
						opPM();
						setState(143);
						exp(5);
						}
						break;
					}
					} 
				}
				setState(149);
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
		enterRule(_localctx, 28, RULE_opMD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
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
		enterRule(_localctx, 30, RULE_opPM);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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
		enterRule(_localctx, 32, RULE_oplog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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
		public TerminalNode ID() { return getToken(TinyLanguageSIIParser.ID, 0); }
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
		enterRule(_localctx, 34, RULE_ecrire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(PRINTFCOMPIL);
			setState(157);
			match(T__0);
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(158);
				match(ID);
				}
				break;
			case 2:
				{
				setState(159);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(160);
				ids();
				}
				break;
			}
			setState(163);
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
		enterRule(_localctx, 36, RULE_lire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(SCANCOMPIL);
			setState(166);
			match(T__0);
			setState(167);
			ids();
			setState(168);
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
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00ad\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\4\3\4\3\5\3\5\3\5\7\5C\n\5\f"+
		"\5\16\5F\13\5\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\5"+
		"\bU\n\b\3\t\3\t\5\tY\n\t\3\n\3\n\3\n\3\n\5\n_\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\fs\n\f\f"+
		"\f\16\fv\13\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008a\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u0094\n\17\f\17\16\17\u0097\13\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00a4\n\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\2\4\4\34\25\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&\2\6\3\2\13\r\3\2\27\30\3\2\25\26\3\2\31\36\2\u00aa\2(\3\2"+
		"\2\2\4\62\3\2\2\2\6=\3\2\2\2\b?\3\2\2\2\nG\3\2\2\2\fO\3\2\2\2\16T\3\2"+
		"\2\2\20X\3\2\2\2\22Z\3\2\2\2\24`\3\2\2\2\26g\3\2\2\2\30w\3\2\2\2\32y\3"+
		"\2\2\2\34\u0089\3\2\2\2\36\u0098\3\2\2\2 \u009a\3\2\2\2\"\u009c\3\2\2"+
		"\2$\u009e\3\2\2\2&\u00a7\3\2\2\2()\7\t\2\2)*\7 \2\2*+\7\3\2\2+,\7\4\2"+
		"\2,-\7\5\2\2-.\5\4\3\2./\7\n\2\2/\60\5\n\6\2\60\61\7\6\2\2\61\3\3\2\2"+
		"\2\62:\b\3\1\2\63\64\f\4\2\2\64\65\5\6\4\2\65\66\5\b\5\2\66\67\7\7\2\2"+
		"\679\3\2\2\28\63\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\5\3\2\2\2<:\3"+
		"\2\2\2=>\t\2\2\2>\7\3\2\2\2?D\7!\2\2@A\7\b\2\2AC\7!\2\2B@\3\2\2\2CF\3"+
		"\2\2\2DB\3\2\2\2DE\3\2\2\2E\t\3\2\2\2FD\3\2\2\2GI\5\f\7\2HJ\5\n\6\2IH"+
		"\3\2\2\2IJ\3\2\2\2J\13\3\2\2\2KL\5\16\b\2LM\7\7\2\2MP\3\2\2\2NP\5\20\t"+
		"\2OK\3\2\2\2ON\3\2\2\2P\r\3\2\2\2QU\5\22\n\2RU\5&\24\2SU\5$\23\2TQ\3\2"+
		"\2\2TR\3\2\2\2TS\3\2\2\2U\17\3\2\2\2VY\5\26\f\2WY\5\24\13\2XV\3\2\2\2"+
		"XW\3\2\2\2Y\21\3\2\2\2Z[\7!\2\2[^\7\37\2\2\\_\5\34\17\2]_\7$\2\2^\\\3"+
		"\2\2\2^]\3\2\2\2_\23\3\2\2\2`a\7\21\2\2ab\7\5\2\2bc\5\n\6\2cd\7\6\2\2"+
		"de\7\22\2\2ef\5\32\16\2f\25\3\2\2\2gh\7\16\2\2hi\5\32\16\2ij\7\17\2\2"+
		"jk\7\5\2\2kl\5\n\6\2lt\7\6\2\2mn\5\30\r\2no\7\5\2\2op\5\n\6\2pq\7\6\2"+
		"\2qs\3\2\2\2rm\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\27\3\2\2\2vt\3\2"+
		"\2\2wx\7\20\2\2x\31\3\2\2\2yz\7\3\2\2z{\5\34\17\2{|\5\"\22\2|}\5\34\17"+
		"\2}~\7\4\2\2~\33\3\2\2\2\177\u0080\b\17\1\2\u0080\u0081\7\26\2\2\u0081"+
		"\u008a\5\34\17\t\u0082\u0083\7\3\2\2\u0083\u0084\5\34\17\2\u0084\u0085"+
		"\7\4\2\2\u0085\u008a\3\2\2\2\u0086\u008a\7\"\2\2\u0087\u008a\7#\2\2\u0088"+
		"\u008a\7!\2\2\u0089\177\3\2\2\2\u0089\u0082\3\2\2\2\u0089\u0086\3\2\2"+
		"\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u0095\3\2\2\2\u008b\u008c"+
		"\f\7\2\2\u008c\u008d\5\36\20\2\u008d\u008e\5\34\17\b\u008e\u0094\3\2\2"+
		"\2\u008f\u0090\f\6\2\2\u0090\u0091\5 \21\2\u0091\u0092\5\34\17\7\u0092"+
		"\u0094\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u008f\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\35\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u0099\t\3\2\2\u0099\37\3\2\2\2\u009a\u009b\t\4\2\2\u009b"+
		"!\3\2\2\2\u009c\u009d\t\5\2\2\u009d#\3\2\2\2\u009e\u009f\7\23\2\2\u009f"+
		"\u00a3\7\3\2\2\u00a0\u00a4\7!\2\2\u00a1\u00a4\7$\2\2\u00a2\u00a4\5\b\5"+
		"\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a6\7\4\2\2\u00a6%\3\2\2\2\u00a7\u00a8\7\24\2\2\u00a8"+
		"\u00a9\7\3\2\2\u00a9\u00aa\5\b\5\2\u00aa\u00ab\7\4\2\2\u00ab\'\3\2\2\2"+
		"\16:DIOTX^t\u0089\u0093\u0095\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}