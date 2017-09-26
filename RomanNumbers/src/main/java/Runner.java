import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Runner {
    public static void main(String[] args) {
        Translator translator = new Translator();
        ANTLRInputStream input = new ANTLRInputStream(translator.toDecimal(System.in));
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        System.out.println(translator.toRoman(parser.getResult()));
    }

}
