package src.Semantics;

import src.symboltable.Row;
import src.symboltable.SymbolTable;

import java.util.HashMap;
import java.util.Stack;

public class Scope {
    Stack<SymbolTable> scopes = new Stack<>();

    public void addScope(SymbolTable symbolTable) {
        this.scopes.push(symbolTable);
    }

    public void remoceScope() {
        this.scopes.pop();
    }

    public void setScopes(Stack<SymbolTable> scopes) {
        this.scopes = scopes;
    }

    public Stack<SymbolTable> getScopes() {
        return scopes;
    }

    //    HashMap<String , SymbolTable> scopes = new HashMap<>();

//    public void print() {
//        if (this.scopes != null) {
//            System.out.println("Scopes: ");
//            for (HashMap.Entry<String, SymbolTable> entry: scopes.entrySet()) {
//                System.out.println(entry.getKey());
////                SymbolTable symbolTable = centry.getValue();
//                entry.getValue().print();
//            }
//            System.out.println("--------------------------------------------------------------------------------");
//        }
//    }

//    public void addScope(String key, SymbolTable value) {
//        this.scopes.put(key, value);
//    }

//    public void setScopes(HashMap<String, SymbolTable> scopes) {
//        this.scopes = scopes;
//    }

//    public HashMap<String, SymbolTable> getScopes() {
//        return scopes;
//    }
}
