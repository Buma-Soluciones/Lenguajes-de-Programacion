// Generated from C:/Users/sebas/Music/nuevo repo/Lenguajes-de-Programacion/TranslateSR/Grammar\SR.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SRParser}.
 */
public interface SRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SRParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(SRParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(SRParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SRParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SRParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#list_declarations}.
	 * @param ctx the parse tree
	 */
	void enterList_declarations(SRParser.List_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#list_declarations}.
	 * @param ctx the parse tree
	 */
	void exitList_declarations(SRParser.List_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(SRParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(SRParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#asign}.
	 * @param ctx the parse tree
	 */
	void enterAsign(SRParser.AsignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#asign}.
	 * @param ctx the parse tree
	 */
	void exitAsign(SRParser.AsignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#init_var}.
	 * @param ctx the parse tree
	 */
	void enterInit_var(SRParser.Init_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#init_var}.
	 * @param ctx the parse tree
	 */
	void exitInit_var(SRParser.Init_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#init_const}.
	 * @param ctx the parse tree
	 */
	void enterInit_const(SRParser.Init_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#init_const}.
	 * @param ctx the parse tree
	 */
	void exitInit_const(SRParser.Init_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SRParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SRParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(SRParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(SRParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SRParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SRParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#bin_exp}.
	 * @param ctx the parse tree
	 */
	void enterBin_exp(SRParser.Bin_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#bin_exp}.
	 * @param ctx the parse tree
	 */
	void exitBin_exp(SRParser.Bin_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#reserve_funct}.
	 * @param ctx the parse tree
	 */
	void enterReserve_funct(SRParser.Reserve_functContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#reserve_funct}.
	 * @param ctx the parse tree
	 */
	void exitReserve_funct(SRParser.Reserve_functContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#control_struc}.
	 * @param ctx the parse tree
	 */
	void enterControl_struc(SRParser.Control_strucContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#control_struc}.
	 * @param ctx the parse tree
	 */
	void exitControl_struc(SRParser.Control_strucContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#for_all}.
	 * @param ctx the parse tree
	 */
	void enterFor_all(SRParser.For_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#for_all}.
	 * @param ctx the parse tree
	 */
	void exitFor_all(SRParser.For_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#cuantificador}.
	 * @param ctx the parse tree
	 */
	void enterCuantificador(SRParser.CuantificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#cuantificador}.
	 * @param ctx the parse tree
	 */
	void exitCuantificador(SRParser.CuantificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#iff}.
	 * @param ctx the parse tree
	 */
	void enterIff(SRParser.IffContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#iff}.
	 * @param ctx the parse tree
	 */
	void exitIff(SRParser.IffContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#elsee}.
	 * @param ctx the parse tree
	 */
	void enterElsee(SRParser.ElseeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#elsee}.
	 * @param ctx the parse tree
	 */
	void exitElsee(SRParser.ElseeContext ctx);
}