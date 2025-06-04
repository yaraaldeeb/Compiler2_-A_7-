package src.Visitor;

import gen.AngularParser;
import gen.AngularParserBaseVisitor;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import src.AST.*;
import src.Semantics.FunctionSignature;
import src.Semantics.MethodOverloadingException;
import src.Semantics.Scope;
import src.symboltable.Row;
import src.symboltable.SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AngularVisitor extends AngularParserBaseVisitor {
    SymbolTable symbolTable = new SymbolTable();

    public static Map<String, String> properties = new HashMap<String, String>();
    public List<String> errors = new ArrayList<>();
    Scope scope = new Scope();
    //Import Scope:
    SymbolTable glaobalScope = new SymbolTable();
    SymbolTable importSymbolTable = new SymbolTable();
    SymbolTable directiveSymboleTable = new SymbolTable();
    SymbolTable structureSymbolTable = new SymbolTable();
    SymbolTable arrowFunctionSymboleTable = new SymbolTable();
    int key = 1;
    int scopeKey = 1;
    @Override
    public Angular visitProgram(AngularParser.ProgramContext ctx) {
        Angular angular = new Angular();
        if (ctx.imports() != null) {
            for (int i = 0; i< ctx.imports().size(); i++) {
                angular.getPrograms().add(visitImports(ctx.imports().get(i)));
            }
        }
        if (ctx.directive() != null) {
            angular.getPrograms().add(visitDirective(ctx.directive()));
        }
        if (ctx.structure() != null) {
            angular.getPrograms().add(visitStructure(ctx.structure()));
        }

        symbolTable.print();
        return angular;
    }

    @Override
    public ImportStmt visitImports(AngularParser.ImportsContext ctx) {
        ImportStmt importStmt = new ImportStmt();
        if (ctx.IMPORT() != null) {
            Token token = ctx.IMPORT().getSymbol();
            Row row = new Row();
            row.setName("Keyword");
            row.setValue(ctx.IMPORT().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            importStmt.setKeyword1(ctx.IMPORT().getText());
            importSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        if (ctx.FROM() != null) {
            Token token = ctx.FROM().getSymbol();
            Row row = new Row();
            row.setName("Keyword");
            row.setValue(ctx.FROM().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            importStmt.setKeyword1(ctx.FROM().getText());
            importSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        if (ctx.STR() != null) {
            Token token = ctx.STR().getSymbol();
            Row row = new Row();
            row.setName("Path");
            row.setValue(ctx.STR().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            importStmt.setPath(ctx.STR().getText());
            importSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        if (ctx.thingsToImport() != null) {
            importStmt.setThingToImport(visitThingsToImport(ctx.thingsToImport()));
        }
        return importStmt;
    }

    @Override
    public ThingToImport visitThingsToImport(AngularParser.ThingsToImportContext ctx) {
        ThingToImport thingToImport = new ThingToImport();
        if (ctx.ID() != null) {
            for (int i = 0; i < ctx.ID().size(); i++) {
                Token token = ctx.ID().get(i).getSymbol();
                Row row = new Row();
                row.setName("ID");
                row.setValue(ctx.ID().get(i).getText());
                row.setLine(token.getLine());
                row.setColumn(token.getCharPositionInLine());
                symbolTable.addElement(String.valueOf(key), row);
                key++;
                thingToImport.getIds().add(ctx.ID().get(i).getText());
                importSymbolTable.addElement(String.valueOf(scopeKey), row);
                scopeKey++;
                directiveSymboleTable.addElementToScope(String.valueOf(scopeKey), row);
                scopeKey++;
            }
        }
        return thingToImport;
    }

    @Override
    public Directive visitDirective(AngularParser.DirectiveContext ctx) {
        Directive directive = new Directive();
        if (ctx.AT() != null) {
            Token token = ctx.AT().getSymbol();
            Row row = new Row();
            row.setName("Keyword");
            row.setValue(ctx.AT().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            directive.setAt(ctx.AT().getText());
            directiveSymboleTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        if (ctx.ID() != null) {
            Token token = ctx.ID().getSymbol();
            Row row = new Row();
            row.setName("ID");
            row.setValue(ctx.ID().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            directive.setId(ctx.ID().getText());
            directiveSymboleTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        directive.setSittings(visitSittings(ctx.sittings()));
        return directive;
    }

    @Override
    public Sittings visitSittings(AngularParser.SittingsContext ctx) {
        Sittings sittings = new Sittings();
        if (ctx.ID() != null) {
            for (int i = 0 ; i < ctx.ID().size(); i++) {
                Token token = ctx.ID().get(i).getSymbol();
                Row row = new Row();
                row.setName("ID");
                row.setValue(ctx.ID().get(i).getText());
                row.setLine(token.getLine());
                row.setColumn(token.getCharPositionInLine());
                symbolTable.addElement(String.valueOf(key), row);
                key++;
                sittings.getIds().add(ctx.ID().get(i).getText());
                directiveSymboleTable.addElementToScope(String.valueOf(scopeKey), row);
                scopeKey++;
            }
        }
        if (ctx.STR() != null) {
            for (int i = 0 ; i < ctx.STR().size(); i++) {
                Token token = ctx.STR().get(i).getSymbol();
                Row row = new Row();
                row.setName("Path");
                row.setValue(ctx.STR().get(i).getText());
                row.setLine(token.getLine());
                row.setColumn(token.getCharPositionInLine());
                symbolTable.addElement(String.valueOf(key), row);
                key++;
                sittings.getPaths().add(ctx.STR().get(i).getText());
                directiveSymboleTable.addElementToScope(String.valueOf(scopeKey), row);
                scopeKey++;
            }
        }
        if (ctx.thingsToImport() != null) {
            for (int i = 0 ; i < ctx.thingsToImport().size(); i++) {
                sittings.getThingToImports().add(visitThingsToImport(ctx.thingsToImport().get(i)));
            }
        }
        return sittings;
    }

    @Override
    public Structure visitStructure(AngularParser.StructureContext ctx) {
        Structure structure = new Structure();
        if (ctx.EXPORT() != null) {
            Token token = ctx.EXPORT().getSymbol();
            Row row = new Row();
            row.setName("Keyword");
            row.setValue(ctx.EXPORT().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            structure.setKeyword1(ctx.EXPORT().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        if (ctx.CLASS() != null) {
            Token token = ctx.CLASS().getSymbol();
            Row row = new Row();
            row.setName("Keyword");
            row.setValue(ctx.CLASS().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            structure.setKeyword2(ctx.CLASS().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        if (ctx.ID() != null) {
            Token token = ctx.ID().getSymbol();
            Row row = new Row();
            row.setName("ID");
            row.setValue(ctx.ID().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            structure.setId(ctx.ID().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        if (ctx.body() != null) {
            for (int i = 0 ; i < ctx.body().size(); i++) {
                structure.getBodies().add((visitBody(ctx.body().get(i))));
            }
        }
        return structure;
    }

    @Override
    public Body visitBody(AngularParser.BodyContext ctx) {
        if (ctx.properties() != null) {
            return visitProperties(ctx.properties());
        } else if (ctx.functions() != null) {
            return visitFunctions(ctx.functions());
        } else if (ctx.controleStmts() != null) {
            return visitControleStmts(ctx.controleStmts());
        } else if (ctx.loops() != null) {
            return visitLoops(ctx.loops());
        } else if (ctx.varDec() != null) {
            return visitVarDec(ctx.varDec());
        } else if (ctx.exp() != null) {
            return visitExp(ctx.exp());
        }
        return null;
    }
    //    @Override
//    public Body visitPropertieslabel(AngularParser.PropertieslabelContext ctx) {
//        return visitProperties(ctx.properties());
//    }
//
//    @Override
//    public Object visitFunctionslabel(AngularParser.FunctionslabelContext ctx) {
//        return visit(ctx.functions());
//    }
//
//    @Override
//    public Body visitControleStmtslabel(AngularParser.ControleStmtslabelContext ctx) {
//        return visitControleStmts(ctx.controleStmts());
//    }
//
//    @Override
//    public Object visitLoopslabel(AngularParser.LoopslabelContext ctx) {
//        return visit(ctx.loops());
//    }
//
//    @Override
//    public Body visitVarDeclabel(AngularParser.VarDeclabelContext ctx) {
//        return visitVarDec(ctx.varDec());
//    }
//
//    @Override
//    public Exp visitExplabel(AngularParser.ExplabelContext ctx) {
//        return visitExp(ctx.exp());
//    }

    @Override
    public Properties visitProperties(AngularParser.PropertiesContext ctx) {
        Properties properties = new Properties();
        if (ctx.THIS() != null) {
            Token token = ctx.THIS().getSymbol();
            Row row = new Row();
            row.setName("Keyword");
            row.setValue(ctx.THIS().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            properties.setKeyword(ctx.THIS().getText());
            structureSymbolTable.addElement(String.valueOf(scopeKey), row);
            scopeKey++;
            arrowFunctionSymboleTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        } else if (ctx.AT() != null) {
            Token token = ctx.AT().getSymbol();
            Row row = new Row();
            row.setName("Keyword");
            row.setValue(ctx.AT().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            properties.setKeyword(ctx.AT().getText());
            structureSymbolTable.addElement(String.valueOf(scopeKey), row);
            scopeKey++;
            arrowFunctionSymboleTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
            if (ctx.NEW() != null) {
                Token token1 = ctx.NEW().getSymbol();
                Row row1 = new Row();
                row1.setName("Keyword");
                row1.setValue(ctx.NEW().getText());
                row1.setLine(token1.getLine());
                row1.setColumn(token1.getCharPositionInLine());
                symbolTable.addElement(String.valueOf(key), row1);
                key++;
                properties.setKeyword2(ctx.NEW().getText());
                structureSymbolTable.addElement(String.valueOf(scopeKey), row1);
                scopeKey++;
                arrowFunctionSymboleTable.addElementToScope(String.valueOf(scopeKey), row1);
                scopeKey++;
            }
        }
        if (ctx.ID() != null) {
            for (int i = 0 ; i < ctx.ID().size(); i++) {
                Token token = ctx.ID().get(i).getSymbol();
                Row row = new Row();
                row.setName("ID");
                row.setValue(ctx.ID().get(i).getText());
                row.setLine(token.getLine());
                row.setColumn(token.getCharPositionInLine());
                symbolTable.addElement(String.valueOf(key), row);
                key++;
                properties.getIds().add(ctx.ID().get(i).getText());
                structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
                scopeKey++;
                addProperty(String.valueOf(i),ctx.ID().get(i).getText());
            }
        }
        if (ctx.dataType() != null) {
            properties.setDataType(visitDataType(ctx.dataType()));
        }
        if (ctx.value() != null) {
            properties.setValue(visitValue(ctx.value()));
        }
        if (ctx.arrayorobject() != null){
            properties.setArrayOrObject(visitArrayorobject(ctx.arrayorobject()));
        }

        return properties;
    }

    public void addProperty(String key, String value) {
        AngularVisitor.properties.put(key, value);
    }
    @Override
    public DataType visitDataType(AngularParser.DataTypeContext ctx) {
        DataType dataType = new DataType();
        if (ctx.STRING() != null) {
            Token token = ctx.STRING().getSymbol();
            Row row = new Row();
            row.setName("Keyword");
            row.setValue(ctx.STRING().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            dataType.setDataType(ctx.STRING().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }else if (ctx.CHAR() != null) {
            Token token = ctx.CHAR().getSymbol();
            Row row = new Row();
            row.setName("Keyword");
            row.setValue(ctx.CHAR().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            dataType.setDataType(ctx.CHAR().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }else if (ctx.NUM() != null) {
            Token token = ctx.NUM().getSymbol();
            Row row = new Row();
            row.setName("Keyword");
            row.setValue(ctx.NUM().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            dataType.setDataType(ctx.NUM().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }else if (ctx.BOOLEAN() != null) {
            Token token = ctx.BOOLEAN().getSymbol();
            Row row = new Row();
            row.setName("Keyword");
            row.setValue(ctx.BOOLEAN().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            dataType.setDataType(ctx.BOOLEAN().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }else if (ctx.ANY() != null) {
            Token token = ctx.ANY().getSymbol();
            Row row = new Row();
            row.setName("Keyword");
            row.setValue(ctx.ANY().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            dataType.setDataType(ctx.ANY().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        return dataType;
    }

    @Override
    public Value visitValue(AngularParser.ValueContext ctx) {
        Value value = new Value();
        if (ctx.NUMBER() != null) {
            Token token = ctx.NUMBER().getSymbol();
            Row row = new Row();
            row.setName("Number");
            row.setValue(ctx.NUMBER().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            value.setVal(ctx.NUMBER().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }else if (ctx.CHARACTER() != null) {
            Token token = ctx.CHARACTER().getSymbol();
            Row row = new Row();
            row.setName("Character");
            row.setValue(ctx.CHARACTER().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            value.setVal(ctx.CHARACTER().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }else if (ctx.STR() != null) {
            Token token = ctx.STR().getSymbol();
            Row row = new Row();
            row.setName("String");
            row.setValue(ctx.STR().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            value.setVal(ctx.STR().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }else if (ctx.TRUE() != null) {
            Token token = ctx.TRUE().getSymbol();
            Row row = new Row();
            row.setName("Boolean");
            row.setValue(ctx.TRUE().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            value.setVal(ctx.TRUE().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }else if (ctx.FALSE() != null) {
            Token token = ctx.FALSE().getSymbol();
            Row row = new Row();
            row.setName("Boolean");
            row.setValue(ctx.FALSE().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            value.setVal(ctx.FALSE().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }else if (ctx.ID() != null) {
            Token token = ctx.ID().getSymbol();
            Row row = new Row();
            row.setName("ID");
            row.setValue(ctx.ID().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            value.setVal(ctx.ID().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        if (ctx.THIS() != null) {
            Token token = ctx.THIS().getSymbol();
            Row row = new Row();
            row.setName("Keyword");
            row.setValue(ctx.THIS().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            value.setKeyword(ctx.THIS().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        return value;
    }

    @Override
    public Functions visitFunctions(AngularParser.FunctionsContext ctx) {
        if (ctx.arrowFunction() != null) {
            return visitArrowFunction(ctx.arrowFunction());
        } else if (ctx.normalFunction() != null) {
            return visitNormalFunction(ctx.normalFunction());
        }else {
            return visitFunctionCall(ctx.functionCall());
        }
    }

    //    @Override
//    public Functions visitArrowFunctionlabel(AngularParser.ArrowFunctionlabelContext ctx) {
//        return visitArrowFunction(ctx.arrowFunction());
//    }
//
//    @Override
//    public Functions visitNormalFunctionlabel(AngularParser.NormalFunctionlabelContext ctx) {
//        return visitNormalFunction(ctx.normalFunction());
//    }
//
//    @Override
//    public Functions visitFunctionCalllabel(AngularParser.FunctionCalllabelContext ctx) {
//        return visitFunctionCall(ctx.functionCall());
//    }

    @Override
    public Functions visitArrowFunction(AngularParser.ArrowFunctionContext ctx) {
        ArrowFunction arrowFunction = new ArrowFunction();
        if (ctx.parameters() != null) {
            arrowFunction.setParameters(visitParameters(ctx.parameters()));
        }
        if (ctx.body() != null) {
            for (int i = 0 ; i < ctx.body().size(); i++) {
                arrowFunction.getBodies().add(visitBody(ctx.body().get(i)));
            }
        }
        return arrowFunction;
    }

    @Override
    public Functions visitNormalFunction(AngularParser.NormalFunctionContext ctx) {
        NormalFunction normalFunction = new NormalFunction();
        if (ctx.ID() != null) {
            Token token = ctx.ID().getSymbol();
            Row row = new Row();
            row.setName("ID");
            row.setValue(ctx.ID().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            normalFunction.setId(ctx.ID().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        if (ctx.parameters() != null) {
            normalFunction.setParameters(visitParameters(ctx.parameters()));
        }
        if (ctx.body() != null) {
            for (int i = 0 ; i < ctx.body().size(); i++) {
                normalFunction.getBodies().add(visitBody(ctx.body().get(i)));
            }
        }

        List<String> paramTypes = new ArrayList<>();
        if (ctx.parameters() != null) {
            for (ParseTree child : ctx.parameters().children) {
                if (child.getText().equals(","))
                    continue;
                String nodeName = child.getClass().getSimpleName();

                if (nodeName.endsWith("Context")) {
                    nodeName = nodeName.substring(0, nodeName.length() - "Context".length());
                }

                paramTypes.add(nodeName);
            }
        }

        try {
            symbolTable.addFunction(new FunctionSignature(ctx.ID().getText(), paramTypes));
        } catch (MethodOverloadingException e) {
            errors.add("Method Overloading Error in function '" + ctx.ID().getText() + "': " + e.getMessage());
        }
        return normalFunction;
    }

    @Override
    public Parameters visitParameters(AngularParser.ParametersContext ctx) {
        Parameters parameters = new Parameters();
        if (ctx.ID() != null) {
            for (int i = 0; i < ctx.ID().size(); i++) {
                Token token = ctx.ID().get(i).getSymbol();
                Row row = new Row();
                row.setName("ID");
                row.setValue(ctx.ID().get(i).getText());
                row.setLine(token.getLine());
                row.setColumn(token.getCharPositionInLine());
                symbolTable.addElement(String.valueOf(key) , row);
                key++;
                parameters.getIds().add(ctx.ID().get(i).getText());
                arrowFunctionSymboleTable.addElementToScope(String.valueOf(scopeKey), row);
                scopeKey++;
            }
        }

        if (ctx.properties() != null) {
            for (int i = 0; i < ctx.properties().size(); i++) {
                parameters.getProperties().add(visitProperties(ctx.properties().get(i)));
            }
        }
        if (ctx.arrayorobject() != null) {
            for (int i = 0; i < ctx.arrayorobject().size(); i++) {
                parameters.getArrayOrObjects().add(visitArrayorobject(ctx.arrayorobject().get(i)));
            }
        }
        if (ctx.value() != null) {
            for (int i = 0; i < ctx.value().size(); i++) {
                parameters.getValues().add(visitValue(ctx.value().get(i)));
            }
        }
        return parameters;
    }

    @Override
    public ArrayOrObject visitArrayorobject(AngularParser.ArrayorobjectContext ctx) {
        ArrayOrObject arrayOrObject = new ArrayOrObject();
        if (ctx.OPENCURLY() != null) {
            arrayOrObject.setOpen(ctx.OPENCURLY().getText());
            if (ctx.CLOSECURLY() != null) {
                arrayOrObject.setClose(ctx.CLOSECURLY().getText());
            }
        } else if (ctx.OPENSQUARE() != null) {
            arrayOrObject.setOpen(ctx.OPENSQUARE().getText());
            if (ctx.CLOSESQUARE() != null) {
                arrayOrObject.setClose(ctx.CLOSESQUARE().getText());
            }
        }
        if (ctx.value() != null) {
            for (int i = 0 ; i < ctx.value().size(); i++) {
                arrayOrObject.getValues().add(visitValue(ctx.value().get(i)));
            }
        }
        return arrayOrObject;
    }

    @Override
    public Functions visitFunctionCall(AngularParser.FunctionCallContext ctx) {
        FunctionCall functionCall = new FunctionCall();
        if (ctx.ID() != null) {
            Token token = ctx.ID().getSymbol();
            Row row = new Row();
            row.setName("ID");
            row.setValue(ctx.ID().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            functionCall.setId(ctx.ID().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        if (ctx.parameters() != null) {
            functionCall.setParameters(visitParameters(ctx.parameters()));
        }
        return functionCall;
    }

    @Override
    public ControleStmts visitControleStmts(AngularParser.ControleStmtsContext ctx) {
        ControleStmts controleStmts = new ControleStmts();
        if (ctx.IF() != null){
            Token token = ctx.IF().getSymbol();
            Row row = new Row();
            row.setName("Keyword");
            row.setValue(ctx.IF().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            controleStmts.setKeyword(ctx.IF().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        if (ctx.condition() != null) {
            controleStmts.setConditions((Conditions) visit(ctx.condition()));
        }
        if (ctx.body() != null) {
            for (int i = 0 ; i < ctx.body().size(); i++) {
                controleStmts.getBodies().add(visitBody(ctx.body().get(i)));
            }
        }
        return controleStmts;
    }

    @Override
    public Conditions visitCondition(AngularParser.ConditionContext ctx) {
        Conditions conditions = new Conditions();
        if (ctx.value() != null) {
            conditions.setValue(visitValue(ctx.value()));
        }else {
            conditions.setExp(visitExp(ctx.exp()));
        }
        return conditions;
    }

    //    @Override
//    public Value visitConditionvaluelabel(AngularParser.ConditionvaluelabelContext ctx) {
//        return visitValue(ctx.value());
//    }
//
//    @Override
//    public Exp visitConditionexplabel(AngularParser.ConditionexplabelContext ctx) {
//        return visitExp(ctx.exp());
//    }

    @Override
    public ElseIfStmts visitElseIfStmts(AngularParser.ElseIfStmtsContext ctx) {
        ElseIfStmts elseIfStmts = new ElseIfStmts();
        if (ctx.ELSE_IF() != null){
            Token token = ctx.ELSE_IF().getSymbol();
            Row row = new Row();
            row.setName("Keyword");
            row.setValue(ctx.ELSE_IF().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            elseIfStmts.setKeyword(ctx.ELSE_IF().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        if (ctx.condition() != null) {
            elseIfStmts.setConditions((Conditions) visit(ctx.condition()));
        }
        if (ctx.body() != null) {
            for (int i = 0 ; i < ctx.body().size(); i++) {
                elseIfStmts.getBodies().add(visitBody(ctx.body().get(i)));
            }
        }
        return elseIfStmts;
    }

    @Override
    public ElseStmt visitElseStmt(AngularParser.ElseStmtContext ctx) {
        ElseStmt elseStmt = new ElseStmt();
        if (ctx.ELSE() != null){
            Token token = ctx.ELSE().getSymbol();
            Row row = new Row();
            row.setName("Keyword");
            row.setValue(ctx.ELSE().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            elseStmt.setKeyword(ctx.ELSE().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        if (ctx.body() != null) {
            for (int i = 0 ; i < ctx.body().size(); i++) {
                elseStmt.getBodies().add(visitBody(ctx.body().get(i)));
            }
        }
        return elseStmt;
    }

    @Override
    public VariableDeclaration visitVarDec(AngularParser.VarDecContext ctx) {
        VariableDeclaration variableDeclaration = new VariableDeclaration();
        if (ctx.LET() != null) {
            Token token1 = ctx.LET().getSymbol();
            Row row1 = new Row();
            row1.setName("Keyword");
            row1.setValue(ctx.LET().getText());
            row1.setLine(token1.getLine());
            row1.setColumn(token1.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row1);
            key++;
            variableDeclaration.setKeyword(ctx.LET().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row1);
            scopeKey++;
        } else if (ctx.VAR() != null) {
            Token token1 = ctx.VAR().getSymbol();
            Row row1 = new Row();
            row1.setName("Keyword");
            row1.setValue(ctx.VAR().getText());
            row1.setLine(token1.getLine());
            row1.setColumn(token1.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row1);
            key++;
            variableDeclaration.setKeyword(ctx.VAR().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row1);
            scopeKey++;
        } else if (ctx.CONST() != null) {
            Token token1 = ctx.CONST().getSymbol();
            Row row1 = new Row();
            row1.setName("Keyword");
            row1.setValue(ctx.CONST().getText());
            row1.setLine(token1.getLine());
            row1.setColumn(token1.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row1);
            key++;
            variableDeclaration.setKeyword(ctx.CONST().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row1);
            scopeKey++;
        }
        if (ctx.ID() != null) {
            Token token2 = ctx.ID().getSymbol();
            Row row2 = new Row();
            row2.setName("ID");
            row2.setValue(ctx.ID().getText());
            row2.setLine(token2.getLine());
            row2.setColumn(token2.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row2);
            key++;
            variableDeclaration.setKeyword(ctx.ID().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row2);
            scopeKey++;
        }
        if (ctx.ASSIGN() != null) {
            Token token2 = ctx.ASSIGN().getSymbol();
            Row row2 = new Row();
            row2.setName("ASSIGN");
            row2.setValue(ctx.ASSIGN().getText());
            row2.setLine(token2.getLine());
            row2.setColumn(token2.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row2);
            key++;
            variableDeclaration.setKeyword(ctx.ASSIGN().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row2);
            scopeKey++;
        }
        if (ctx.dataType() != null) {
            variableDeclaration.setDataType(visitDataType(ctx.dataType()));
        }
        if (ctx.value() != null) {
            variableDeclaration.setValue(visitValue(ctx.value()));
        }
        if (ctx.arrayorobject() != null) {
            variableDeclaration.setArrayOrObject(visitArrayorobject(ctx.arrayorobject()));
        }

        return variableDeclaration;
    }

    //Exp

    @Override
    public Operations visitExp(AngularParser.ExpContext ctx) {
        Operations operations = new Operations();
        if (ctx.getChild(0) != null) {
            if (ctx.getChild(0).equals(ctx.exp())) {
                operations.left = visitExp(ctx.exp(0));
                operations.addExp(visitExp(ctx.exp(0)));
            } else if (ctx.exp(0).ID() !=null) {
                Token token1 = ctx.ID().getSymbol();
                Row row1 = new Row();
                row1.setName("ID");
                row1.setValue(ctx.ID().getText());
                row1.setLine(token1.getLine());
                row1.setColumn(token1.getCharPositionInLine());
                symbolTable.addElement(String.valueOf(key), row1);
                key++;
                operations.id = ctx.exp(0).ID().getText();
            } else if (ctx.exp(0).NUMBER() != null) {
                Token token1 = ctx.NUMBER().getSymbol();
                Row row1 = new Row();
                row1.setName("Number");
                row1.setValue(ctx.NUMBER().getText());
                row1.setLine(token1.getLine());
                row1.setColumn(token1.getCharPositionInLine());
                symbolTable.addElement(String.valueOf(key), row1);
                key++;
                operations.num = ctx.exp(0).NUMBER().getText();
            }
        }if (ctx.getChild(2) != null) {
            if (ctx.getChild(2).equals(ctx.exp())) {
                operations.right = visitExp(ctx.exp(1));
                operations.addExp(visitExp(ctx.exp(1)));
            } else if (ctx.exp(1).ID() !=null) {
                Token token1 = ctx.ID().getSymbol();
                Row row1 = new Row();
                row1.setName("ID");
                row1.setValue(ctx.ID().getText());
                row1.setLine(token1.getLine());
                row1.setColumn(token1.getCharPositionInLine());
                symbolTable.addElement(String.valueOf(key), row1);
                key++;
                operations.id = ctx.exp(1).ID().getText();
            } else if (ctx.exp(1).NUMBER() != null) {
                Token token1 = ctx.NUMBER().getSymbol();
                Row row1 = new Row();
                row1.setName("Number");
                row1.setValue(ctx.NUMBER().getText());
                row1.setLine(token1.getLine());
                row1.setColumn(token1.getCharPositionInLine());
                symbolTable.addElement(String.valueOf(key), row1);
                key++;
                operations.num = ctx.exp(1).NUMBER().getText();
            }
        }
        return operations;

//        if (ctx.exp() != null) {
//            if (ctx.exp(0) != null) {
//                Exp left = visitExp(ctx.exp(0));
//            }
//            if (ctx.exp(1) != null) {
//                Exp right = visitExp(ctx.exp(1));
//            }
//            if (ctx.MULT() != null || ctx.DIVIDE() != null || ctx.PLUS() != null || ctx.SUB() != null || ctx.EQUAL() != null || ctx.NOTEQUAL() != null || ctx.ASSIGN() != null) {
//                String op = ctx.getChild(1).getText();
//                return new Arithmatic(ctx.exp(0), ctx.exp(1), op);
//            }
//            if (ctx.LEFTARROW() != null || ctx.RIGHTARROW() != null || ctx.LEFTARROWOREQUAL() != null || ctx.RIGHTARROWOREQUAL() != null) {
//                String op = ctx.getChild(1).getText();
//                return new Comparession(ctx.exp(0), ctx.exp(1), op);
//            }
//        }
//        if (ctx.ID() != null) {
//            return new IDExp(ctx.ID().getText());
//        }
//        if (ctx.NUMBER() != null) {
//            return new NumberExp(Integer.parseInt(ctx.NUMBER().getText()));
//        }
//        return null;
    }


//    @Override
//    public Exp visitNumberlabel(AngularParser.NumberlabelContext ctx) {
//        Token token = ctx.NUMBER().getSymbol();
//        Row row = new Row();
//        row.setName("Number");
//        row.setValue(ctx.NUMBER().getText());
//        row.setLine(token.getLine());
//        row.setColumn(token.getCharPositionInLine());
//        symbolTable.addElement(String.valueOf(key) , row);
//        key++;
//
//        return new NumberExp(Integer.parseInt(ctx.NUMBER().getText()));
//    }
//
//    @Override
//    public Exp visitArithmaticlabel(AngularParser.ArithmaticlabelContext ctx) {
////        Exp left = (Exp) visit(ctx.getChild(0));
////        Exp right = (Exp) visit(ctx.getChild(2));
//        Object left = visit(ctx.getChild(0));
//        Object right = visit(ctx.getChild(2));
//        String op = ctx.getChild(1).getText();
//        return new Arithmatic((Exp) left,(Exp) right,op);
//    }
//
//    @Override
//    public Exp visitIdlabel(AngularParser.IdlabelContext ctx) {
//        Token token = ctx.ID().getSymbol();
//        Row row = new Row();
//        row.setName("ID");
//        row.setValue(ctx.ID().getText());
//        row.setLine(token.getLine());
//        row.setColumn(token.getCharPositionInLine());
//
//        return new IDExp(ctx.ID().getText());
//    }
//
//    @Override
//    public Exp visitComplabel(AngularParser.ComplabelContext ctx) {
////        Exp left = (Exp) visit(ctx.getChild(0));
////        Exp right = (Exp) visit(ctx.getChild(2));
////        String op = ctx.getChild(1).getText();
////        return new Comparession(left, right,op);
//        Object left = visit(ctx.getChild(0));
//        Object right = visit(ctx.getChild(2));
//        String op = ctx.getChild(1).getText();
//        return new Comparession((Exp) left,(Exp) right,op);
//    }
//
//    @Override
//    public Exp visitAssignmentlabel(AngularParser.AssignmentlabelContext ctx) {
//        Object left = visit(ctx.getChild(0));
//        Object right = visit(ctx.getChild(2));
//        String op = ctx.ASSIGN().getText();
//        return new Arithmatic((Exp) left,(Exp) right,op);
//    }

    @Override
    public Loops visitLoops(AngularParser.LoopsContext ctx) {
        if (ctx.foreachStmt() != null) {
            return visitForeachStmt(ctx.foreachStmt());
        }else {
            return visitForStmt(ctx.forStmt());
        }
    }


//    @Override
//    public Loops visitForeachStmtlabel(AngularParser.ForeachStmtlabelContext ctx) {
//        return visitForeachStmt(ctx.foreachStmt());
//    }
//
//    @Override
//    public Loops visitForStmtlabel(AngularParser.ForStmtlabelContext ctx) {
//        return visitForStmt(ctx.forStmt());
//    }

    @Override
    public ForeachStmt visitForeachStmt(AngularParser.ForeachStmtContext ctx) {
        ForeachStmt foreachStmt = new ForeachStmt();
        if (ctx.FOREACH() != null) {
            Row row = new Row();
            Token token = ctx.FOREACH().getSymbol();
            row.setName(ctx.FOREACH().getText());
            row.setValue(ctx.FOREACH().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            foreachStmt.setKeyword(ctx.FOREACH().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        if (ctx.dataType() != null) {
            foreachStmt.setDataType(visitDataType(ctx.dataType()));
        }

        if (ctx.ID().get(0) != null) {
            Row row = new Row();
            Token token = ctx.ID().get(0).getSymbol();
            row.setName(ctx.ID().get(0).getText());
            row.setValue(ctx.ID().get(0).getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            foreachStmt.setId1(ctx.ID().get(0).getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }

        if (ctx.ID().get(1) != null) {
            Row row = new Row();
            Token token = ctx.ID().get(1).getSymbol();
            row.setName(ctx.ID().get(1).getText());
            row.setValue(ctx.ID().get(1).getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            foreachStmt.setId2(ctx.ID().get(1).getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }

        if (ctx.body() != null) {
            for (int i = 0 ; i < ctx.body().size(); i++){
                foreachStmt.getBodies().add(visitBody(ctx.body().get(i)));
            }
        }
        return foreachStmt;
    }

    @Override
    public ForStmt visitForStmt(AngularParser.ForStmtContext ctx) {
        ForStmt forStmt = new ForStmt();
        Row row = new Row();
        if (ctx.FOR() != null) {
            Token token = ctx.FOR().getSymbol();
            row.setName(ctx.FOR().getText());
            row.setValue(ctx.FOR().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            symbolTable.addElement(String.valueOf(key), row);
            key++;
            forStmt.setKeyword(ctx.FOR().getText());
            structureSymbolTable.addElementToScope(String.valueOf(scopeKey), row);
            scopeKey++;
        }
        if (ctx.varDec() != null) {
            forStmt.setVariableDeclaration(visitVarDec(ctx.varDec()));
        }
        if (ctx.condition() != null){
            forStmt.setConditions((Conditions) visit(ctx.condition()));
        }
        if (ctx.exp() != null) {
            forStmt.setExp(visitExp(ctx.exp()));
        }
        if (ctx.body() != null) {
            for (int i = 0 ; i < ctx.body().size(); i++){
                forStmt.getBodies().add(visitBody(ctx.body().get(i)));
            }
        }
        return forStmt;
    }
}
