package src.AST;

public class ImportStmt extends Program{
    String keyword1 , keyword2, openCurly, closeCurly, path, cemmi;

    ThingToImport thingToImport = new ThingToImport();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Import Statement: ");
        if (this.keyword1 != null) {
            stringBuilder.append(this.keyword1);
            stringBuilder.append("\t");
        }

        if (this.thingToImport != null) {
            if (this.thingToImport.ids != null) {
                for (int i = 0 ; i < this.thingToImport.ids.size(); i++) {
                    stringBuilder.append("ID: ");
                    stringBuilder.append(this.thingToImport.ids.get(i));
                    stringBuilder.append("\t");
                }
            }
            stringBuilder.append("\t");
        }

        if (this.path != null) {
            stringBuilder.append(this.path);
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public void setKeyword1(String keyword1) {
        this.keyword1 = keyword1;
    }

    public void setKeyword2(String keyword2) {
        this.keyword2 = keyword2;
    }

    public void setOpenCurly(String openCurly) {
        this.openCurly = openCurly;
    }

    public void setCloseCurly(String closeCurly) {
        this.closeCurly = closeCurly;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setCemmi(String cemmi) {
        this.cemmi = cemmi;
    }

    public void setThingToImport(ThingToImport thingToImport) {
        this.thingToImport = thingToImport;
    }

    public String getKeyword1() {
        return keyword1;
    }

    public String getKeyword2() {
        return keyword2;
    }

    public String getOpenCurly() {
        return openCurly;
    }

    public String getCloseCurly() {
        return closeCurly;
    }

    public String getPath() {
        return path;
    }

    public String getCemmi() {
        return cemmi;
    }

    public ThingToImport getThingToImport() {
        return thingToImport;
    }
}
