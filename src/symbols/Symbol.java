package symbols;

public class Symbol {
    public SymbolTypes type;
    public String name;
    public SymbolTable table;

    public Object val;

    public Symbol(String name, SymbolTypes type, SymbolTable table) {
        this.name = name;
        this.type = type;
        this.table = table;
    }
}
