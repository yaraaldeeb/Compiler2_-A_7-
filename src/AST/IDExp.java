package src.AST;

public class IDExp extends Exp {
    String id;
    public IDExp(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.id);
        return stringBuilder.toString();
    }
}
