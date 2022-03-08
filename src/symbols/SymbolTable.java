package symbols;

import java.util.ArrayList;

public class SymbolTable {
    SymbolTable parent; // null when this is the global symbol table

    ArrayList<Symbol> symbols;
    ArrayList<SymbolTable> tables;

    public void addSymbol(Symbol symbol) {
        // reassignment is okay, so we don't need to check if it already exists
        symbols.add(symbol);
    }

    public boolean hasSymbol(String name) {
        // look through the current scope
        for (Symbol symbol: symbols) {
            if (symbol.name.equals(name))
                return true;
        }
        // not found in current scope, so check parents
        if (parent != null)
            return parent.hasSymbol(name);

        // not found at all
        return false;
    }

    public Symbol getSymbol(String name) {
        for (Symbol symbol: symbols) {
            if (symbol.name.equals(name))
                return symbol;
        }
        if (parent != null)
            return parent.getSymbol(name);

        return null;
    }

    public SymbolTable addTable(){
        int index = tables.size();
        tables.add(new SymbolTable());
        return tables.get(index);
    }
}