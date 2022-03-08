import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import symbols.SymbolTable;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        symbolTable = new SymbolTable();
        CharStream in = CharStreams.fromFileName("C:/Users/Matt/IdeaProjects/simpterp/src/test.cc");
        /*
        bitbybitLexer lexer = new bitbybitLexer(in);
        CommonTokenStream tokens = new CommonTokenStream((TokenSource) lexer);
        bitbybitParser parser = new bitbybitParser(tokens);

        ParseTree tree = parser.rule();
        System.out.println(tree.toStringTree(parser));
         */
    }

    public static SymbolTable symbolTable;
}
