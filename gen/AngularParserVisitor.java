// Generated from D:/Antlr/AngularCompiler2/src/AngularParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(AngularParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#thingsToImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThingsToImport(AngularParser.ThingsToImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(AngularParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#sittings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSittings(AngularParser.SittingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure(AngularParser.StructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(AngularParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(AngularParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(AngularParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(AngularParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(AngularParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#normalFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFunction(AngularParser.NormalFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(AngularParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayorobject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayorobject(AngularParser.ArrayorobjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#controleStmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControleStmts(AngularParser.ControleStmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(AngularParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#elseIfStmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStmts(AngularParser.ElseIfStmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(AngularParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(AngularParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(AngularParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoops(AngularParser.LoopsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#foreachStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachStmt(AngularParser.ForeachStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(AngularParser.ForStmtContext ctx);
}