package src.AST;

import gen.AngularParser;

public class Comparession extends Exp{
    AngularParser.ExpContext left, right;
    String operation;
    public Comparession(AngularParser.ExpContext left, AngularParser.ExpContext right, String operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

//    @Override
//    public String toString() {
//        return this.left.toString() + "\t" + this.operation + "\t" + this.right.toString() + "\n";
//    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.left.exp().get(0).ID() != null) {
            stringBuilder.append(this.left.exp().get(0).ID().getText());
            stringBuilder.append("\t");
        }
        if (this.left.exp(0).NUMBER() != null) {
            stringBuilder.append(this.left.exp().get(0).NUMBER().getText());
            stringBuilder.append("\t");
        }
        if (this.operation != null) {
            stringBuilder.append(this.operation);
            stringBuilder.append("\n");
        }
        if (this.right.exp(1).ID() != null) {
            stringBuilder.append(this.right.exp().get(1).ID().getText());
            stringBuilder.append("\t");
        }
        if (this.right.exp(1).NUMBER() != null) {
            stringBuilder.append(this.right.exp().get(1).NUMBER().getText());
            stringBuilder.append("\t");
        }
        return stringBuilder.toString();
    }
}
