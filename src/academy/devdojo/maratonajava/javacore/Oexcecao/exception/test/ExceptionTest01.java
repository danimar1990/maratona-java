package academy.devdojo.maratonajava.javacore.Oexcecao.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivos/teste.txt");
        try {
            boolean isArquivoCriado = file.createNewFile();
            System.out.println("Arquivo criado: "+isArquivoCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
