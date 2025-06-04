package src.AST;

import java.util.ArrayList;

public class Structure extends Program {
    String keyword1 , keyword2,  id, openCurly, closeCurly;
    ArrayList<Body> bodies;

    public Structure() {
        this.bodies = new ArrayList<>();
    }

    public void addChild(Body body) {
        this.bodies.add(body);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Structure: ");
        if (this.id != null) {
            stringBuilder.append(this.id);
            stringBuilder.append("\n");
        }
        if (this.bodies != null) {
            for (int i = 0 ; i < this.bodies.size(); i++) {
                stringBuilder.append(this.bodies.get(i));
                stringBuilder.append("\n");

            }
        }
        return stringBuilder.toString();
    }

    public void setKeyword1(String keyword1) {
        this.keyword1 = keyword1;
    }

    public void setKeyword2(String keyword2) {
        this.keyword2 = keyword2;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOpenCurly(String openCurly) {
        this.openCurly = openCurly;
    }

    public void setCloseCurly(String closeCurly) {
        this.closeCurly = closeCurly;
    }

    public void setBodies(ArrayList<Body> bodies) {
        this.bodies = bodies;
    }

    public String getKeyword1() {
        return keyword1;
    }

    public String getKeyword2() {
        return keyword2;
    }

    public String getId() {
        return id;
    }

    public String getOpenCurly() {
        return openCurly;
    }

    public String getCloseCurly() {
        return closeCurly;
    }

    public ArrayList<Body> getBodies() {
        return bodies;
    }
}
