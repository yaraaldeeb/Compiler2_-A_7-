package src;


import cssgen.CssParser;
import cssgen.CssParserBaseVisitor;
import src.CSSAST.*;

public class CssVisitor extends CssParserBaseVisitor {
    public SymbolTable symbolTable = new SymbolTable();

    private void addIdentifiersFromBody(CssParser.BodyContext ctx) {
        if (ctx.ID() != null && ctx.ID().size() > 0) {
            String name = ctx.ID(0).getText();
            String type = "Property";
            int line = ctx.ID(0).getSymbol().getLine();
            int column = ctx.ID(0).getSymbol().getCharPositionInLine();

            String value = null;

            if (ctx.NUMBER() != null) {
                value = ctx.NUMBER().getText();
            } else if (ctx.FLOATNUM() != null) {
                value = ctx.FLOATNUM().getText();
            } else if (ctx.STR() != null) {
                value = ctx.STR().getText();
            } else if (ctx.ID().size() > 1) {
                String valText = ctx.ID(1).getText();
                if (!valText.equalsIgnoreCase("undefined")) {
                    value = valText;
                } else {
                    value = null;
                }
            } else if (ctx.functioncall() != null) {
                value = ctx.functioncall().getText();
            }

            symbolTable.addSymbol(name, type, line, column, value);
        }
    }


    public Object visitCssFile(CssParser.CssFileContext ctx) {
      CssFile cssFile = new CssFile();
       if (ctx.EOF() !=null){
           cssFile.setEof(ctx.EOF().getText());
       }
       if (ctx.cssStyles() !=null && ctx.cssStyles().size() >0){
           for (int i=0;i<ctx.cssStyles().size();i++){
               cssFile.addChild((CssStyles) visit(ctx.cssStyles(i)));
           }
       }
       symbolTable.print();
       return cssFile;
    }

    @Override
    public Object visitCssStyles(CssParser.CssStylesContext ctx) {
        CssStyles cssStyles = new CssStyles();

        if (ctx.ID() != null && ctx.ID().size() > 0) {
            for (int i = 0; i < ctx.ID().size(); i++) {
                String idName = ctx.ID(i).getText();
                int line = ctx.ID(i).getSymbol().getLine();
                int column = ctx.ID(i).getSymbol().getCharPositionInLine();
                symbolTable.addSymbol(idName, "Selector", line, column, null);
                cssStyles.addChild(idName);
            }
        }
        if (ctx.DOT() != null && ctx.DOT().size() > 0) {
            for (int i = 0; i < ctx.DOT().size(); i++) {
                cssStyles.addChild2(ctx.DOT(i).getText()); // إضافة dots
            }
        }
        if (ctx.HASH() !=null && ctx.HASH().size() >0){
            for (int i=0;i<ctx.HASH().size();i++){
                cssStyles.addChild1(ctx.HASH(i).getText());
            }
        }
        if (ctx.COMMA() !=null && ctx.COMMA().size() >0){
            for (int i=0;i<ctx.COMMA().size();i++){
                cssStyles.addChild3(ctx.COMMA(i).getText());
            }
        }

        if (ctx.body() != null && !ctx.body().isEmpty()) {
            for (CssParser.BodyContext bodyCtx : ctx.body()) {
                cssStyles.addChild4((Body) visit(bodyCtx));
            }
        }

        if (ctx.pseudoClass() != null){
            PseudoClass pseudoClass = (PseudoClass) visit(ctx.pseudoClass());
            cssStyles.setPseudoClass(pseudoClass);
        }
        if (ctx.pseudoElement() !=null){
            PseudoElement pseudoElement = (PseudoElement) visit(ctx.pseudoElement());
            cssStyles.setPseudoElement(pseudoElement);

        }


return cssStyles;


    }

    @Override
    public Object visitPseudoClass(CssParser.PseudoClassContext ctx) {
        PseudoClass pseudoClass = new PseudoClass();
        pseudoClass.setId(ctx.ID().getText());
        pseudoClass.setColon(ctx.COLON().getText());
        return pseudoClass;
    }

    @Override
    public Object visitPseudoElement(CssParser.PseudoElementContext ctx) {
        PseudoElement pseudoElement = new PseudoElement();
        pseudoElement.setId(ctx.ID().getText());  // بدلاً من ctx.ID().toString()
        if (ctx.DOUBLECOLON() != null) {
            pseudoElement.setDoubleColon(ctx.DOUBLECOLON().getText());
        }
        return pseudoElement;
    }


    @Override
    public Object visitBody(CssParser.BodyContext ctx) {

        addIdentifiersFromBody(ctx);

        Body body = new Body();
        for (int i = 0; i < ctx.ID().size(); i++) {
            body.addChild(ctx.ID(i).getText());
        }

        if (ctx.COLON() != null) {
            body.setColon(ctx.COLON().getText());
        }

        if (ctx.NUMBER() != null) {
            body.setNumber(ctx.NUMBER().getText());
        }

        if (ctx.FLOATNUM() != null) {
            body.setFloatNum(ctx.FLOATNUM().getText());
        }

        if (ctx.STR() != null) {
            body.setId(ctx.STR().getText());
        }

        if (ctx.functioncall() != null) {
            Functioncall functioncall = (Functioncall) visit(ctx.functioncall());
            body.setFunctioncall(functioncall);
        }

        for (CssParser.CssStylesContext cssStylesCtx : ctx.cssStyles()) {
            CssStyles style = (CssStyles) visit(cssStylesCtx);
            body.addChild2(style);
        }

        return body;
    }
    @Override
    public Object visitFunctioncall(CssParser.FunctioncallContext ctx) {
       Functioncall functioncall = new Functioncall();
       if (ctx.ID()!=null){
           functioncall.setId(ctx.ID().getText());
       }
       return functioncall;
    }
}
