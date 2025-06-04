// Generated from D:/Antlr/AngularCompiler2/src/HtmlParser.g4 by ANTLR 4.13.2
package htmlgen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HtmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HtmlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HtmlParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(HtmlParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTags(HtmlParser.TagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(HtmlParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#normalTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalTag(HtmlParser.NormalTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(HtmlParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(HtmlParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(HtmlParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(HtmlParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#tagBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagBody(HtmlParser.TagBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#enterpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnterpolation(HtmlParser.EnterpolationContext ctx);
}