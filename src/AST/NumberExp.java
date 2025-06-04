package src.AST;

public class NumberExp extends Exp{
    int num;
    public NumberExp(int num) {
        this.num = num;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.num);
        return stringBuilder.toString();
    }
}
