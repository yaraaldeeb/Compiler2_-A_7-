package src.AST;

public class Directive extends Program {
    String at, id , openBracket, closeBracket, openCurly, closeCurly;
    Sittings sittings = new Sittings();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Directive: ");
        stringBuilder.append("\n");
        if (this.id != null) {
            stringBuilder.append("Directive Name: ");
            stringBuilder.append(this.id);
            stringBuilder.append("\n");
        }
        if (this.sittings != null) {
            stringBuilder.append("Component sittings: ");
            if (this.sittings.ids != null) {
                stringBuilder.append("IDs: ");
                stringBuilder.append("\n");
                for (int i = 0 ; i < this.sittings.ids.size(); i++) {
                    stringBuilder.append(this.sittings.ids.get(i));
                    stringBuilder.append("\n");
                }
                stringBuilder.append("\n");
            }
            if (this.sittings.paths != null) {
                stringBuilder.append("Paths: ");
                stringBuilder.append("\n");
                for (int i = 0 ; i < this.sittings.paths.size(); i++) {
                    stringBuilder.append(this.sittings.paths.get(i));
                    stringBuilder.append("\n");
                }
                stringBuilder.append("\n");
            }
            if (this.sittings.thingToImports != null) {
                stringBuilder.append("Things We Imported: ");
                stringBuilder.append("\n");
                for (int i = 0 ; i < this.sittings.thingToImports.size(); i++) {
                    stringBuilder.append(this.sittings.thingToImports.get(i));
                    for (int j = 0 ; j < this.sittings.thingToImports.get(i).ids.size(); j++) {
                        stringBuilder.append(this.sittings.thingToImports.get(i).ids.get(j));
                        stringBuilder.append("\n");
                    }
                    stringBuilder.append("\n");
                }
                stringBuilder.append("\n");
            }
        }


        return stringBuilder.toString();
    }

    public void setAt(String at) {
        this.at = at;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOpenBracket(String openBracket) {
        this.openBracket = openBracket;
    }

    public void setCloseBracket(String closeBracket) {
        this.closeBracket = closeBracket;
    }

    public void setOpenCurly(String openCurly) {
        this.openCurly = openCurly;
    }

    public void setCloseCurly(String closeCurly) {
        this.closeCurly = closeCurly;
    }

    public void setSittings(Sittings sittings) {
        this.sittings = sittings;
    }

    public String getAt() {
        return at;
    }

    public String getId() {
        return id;
    }

    public String getOpenBracket() {
        return openBracket;
    }

    public String getCloseBracket() {
        return closeBracket;
    }

    public String getOpenCurly() {
        return openCurly;
    }

    public String getCloseCurly() {
        return closeCurly;
    }

    public Sittings getSittings() {
        return sittings;
    }
}
