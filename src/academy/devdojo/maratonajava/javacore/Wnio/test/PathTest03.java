package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/danimar");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absuluto = Paths.get("/home/danimar");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1 Absoluto resolve Relativo: "+absuluto.resolve(relativo));
        System.out.println("1 Absoluto resolve File: "+absuluto.resolve(file));
        System.out.println("3 Relativo resolve Absoluto: "+relativo.resolve(absuluto));
        System.out.println("4 Relativo resolve File: "+relativo.resolve(file));
        System.out.println("5 Arquivo resolve Absoluto: "+file.resolve(absuluto));
        System.out.println("6 Arquivo resolve Relativo: "+file.resolve(relativo));
    }
}
