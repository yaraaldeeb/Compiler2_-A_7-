package src.AST;

public class Value {
    String val, keyword;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.val);
        return stringBuilder.toString();
    }

    public void setVal(String val) {
        this.val = val;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getVal() {
        return val;
    }

    public String getKeyword() {
        return keyword;
    }
}
