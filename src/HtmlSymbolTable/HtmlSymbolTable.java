package src.HtmlSymbolTable;

import src.Semantics.ErrorHandler;
import src.Semantics.UndefinedPropertyException;

import java.util.HashMap;
import java.util.Map;

public class HtmlSymbolTable {
    HashMap<String, HtmlRow> symboltable;
    public HtmlSymbolTable() {
        this.symboltable = new HashMap<>();
    }

    public void print() {
        if (this.symboltable != null) {
            System.out.println("Symbol Table: ");
            System.out.printf("%-20s %-20s %-10s %-10s%n" , "Name" , "Value" , "Line" , "Column");
            System.out.println("--------------------------------------------------------------------------------");
            for (HashMap.Entry<String, HtmlRow> entry: symboltable.entrySet()) {
                HtmlRow row = entry.getValue();
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

    public void addElement(String key, HtmlRow row) {
        this.symboltable.put(key, row);
    }

}
