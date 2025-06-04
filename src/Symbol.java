package src;

public class Symbol {
    public String name;
    public String type;
    public int line;
    public int column;
    public String value;

    public Symbol(String name, String type, int line, int column, String value) {
        this.name = name;
        this.type = type;
        this.line = line;
        this.column = column;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%-12s %-12s %-6d %-6d %-12s", name, type, line, column, value);
    }
}
