package src.AST;

import java.util.ArrayList;
import java.util.List;

public class Operations extends Exp{
    List<Exp> exps;
    public Operations() {
        this.exps = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.exps != null) {
            for (int i = 0; i < this.exps.size(); i++) {
                if (this.exps.get(i).left != null) {
                    stringBuilder.append(this.exps.get(i).left.toString());
                    stringBuilder.append("\t");
                }if (this.exps.get(i).operation != null) {
                    stringBuilder.append(this.exps.get(i).operation);
                    stringBuilder.append("\t");
                }
                if (this.exps.get(i).right != null) {
                    stringBuilder.append(this.exps.get(i).right.toString());
                    stringBuilder.append("\t");
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void addExp(Exp exp) {
        this.exps.add(exp);
    }

}
