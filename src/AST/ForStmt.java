package src.AST;

import java.util.ArrayList;

public class ForStmt extends Loops {
    String keyword;
    VariableDeclaration variableDeclaration = new VariableDeclaration();
    Conditions conditions = new Conditions();
    Exp exp;
    ArrayList<Body> bodies = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("For: ");
        stringBuilder.append("\n");
        if (this.keyword != null) {
            stringBuilder.append(this.keyword);
            stringBuilder.append("\t");
        }
        if (this.variableDeclaration != null) {
            if (this.variableDeclaration.keyword != null) {
                stringBuilder.append(this.keyword);
                stringBuilder.append("\t");
            }
            if (this.variableDeclaration.id != null) {
                stringBuilder.append(this.variableDeclaration.id);
                stringBuilder.append("\n");
            }
            if (this.variableDeclaration.dataType != null) {
                stringBuilder.append(this.variableDeclaration.dataType.data);
                stringBuilder.append("\n");
            }
            if (this.variableDeclaration.arrayOrObject.values != null) {
                for (int i = 0 ; i < this.variableDeclaration.arrayOrObject.values.size(); i++){
                    stringBuilder.append(this.variableDeclaration.arrayOrObject.values.get(i).val);
                    stringBuilder.append("\t");
                }
            }
            stringBuilder.append("\n");
        }
        if (this.conditions.value != null) {
            if (this.conditions.value.val != null) {
                stringBuilder.append(this.conditions.value.val);
                stringBuilder.append("\n");
            }
            else if(this.conditions.exp != null) {
                stringBuilder.append("Exp");
                stringBuilder.append("\n");
            }
        }
        if(this.exp != null) {
            stringBuilder.append("Exp");
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

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    public void setExp(Exp exp) {
        this.exp = exp;
    }

    public void setBodies(ArrayList<Body> bodies) {
        this.bodies = bodies;
    }

    public String getKeyword() {
        return keyword;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public Conditions getConditions() {
        return conditions;
    }

    public Exp getExp() {
        return exp;
    }

    public ArrayList<Body> getBodies() {
        return bodies;
    }
}
