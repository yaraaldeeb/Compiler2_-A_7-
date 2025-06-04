package src.AST;

import java.util.ArrayList;

public class ElseStmt {
    String keyword;
    ArrayList<Body> bodies = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("else: ");
        if (this.keyword != null) {
            stringBuilder.append(this.keyword);
            stringBuilder.append("\n");
        }

        if (this.bodies != null) {
            for (int i = 0 ; i <this.bodies.size();i++) {
                stringBuilder.append(this.bodies.get(i));
                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }

    public void addChild(Body body) {
        this.bodies.add(body);
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setBodies(ArrayList<Body> bodies) {
        this.bodies = bodies;
    }

    public String getKeyword() {
        return keyword;
    }

    public ArrayList<Body> getBodies() {
        return bodies;
    }
}
