package src.HtmlAst;

public class HValue {
    String val;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Value: ");
        stringBuilder.append("\n");
        if (this.val != null) {
            stringBuilder.append(this.val);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
