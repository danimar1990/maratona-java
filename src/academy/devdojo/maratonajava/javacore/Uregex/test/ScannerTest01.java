package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Caranthir Eredin Imlerith Avallac'c";
        String[] nomes = texto.split(" ");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
