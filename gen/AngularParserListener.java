// Generated from D:/Antlr/AngularCompiler2/src/AngularParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(AngularParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(AngularParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#thingsToImport}.
	 * @param ctx the parse tree
	 */
	void enterThingsToImport(AngularParser.ThingsToImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#thingsToImport}.
	 * @param ctx the parse tree
	 */
	void exitThingsToImport(AngularParser.ThingsToImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(AngularParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(AngularParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#sittings}.
	 * @param ctx the parse tree
	 */
	void enterSittings(AngularParser.SittingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#sittings}.
	 * @param ctx the parse tree
	 */
	void exitSittings(AngularParser.SittingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterStructure(AngularParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitStructure(AngularParser.StructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(AngularParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(AngularParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(AngularParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(AngularParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(AngularParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(AngularParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AngularParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AngularParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(AngularParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(AngularParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#normalFunction}.
	 * @param ctx the parse tree
	 */
	void enterNormalFunction(AngularParser.NormalFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#normalFunction}.
	 * @param ctx the parse tree
	 */
	void exitNormalFunction(AngularParser.NormalFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(AngularParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(AngularParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayorobject}.
	 * @param ctx the parse tree
	 */
	void enterArrayorobject(AngularParser.ArrayorobjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayorobject}.
	 * @param ctx the parse tree
	 */
	void exitArrayorobject(AngularParser.ArrayorobjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#controleStmts}.
	 * @param ctx the parse tree
	 */
	void enterControleStmts(AngularParser.ControleStmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#controleStmts}.
	 * @param ctx the parse tree
	 */
	void exitControleStmts(AngularParser.ControleStmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(AngularParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(AngularParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#elseIfStmts}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStmts(AngularParser.ElseIfStmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#elseIfStmts}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStmts(AngularParser.ElseIfStmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(AngularParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(AngularParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(AngularParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(AngularParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(AngularParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(AngularParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#loops}.
	 * @param ctx the parse tree
	 */
	void enterLoops(AngularParser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#loops}.
	 * @param ctx the parse tree
	 */
	void exitLoops(AngularParser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#foreachStmt}.
	 * @param ctx the parse tree
	 */
	void enterForeachStmt(AngularParser.ForeachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#foreachStmt}.
	 * @param ctx the parse tree
	 */
	void exitForeachStmt(AngularParser.ForeachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(AngularParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(AngularParser.ForStmtContext ctx);
}