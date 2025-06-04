package src.AST;

import java.util.ArrayList;

public class ArrayOrObject {
    String open , close;
    ArrayList<Value> values;
    public ArrayOrObject() {
        this.values = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.open.equals("[") && this.close.equals("]")) {
            stringBuilder.append("Array: ");
        } else if (this.open.equals("{") && this.close.equals("}")) {
            stringBuilder.append("Object: ");
        }
        if (this.values != null) {
            for (int i = 0 ; i < this.values.size(); i++){
                stringBuilder.append(this.values.get(i).val);
                stringBuilder.append("\t");
            }
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public void addChild(Value value) {
        this.values.add(value);
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public void setValues(ArrayList<Value> values) {
        this.values = values;
    }

    public String getOpen() {
        return open;
    }

    public String getClose() {
        return close;
    }

    public ArrayList<Value> getValues() {
        return values;
    }
}
