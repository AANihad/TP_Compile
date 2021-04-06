// Generated from E:/Documents/IdeaProjects/TP_Compile/src\TinyLanguageSII.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TinyLanguageSIIParser}.
 */
public interface TinyLanguageSIIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(TinyLanguageSIIParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(TinyLanguageSIIParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(TinyLanguageSIIParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(TinyLanguageSIIParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TinyLanguageSIIParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TinyLanguageSIIParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(TinyLanguageSIIParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(TinyLanguageSIIParser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(TinyLanguageSIIParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(TinyLanguageSIIParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(TinyLanguageSIIParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(TinyLanguageSIIParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#inst_a}.
	 * @param ctx the parse tree
	 */
	void enterInst_a(TinyLanguageSIIParser.Inst_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#inst_a}.
	 * @param ctx the parse tree
	 */
	void exitInst_a(TinyLanguageSIIParser.Inst_aContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#inst_b}.
	 * @param ctx the parse tree
	 */
	void enterInst_b(TinyLanguageSIIParser.Inst_bContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#inst_b}.
	 * @param ctx the parse tree
	 */
	void exitInst_b(TinyLanguageSIIParser.Inst_bContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectation(TinyLanguageSIIParser.AffectationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectation(TinyLanguageSIIParser.AffectationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#boucle}.
	 * @param ctx the parse tree
	 */
	void enterBoucle(TinyLanguageSIIParser.BoucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#boucle}.
	 * @param ctx the parse tree
	 */
	void exitBoucle(TinyLanguageSIIParser.BoucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(TinyLanguageSIIParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(TinyLanguageSIIParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#instElse}.
	 * @param ctx the parse tree
	 */
	void enterInstElse(TinyLanguageSIIParser.InstElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#instElse}.
	 * @param ctx the parse tree
	 */
	void exitInstElse(TinyLanguageSIIParser.InstElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#cdtIF}.
	 * @param ctx the parse tree
	 */
	void enterCdtIF(TinyLanguageSIIParser.CdtIFContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#cdtIF}.
	 * @param ctx the parse tree
	 */
	void exitCdtIF(TinyLanguageSIIParser.CdtIFContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#cdtDO}.
	 * @param ctx the parse tree
	 */
	void enterCdtDO(TinyLanguageSIIParser.CdtDOContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#cdtDO}.
	 * @param ctx the parse tree
	 */
	void exitCdtDO(TinyLanguageSIIParser.CdtDOContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(TinyLanguageSIIParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(TinyLanguageSIIParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#opMD}.
	 * @param ctx the parse tree
	 */
	void enterOpMD(TinyLanguageSIIParser.OpMDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#opMD}.
	 * @param ctx the parse tree
	 */
	void exitOpMD(TinyLanguageSIIParser.OpMDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#opPM}.
	 * @param ctx the parse tree
	 */
	void enterOpPM(TinyLanguageSIIParser.OpPMContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#opPM}.
	 * @param ctx the parse tree
	 */
	void exitOpPM(TinyLanguageSIIParser.OpPMContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#oplog}.
	 * @param ctx the parse tree
	 */
	void enterOplog(TinyLanguageSIIParser.OplogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#oplog}.
	 * @param ctx the parse tree
	 */
	void exitOplog(TinyLanguageSIIParser.OplogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#ecrire}.
	 * @param ctx the parse tree
	 */
	void enterEcrire(TinyLanguageSIIParser.EcrireContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#ecrire}.
	 * @param ctx the parse tree
	 */
	void exitEcrire(TinyLanguageSIIParser.EcrireContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguageSIIParser#lire}.
	 * @param ctx the parse tree
	 */
	void enterLire(TinyLanguageSIIParser.LireContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguageSIIParser#lire}.
	 * @param ctx the parse tree
	 */
	void exitLire(TinyLanguageSIIParser.LireContext ctx);
}