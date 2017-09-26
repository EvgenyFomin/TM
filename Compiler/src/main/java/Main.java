import java.io.*;
public class Main {

    public static void main(String[] args) {
        try {
            Compiler.compile("original");
            Decompiler.decompile();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }

}
