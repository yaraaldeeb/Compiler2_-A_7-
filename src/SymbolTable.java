package src;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    private List<Symbol> symbols = new ArrayList<>();

    public void addSymbol(String name, String type, int line, int column, String value) {
        symbols.add(new Symbol(name, type, line, column, value));
    }

    public void print() {
        if (this.symbols != null) {
            for (Symbol symbol: this.symbols) {
                System.out.print("Name: " + symbol.name + "\t");
                System.out.print("Value: " + symbol.value + "\t");
                System.out.print("Type: " + symbol.type + "\t");
                System.out.print("Line: " + symbol.line + "\t");
                System.out.print("Column: " + symbol.column + "\t");
                System.out.println();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name         Type         Line   Column   Value\n");
        for (Symbol s : symbols) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }
}

