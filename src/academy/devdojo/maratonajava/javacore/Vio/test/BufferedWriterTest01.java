package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Invelox-Desk\\Documents\\IdeaProjects\\devDojo\\maratona-java\\arquivos\\arquivo3.txt");
        try (FileWriter fw = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fw)) {
            br.write("Danimar ");
            br.newLine();
            br.newLine();
            br.write("Henrique Varisa");
            br.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
