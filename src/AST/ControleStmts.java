package src.AST;

import java.util.ArrayList;

public class ControleStmts extends Body{
    String keyword;
    Conditions conditions = new Conditions();
    ArrayList<Body> bodies = new ArrayList<>();
    ElseIfStmts elseIfStmts = new ElseIfStmts();
    ElseStmt elseStmt = new ElseStmt();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Control Statement: ");
        stringBuilder.append("\n");
        if (this.keyword != null) {
            stringBuilder.append(this.keyword);
            stringBuilder.append("\t");
        }
        if (this.conditions != null) {
            if (this.conditions.value != null) {
                if (this.conditions.value.val != null) {
                    stringBuilder.append(this.conditions.value.val);
                    stringBuilder.append("\n");
                }
            }
            else if (this.conditions.exp != null) {
                stringBuilder.append("Exp");
                stringBuilder.append("\n");
            }
        }
        if (this.bodies != null) {
            for (int i = 0 ; i < this.bodies.size(); i++) {
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

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    public void setBodies(ArrayList<Body> bodies) {
        this.bodies = bodies;
    }

    public String getKeyword() {
        return keyword;
    }

    public Conditions getConditions() {
        return conditions;
    }

    public ArrayList<Body> getBodies() {
        return bodies;
    }
}
