package src.HtmlAst;

import java.util.ArrayList;

public class Enterpolation {
    String openCurly1,openCurly2, closeCurly1,closeCurly2;
    ArrayList<String> ids = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Enterpolation: ");
        stringBuilder.append("\n");
        if (this.ids != null) {
            for (String id: this.ids) {
                stringBuilder.append(id);
                stringBuilder.append("\t");
            }
        }
        return stringBuilder.toString();
    }


    public void setOpenCurly1(String openCurly1) {
        this.openCurly1 = openCurly1;
    }

    public void setOpenCurly2(String openCurly2) {
        this.openCurly2 = openCurly2;
    }

    public void setCloseCurly1(String closeCurly1) {
        this.closeCurly1 = closeCurly1;
    }

    public void setCloseCurly2(String closeCurly2) {
        this.closeCurly2 = closeCurly2;
    }

    public void setIds(ArrayList<String> ids) {
        this.ids = ids;
    }

    public String getOpenCurly1() {
        return openCurly1;
    }

    public String getOpenCurly2() {
        return openCurly2;
    }

    public String getCloseCurly1() {
        return closeCurly1;
    }

    public String getCloseCurly2() {
        return closeCurly2;
    }

    public ArrayList<String> getIds() {
        return ids;
    }
}
