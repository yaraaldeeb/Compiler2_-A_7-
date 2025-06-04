package src.AST;

public class DataType {
    String data;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.data);
        return stringBuilder.toString();
    }

    public void setDataType(String dataType) {
        this.data = dataType;
    }

    public String getDataType() {
        return data;
    }
}
