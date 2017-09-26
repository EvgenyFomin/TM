

import java.io.*;
import java.util.ArrayList;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Compiler {

    public static void compile(String in) throws  IOException {

        String out = "compiled";

        ANTLRInputStream input = new ANTLRInputStream(new FileReader(in));
        GrammarLexer lexer = new GrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        ParseTree tree = parser.start();
        ParseTreeWalker walker = new ParseTreeWalker();
        CodeListener codeListener = new CodeListener();
        walker.walk(codeListener, tree);

        FileWriter fileWriter = new FileWriter(out);

        ArrayList<String> byteCode = CodeListener.getAnswer();

        int size = byteCode.size();
        for (int i = 0; i < size; i++){
            fileWriter.write(i + ": ");
            fileWriter.write(byteCode.get(i) + '\n');
        }

        fileWriter.flush();
    }

}
