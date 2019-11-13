// Generated from C:/Users/sebas/Music/nuevo repo/Lenguajes-de-Programacion/TranslateSR/Grammar\SR.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SRParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SRVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SRParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(SRParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SRParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#list_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_declarations(SRParser.List_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(SRParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#asign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsign(SRParser.AsignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#init_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_var(SRParser.Init_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#init_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_const(SRParser.Init_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SRParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(SRParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SRParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#bin_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_exp(SRParser.Bin_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#reserve_funct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserve_funct(SRParser.Reserve_functContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#control_struc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_struc(SRParser.Control_strucContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#for_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_all(SRParser.For_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#cuantificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuantificador(SRParser.CuantificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#iff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIff(SRParser.IffContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#elsee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsee(SRParser.ElseeContext ctx);
}