// Generated from D:/Antlr/AngularCompiler2/src/CssParser.g4 by ANTLR 4.13.2
package cssgen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CssParser}.
 */
public interface CssParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CssParser#cssFile}.
	 * @param ctx the parse tree
	 */
	void enterCssFile(CssParser.CssFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#cssFile}.
	 * @param ctx the parse tree
	 */
	void exitCssFile(CssParser.CssFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#cssStyles}.
	 * @param ctx the parse tree
	 */
	void enterCssStyles(CssParser.CssStylesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#cssStyles}.
	 * @param ctx the parse tree
	 */
	void exitCssStyles(CssParser.CssStylesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#pseudoClass}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClass(CssParser.PseudoClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#pseudoClass}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClass(CssParser.PseudoClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#pseudoElement}.
	 * @param ctx the parse tree
	 */
	void enterPseudoElement(CssParser.PseudoElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#pseudoElement}.
	 * @param ctx the parse tree
	 */
	void exitPseudoElement(CssParser.PseudoElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CssParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CssParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(CssParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(CssParser.FunctioncallContext ctx);
}