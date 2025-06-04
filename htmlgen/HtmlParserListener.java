// Generated from D:/Antlr/AngularCompiler2/src/HtmlParser.g4 by ANTLR 4.13.2
package htmlgen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlParser}.
 */
public interface HtmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtmlParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(HtmlParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(HtmlParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(HtmlParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(HtmlParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(HtmlParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(HtmlParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#normalTag}.
	 * @param ctx the parse tree
	 */
	void enterNormalTag(HtmlParser.NormalTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#normalTag}.
	 * @param ctx the parse tree
	 */
	void exitNormalTag(HtmlParser.NormalTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(HtmlParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(HtmlParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(HtmlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(HtmlParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(HtmlParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(HtmlParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(HtmlParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(HtmlParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tagBody}.
	 * @param ctx the parse tree
	 */
	void enterTagBody(HtmlParser.TagBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tagBody}.
	 * @param ctx the parse tree
	 */
	void exitTagBody(HtmlParser.TagBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#enterpolation}.
	 * @param ctx the parse tree
	 */
	void enterEnterpolation(HtmlParser.EnterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#enterpolation}.
	 * @param ctx the parse tree
	 */
	void exitEnterpolation(HtmlParser.EnterpolationContext ctx);
}