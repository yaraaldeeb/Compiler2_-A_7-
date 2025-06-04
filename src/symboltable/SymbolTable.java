package src.symboltable;

import src.Semantics.ErrorHandler;
import src.Semantics.FunctionSignature;
import src.Semantics.MethodOverloadingException;
import src.Semantics.UndefinedPropertyException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable {
    HashMap<String, Row> symboltable;
    private Map<String, List<FunctionSignature>> functions = new HashMap<>();

    public SymbolTable() {
        this.symboltable = new HashMap<>();
    }
    public void print() {
        if (this.symboltable != null) {
            System.out.println("Symbol Table: ");
            System.out.printf("%-20s %-20s %-10s %-10s%n" , "Name" , "Value" , "Line" , "Column");
            System.out.println("--------------------------------------------------------------------------------");
            for (HashMap.Entry<String, Row> entry: symboltable.entrySet()) {
                Row row = entry.getValue();
                System.out.printf("%-20s %-20s %-10d %-10d%n" ,
                        row.getName(),
                        row.getValue(),
                        row.getLine(),
                        row.getColumn()
                );
            }
            System.out.println("--------------------------------------------------------------------------------");
        }
    }

    public void removeAll() {
        this.symboltable.clear();
    }

    public void addElement(String key, Row row) {
        this.symboltable.put(key, row);
    }



    public void addFunction(FunctionSignature signature) throws MethodOverloadingException {
        List<FunctionSignature> list = functions.getOrDefault(signature.name, new ArrayList<>());

        if (list.contains(signature)) {
            throw new MethodOverloadingException("Duplicate method definition for '" + signature.name +
                    "' with parameters: " + signature.parameterTypes);
        }

        list.add(signature);
        functions.put(signature.name, list);
    }

    public void addElementToScope(String key, Row row) {
        if (!this.symboltable.containsValue(row)) {
            this.symboltable.put(key,row);
        }
    }
}
