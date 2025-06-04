package src.AST;

public class Conditions {
    Value value = new Value();
    Exp exp;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Condition: ");
        if (this.value != null) {
            if (this.value.val != null) {
                stringBuilder.append(this.value.val);
                stringBuilder.append("\n");
            }
        }
        else if(this.exp != null) {
            stringBuilder.append("Exp");
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public void setExp(Exp exp) {
        this.exp = exp;
    }

    public Value getValue() {
        return value;
    }

    public Exp getExp() {
        return exp;
    }
}
