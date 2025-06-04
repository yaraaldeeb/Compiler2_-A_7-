package src.AST;

import gen.AngularParser;

public class Arithmatic extends Operations{
    Exp left, right;
    String operation;
    public Arithmatic(Exp left,Exp right, String operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return this.left.toString() + "\t" + this.operation + "\t" + this.right.toString() + "\n";
    }


//    @Override
//    public String toString() {
//        return "Arithmatic{" +
//                "left=" + left +
//                ", right=" + right +
//                ", operation='" + operation + '\'' +
//                '}';
//    }
}
