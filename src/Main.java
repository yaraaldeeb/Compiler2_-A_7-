package src;

import cssgen.CssLexer;
import cssgen.CssParser;
import gen.AngularLexer;
import gen.AngularParser;
import htmlgen.HtmlLexer;
import htmlgen.HtmlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import src.AST.Angular;
import src.CSSAST.CssFile;
import src.HtmlAst.Html;
import src.HtmlSymbolTable.HtmlSymbolTable;
import src.HtmlVisitor.HtmlVisitor;
import src.Visitor.AngularVisitor;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String [] args) throws IOException {
        String source = "src/Example1.txt";
        CharStream charStream = fromFileName(source);
        AngularLexer angularLexer = new AngularLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(angularLexer);
        AngularParser angularParser = new AngularParser(tokens);
        ParseTree ast = angularParser.program();
        AngularVisitor angularVisitor = new AngularVisitor();
        Angular program = (Angular) angularVisitor.visit(ast);
//        System.out.println(program);

        String source1 = "src/HtmlExample1.txt";
        CharStream charStream1 = fromFileName(source1);
        HtmlLexer htmlLexer = new HtmlLexer(charStream1);
        CommonTokenStream tokens1 = new CommonTokenStream(htmlLexer);
        HtmlParser htmlParser = new HtmlParser(tokens1);
        ParseTree ast1 = htmlParser.html();
        HtmlVisitor htmlVisitor = new HtmlVisitor();
        Html tags = (Html) htmlVisitor.visit(ast1);
        System.out.println(tags);



//        String source2 = "src/Test1.txt";
//        CharStream charStream2 = fromFileName(source2);
//        CssLexer cssLexer = new CssLexer(charStream2);
//        CommonTokenStream tokens2 = new CommonTokenStream(cssLexer);
//        CssParser cssParser = new CssParser(tokens2);
//        ParseTree ast2 = cssParser.cssFile();
//        CssVisitor cssVisitor = new CssVisitor();
//        CssFile cssFile = (CssFile) cssVisitor.visit(ast2);
//        System.out.println(cssFile);


        if (!angularVisitor.errors.isEmpty()) {
            System.out.println("❌ Found semantic errors:");
            for (String error : angularVisitor.errors) {
                System.out.println(" - " + error);
            }
            System.exit(1);
        }else {
            System.out.println("✅ Parsed Program:");
            System.out.println(program);
        }


    }
}
