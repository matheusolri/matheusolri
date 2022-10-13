package main;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.plaf.synth.SynthIcon;

public class Main {

    public static void main(String[] args) throws IOException {
        runFile("test.txt");
        if (args.length > 0) {
            runFile(args[0]);
        } else {
            System.out.println("Compilou com sucesso.");
        }
    }

    private static void runFile(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        run(new String(bytes, Charset.defaultCharset()));
    }

    private static void run(String source) {
        Scanner sc = new Scanner(source);
        List<Token> tokens = sc.scanTokens();

        Interpreter itp = new Interpreter(tokens);
        itp.programa();
    }
}
