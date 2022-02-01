package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Invelox-Desk\\Documents\\IdeaProjects\\devDojo\\maratona-java\\arquivos\\file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            System.out.println("Caminho: "+file.getPath());
            System.out.println("Caminho absoluto: "+file.getAbsolutePath());
            System.out.println("isDiretorio?: "+file.isDirectory());
            System.out.println("isArquivo?: "+file.isFile());
            System.out.println("isOculto?: "+file.isHidden());
            System.out.println("isCanRead?: "+file.canRead());
            System.out.println("isCanExecute?: "+file.canExecute());
            System.out.println("Última modificação: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
            boolean exists = file.exists();
            if (exists) {
                //file.delete();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
