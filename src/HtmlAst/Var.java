package src.HtmlAst;

public class Var {
    String openSquare, id,closeSquare , assign, varAction;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Var: ");
        stringBuilder.append("\n");
        if (this.id != null) {
            stringBuilder.append(this.id);
            stringBuilder.append("\t");
        }
        if (this.assign != null) {
            stringBuilder.append(this.assign);
            stringBuilder.append("\t");
        }
        if (this.varAction != null) {
            stringBuilder.append(this.varAction);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void setOpenSquare(String openSquare) {
        this.openSquare = openSquare;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCloseSquare(String closeSquare) {
        this.closeSquare = closeSquare;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public void setVarAction(String varAction) {
        this.varAction = varAction;
    }

    public String getOpenSquare() {
        return openSquare;
    }

    public String getId() {
        return id;
    }

    public String getCloseSquare() {
        return closeSquare;
    }

    public String getAssign() {
        return assign;
    }

    public String getVarAction() {
        return varAction;
    }
}
