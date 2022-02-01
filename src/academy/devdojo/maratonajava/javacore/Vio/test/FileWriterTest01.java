package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Invelox-Desk\\Documents\\IdeaProjects\\devDojo\\maratona-java\\arquivos\\arquivo2.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Danimar\nHenrique\nVarisa\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
