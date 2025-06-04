package src.CSSAST;

import java.util.ArrayList;

public class CssFile {
    private String eof;
    private ArrayList<CssStyles> cssLists = new ArrayList<>();

    public void addChild(CssStyles cssStyle) {
        this.cssLists.add(cssStyle);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        if (!this.cssLists.isEmpty()) {
            for (CssStyles cssStyle : this.cssLists) {
                stringBuilder.append(cssStyle.toString());
                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }

    public void setEof(String eof) {
        this.eof = eof;
    }

    public void setCssLists(ArrayList<CssStyles> cssLists) {
        this.cssLists = cssLists;
    }

    public String getEof() {
        return eof;
    }

    public ArrayList<CssStyles> getCssLists() {
        return cssLists;
    }
}
