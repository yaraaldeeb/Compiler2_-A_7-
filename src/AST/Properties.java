package src.AST;

import java.util.ArrayList;

public class Properties extends Body {
    String keyword , colon, assign, cemmi, at, openBracket1, closeBracket1, keyword2, leftArrow, rightArrow, openBracket2, closeBracket2 , openSquare, closeSquare;
    ArrayList<String> ids = new ArrayList<>();
    DataType dataType = new DataType();
    Value value = new Value();
    ArrayOrObject arrayOrObject = new ArrayOrObject();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Properties: ");
        if (this.ids != null) {
            for (int i = 0 ; i < this.ids.size(); i++) {
                stringBuilder.append(this.ids.get(i));
                stringBuilder.append("\t");
            }
            stringBuilder.append("\n");

            if (this.dataType != null) {
                if (this.dataType.getDataType() != null) {
                    stringBuilder.append(this.dataType.getDataType());
                    stringBuilder.append("\n");
                }
            }
            if (this.value != null) {
                if (this.value.val != null) {
                    stringBuilder.append(this.value.val);
                    stringBuilder.append("\n");
                }
            }
            if (this.arrayOrObject != null) {
                if(this.arrayOrObject.values != null) {
                    for (int i = 0 ; i < this.arrayOrObject.values.size(); i++) {
                        stringBuilder.append(this.arrayOrObject.values.get(i).val);
                        stringBuilder.append("\t");
                    }
                }
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public void addChild(String id) {
        this.ids.add(id);
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public void setCemmi(String cemmi) {
        this.cemmi = cemmi;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public void setOpenBracket1(String openBracket1) {
        this.openBracket1 = openBracket1;
    }

    public void setCloseBracket1(String closeBracket1) {
        this.closeBracket1 = closeBracket1;
    }

    public void setKeyword2(String keyword2) {
        this.keyword2 = keyword2;
    }

    public void setLeftArrow(String leftArrow) {
        this.leftArrow = leftArrow;
    }

    public void setRightArrow(String rightArrow) {
        this.rightArrow = rightArrow;
    }

    public void setOpenBracket2(String openBracket2) {
        this.openBracket2 = openBracket2;
    }

    public void setCloseBracket2(String closeBracket2) {
        this.closeBracket2 = closeBracket2;
    }

    public void setOpenSquare(String openSquare) {
        this.openSquare = openSquare;
    }

    public void setCloseSquare(String closeSquare) {
        this.closeSquare = closeSquare;
    }

    public void setIds(ArrayList<String> ids) {
        this.ids = ids;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public void setArrayOrObject(ArrayOrObject arrayOrObject) {
        this.arrayOrObject = arrayOrObject;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getColon() {
        return colon;
    }

    public String getAssign() {
        return assign;
    }

    public String getCemmi() {
        return cemmi;
    }

    public String getAt() {
        return at;
    }

    public String getOpenBracket1() {
        return openBracket1;
    }

    public String getCloseBracket1() {
        return closeBracket1;
    }

    public String getKeyword2() {
        return keyword2;
    }

    public String getLeftArrow() {
        return leftArrow;
    }

    public String getRightArrow() {
        return rightArrow;
    }

    public String getOpenBracket2() {
        return openBracket2;
    }

    public String getCloseBracket2() {
        return closeBracket2;
    }

    public String getOpenSquare() {
        return openSquare;
    }

    public String getCloseSquare() {
        return closeSquare;
    }

    public ArrayList<String> getIds() {
        return ids;
    }

    public DataType getDataType() {
        return dataType;
    }

    public Value getValue() {
        return value;
    }

    public ArrayOrObject getArrayOrObject() {
        return arrayOrObject;
    }
}
