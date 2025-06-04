package src.AST;

import java.util.ArrayList;

public class ForeachStmt extends Loops {
    String keyword, id1 , id2;
    DataType dataType = new DataType();
    ArrayList<Body> bodies = new ArrayList<>();
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Foreach: ");
        stringBuilder.append("\n");
        if (this.keyword != null) {
            stringBuilder.append(this.keyword);
            stringBuilder.append("\t");
        }
        if (this.id1 != null) {
            stringBuilder.append(this.id1);
            stringBuilder.append("\t");
        }
        if (this.id2 != null) {
            stringBuilder.append(this.id2);
            stringBuilder.append("\t");
        }
        if (this.dataType != null) {
            if (this.dataType.data != null) {
                stringBuilder.append(this.dataType.data);
                stringBuilder.append("\n");
            }
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

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public void setBodies(ArrayList<Body> bodies) {
        this.bodies = bodies;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getId1() {
        return id1;
    }

    public String getId2() {
        return id2;
    }

    public DataType getDataType() {
        return dataType;
    }

    public ArrayList<Body> getBodies() {
        return bodies;
    }
}
