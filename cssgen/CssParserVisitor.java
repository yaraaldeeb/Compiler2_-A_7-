// Generated from D:/Antlr/AngularCompiler2/src/CssParser.g4 by ANTLR 4.13.2
package cssgen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CssParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CssParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CssParser#cssFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFile(CssParser.CssFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#cssStyles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStyles(CssParser.CssStylesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#pseudoClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoClass(CssParser.PseudoClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#pseudoElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoElement(CssParser.PseudoElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CssParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(CssParser.FunctioncallContext ctx);
}