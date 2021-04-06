// Generated from E:/Documents/IdeaProjects/TP_Compile/src\TinyLanguageSII.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TinyLanguageSIIParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TinyLanguageSIIVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(TinyLanguageSIIParser.ProgrammeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(TinyLanguageSIIParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TinyLanguageSIIParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(TinyLanguageSIIParser.IdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(TinyLanguageSIIParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(TinyLanguageSIIParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#inst_a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_a(TinyLanguageSIIParser.Inst_aContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#inst_b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_b(TinyLanguageSIIParser.Inst_bContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectation(TinyLanguageSIIParser.AffectationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#boucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoucle(TinyLanguageSIIParser.BoucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(TinyLanguageSIIParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#instElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstElse(TinyLanguageSIIParser.InstElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#cdtIF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdtIF(TinyLanguageSIIParser.CdtIFContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#cdtDO}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdtDO(TinyLanguageSIIParser.CdtDOContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(TinyLanguageSIIParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#opMD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMD(TinyLanguageSIIParser.OpMDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#opPM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpPM(TinyLanguageSIIParser.OpPMContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#oplog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOplog(TinyLanguageSIIParser.OplogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#ecrire}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcrire(TinyLanguageSIIParser.EcrireContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguageSIIParser#lire}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLire(TinyLanguageSIIParser.LireContext ctx);
}