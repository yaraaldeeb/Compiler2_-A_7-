package src.HtmlVisitor;

import htmlgen.HtmlParser;
import htmlgen.HtmlParserBaseVisitor;
import org.antlr.v4.runtime.Token;
import src.HtmlAst.*;
import src.HtmlSymbolTable.HtmlRow;
import src.HtmlSymbolTable.HtmlSymbolTable;
import src.Semantics.ErrorHandler;
import src.Semantics.UndefinedPropertyException;
import src.Visitor.AngularVisitor;

import java.util.HashMap;
import java.util.Map;

public class HtmlVisitor extends HtmlParserBaseVisitor {
    HtmlSymbolTable htmlSymbolTable = new HtmlSymbolTable();



    int key = 1;
    @Override
    public Html visitHtml(HtmlParser.HtmlContext ctx) {
        Html html = new Html();
        if (ctx.tags() != null) {
            for (int i = 0 ; i < ctx.tags().size(); i++) {
                html.addChild(visitTags(ctx.tags().get(i)));
            }
        }
        htmlSymbolTable.print();
        return html;
    }

    @Override
    public Tags visitTags(HtmlParser.TagsContext ctx) {
        if (ctx.normalTag() != null) {
            return visitNormalTag(ctx.normalTag());
        }else {
            return visitSelfClosingTag(ctx.selfClosingTag());
        }
    }

    @Override
    public SelfClosingTag visitSelfClosingTag(HtmlParser.SelfClosingTagContext ctx) {
        SelfClosingTag selfClosingTag = new SelfClosingTag();
        if (ctx.ID() != null) {
            Token token = ctx.ID().getSymbol();
            HtmlRow row = new HtmlRow();
            row.setName("ID");
            row.setValue(ctx.ID().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            htmlSymbolTable.addElement(String.valueOf(key), row);
            key++;
            selfClosingTag.setId(ctx.ID().getText());
        }
        if (ctx.attributes() != null) {
            for (int i = 0 ; i < ctx.attributes().size(); i++) {
                selfClosingTag.getAttributes().add(visitAttributes(ctx.attributes().get(i)));
            }
        }
        return selfClosingTag;
    }

    @Override
    public NormalTags visitNormalTag(HtmlParser.NormalTagContext ctx) {
        NormalTags normalTags = new NormalTags();
        if (ctx.ID(0) != null) {
            Token token = ctx.ID(0).getSymbol();
            HtmlRow row = new HtmlRow();
            row.setName("ID");
            row.setValue(ctx.ID(0).getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            htmlSymbolTable.addElement(String.valueOf(key), row);
            key++;
            normalTags.setId1(ctx.ID(0).getText());
        }
        if (ctx.attributes() != null) {
            for (int i = 0 ; i < ctx.attributes().size(); i++) {
                normalTags.addAttribute(visitAttributes(ctx.attributes().get(i)));
            }
        }
        if (ctx.tagBody() != null) {
            for (int i = 0 ; i < ctx.tagBody().size(); i++) {
                normalTags.addBody(visitTagBody(ctx.tagBody().get(i)));
            }
        }
        if (ctx.ID(1) != null) {
            Token token = ctx.ID(1).getSymbol();
            HtmlRow row = new HtmlRow();
            row.setName("ID");
            row.setValue(ctx.ID(1).getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            htmlSymbolTable.addElement(String.valueOf(key), row);
            key++;
            normalTags.setId2(ctx.ID(1).getText());
        }
        return normalTags;
    }

    @Override
    public Attributes visitAttributes(HtmlParser.AttributesContext ctx) {
        Attributes attributes = new Attributes();
        if (ctx.ID() != null) {
            Token token = ctx.ID().getSymbol();
            HtmlRow row = new HtmlRow();
            row.setName("ID");
            row.setValue(ctx.ID().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            htmlSymbolTable.addElement(String.valueOf(key), row);
            key++;
            attributes.setId(ctx.ID().getText());
        }
        if (ctx.ASSIGN() != null) {
            Token token = ctx.ASSIGN().getSymbol();
            HtmlRow row = new HtmlRow();
            row.setName("Symbol");
            row.setValue(ctx.ASSIGN().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            htmlSymbolTable.addElement(String.valueOf(key), row);
            key++;
            attributes.setAssign(ctx.ASSIGN().getText());
        }
        if (ctx.value() != null) {
            attributes.sethValue(visitValue(ctx.value()));
        } else if (ctx.event() != null) {
            attributes.setEvent(visitEvent(ctx.event()));
        } else if (ctx.var() != null) {
            attributes.setVar(visitVar(ctx.var()));
        }
        return attributes;
    }

    @Override
    public HValue visitValue(HtmlParser.ValueContext ctx) {
        HValue hValue = new HValue();
        if (ctx.STR() != null) {
            Token token = ctx.STR().getSymbol();
            HtmlRow row = new HtmlRow();
            row.setName("Value");
            row.setValue(ctx.STR().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            htmlSymbolTable.addElement(String.valueOf(key), row);
            key++;
            hValue.setVal(ctx.STR().getText());
        } else if (ctx.ID() != null) {
            Token token = ctx.ID().getSymbol();
            HtmlRow row = new HtmlRow();
            row.setName("ID");
            row.setValue(ctx.ID().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            htmlSymbolTable.addElement(String.valueOf(key), row);
            key++;
            hValue.setVal(ctx.ID().getText());
        }
        return hValue;
    }

    @Override
    public Event visitEvent(HtmlParser.EventContext ctx) {
        Event event = new Event();
        if (ctx.ID() != null) {
            Token token = ctx.ID().getSymbol();
            HtmlRow row = new HtmlRow();
            row.setName("ID");
            row.setValue(ctx.ID().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            htmlSymbolTable.addElement(String.valueOf(key), row);
            key++;
            event.setId(ctx.ID().getText());
        }
        if (ctx.ASSIGN() != null) {
            Token token = ctx.ASSIGN().getSymbol();
            HtmlRow row = new HtmlRow();
            row.setName("symbol");
            row.setValue(ctx.ASSIGN().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            htmlSymbolTable.addElement(String.valueOf(key), row);
            key++;
            event.setAssign(ctx.ASSIGN().getText());
        }
        if (ctx.STR() != null) {
            Token token = ctx.STR().getSymbol();
            HtmlRow row = new HtmlRow();
            row.setName("EventValue");
            row.setValue(ctx.STR().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            htmlSymbolTable.addElement(String.valueOf(key), row);
            key++;
            event.setEventAction(ctx.STR().getText());
        }
        return event;
    }

    @Override
    public Var visitVar(HtmlParser.VarContext ctx) {
        Var var = new Var();
        if (ctx.ID() != null) {
            Token token = ctx.ID().getSymbol();
            HtmlRow row = new HtmlRow();
            row.setName("ID");
            row.setValue(ctx.ID().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            htmlSymbolTable.addElement(String.valueOf(key), row);
            key++;
            var.setId(ctx.ID().getText());
        }
        if (ctx.ASSIGN() != null) {
            Token token = ctx.ASSIGN().getSymbol();
            HtmlRow row = new HtmlRow();
            row.setName("Symbol");
            row.setValue(ctx.ASSIGN().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            htmlSymbolTable.addElement(String.valueOf(key), row);
            key++;
            var.setAssign(ctx.ASSIGN().getText());
        }
        if (ctx.STR() != null) {
            Token token = ctx.STR().getSymbol();
            HtmlRow row = new HtmlRow();
            row.setName("VarValue");
            row.setValue(ctx.STR().getText());
            row.setLine(token.getLine());
            row.setColumn(token.getCharPositionInLine());
            htmlSymbolTable.addElement(String.valueOf(key), row);
            key++;
            var.setVarAction(ctx.STR().getText());
        }
        return var;
    }

    @Override
    public TagBody visitTagBody(HtmlParser.TagBodyContext ctx) {
        TagBody tagBody = new TagBody();
        if (ctx.selfClosingTag() != null) {
            tagBody.setSelfClosingTag(visitSelfClosingTag(ctx.selfClosingTag()));
        } else if (ctx.normalTag() != null) {
            tagBody.setNormalTags(visitNormalTag(ctx.normalTag()));
        } else if (ctx.enterpolation() != null) {
            tagBody.setEnterpolation(visitEnterpolation(ctx.enterpolation()));
        }else {
            tagBody.setId(ctx.ID().getText());
        }
        return tagBody;
    }

    @Override
    public Enterpolation visitEnterpolation(HtmlParser.EnterpolationContext ctx) {
        Enterpolation enterpolation = new Enterpolation();
        if (ctx.ID() != null) {
            for (int i = 0 ; i < ctx.ID().size(); i++) {
                Token token = ctx.ID().get(i).getSymbol();
                HtmlRow row = new HtmlRow();
                row.setName("ID");
                row.setValue(ctx.ID().get(i).getText());
                row.setLine(token.getLine());
                row.setColumn(token.getCharPositionInLine());
                htmlSymbolTable.addElement(String.valueOf(key), row);
                key++;
                try {
                    checkInterpolationUsage(ctx.ID().get(i).getText(),token.getLine());
                } catch (UndefinedPropertyException e) {
                    throw new RuntimeException(e);
                }
                enterpolation.getIds().add(ctx.ID().get(i).getText());
            }
        }


        return enterpolation;
    }


    public void checkInterpolationUsage(String name, int lineNumber) throws UndefinedPropertyException {
        if (!AngularVisitor.properties.containsKey(name)) {
            UndefinedPropertyException exception = new UndefinedPropertyException(name, lineNumber);
            ErrorHandler.logError(exception);
        }
    }
}
