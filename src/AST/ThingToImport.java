package src.AST;

import java.util.ArrayList;

public class ThingToImport {
    ArrayList<String> ids = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Things to import: ");
        stringBuilder.append("\n");
        if (this.ids != null) {
            for (int i = 0 ; i < this.ids.size(); i++) {
                stringBuilder.append(this.ids.get(i));
                stringBuilder.append("\t");
            }
        }
        return stringBuilder.toString();
    }

    public void print() {
        for (int i= 0 ; i < this.ids.size(); i++) {
            System.out.println("ID: " + (i+1) + " \t" + this.ids.get(i));
        }
    }

    public void addChild(String id) {
        this.ids.add(id);
    }

    public void setIds(ArrayList<String> ids) {
        this.ids = ids;
    }

    public ArrayList<String> getIds() {
        return ids;
    }
}
