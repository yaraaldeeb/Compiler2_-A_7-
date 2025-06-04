package src.AST;

public class VariableDeclaration extends Body {
    String keyword , id, colon, assign, cemmi;
    DataType dataType = new DataType();
    Value value = new Value();
    ArrayOrObject arrayOrObject = new ArrayOrObject();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Variable Declaration: ");
        if (this.keyword != null) {
            stringBuilder.append(this.keyword);
            stringBuilder.append("\t");
        }
        if (this.id != null) {
            stringBuilder.append(this.id);
            stringBuilder.append("\n");
        }
        if (this.dataType != null) {
            stringBuilder.append(this.dataType.data);
            stringBuilder.append("\n");
        }
        if (this.arrayOrObject.values != null) {
            for (int i = 0 ; i < this.arrayOrObject.values.size(); i++){
                stringBuilder.append(this.arrayOrObject.values.get(i).val);
                stringBuilder.append("\t");
            }
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getId() {
        return id;
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
