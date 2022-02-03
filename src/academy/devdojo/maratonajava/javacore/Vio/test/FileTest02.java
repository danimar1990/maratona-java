package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("arquivos\\pasta");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println("Pasta criada?:"+isDirectoryCreated);

        File newFile = new File(fileDirectory,"arquivo.txt");
        boolean isFileCreated = newFile.createNewFile();
        System.out.println("Arquivo criado?:"+isFileCreated);

        File fileRenamed = new File(fileDirectory, "arquivo_renomeado.pdf");
        boolean isRenamed = newFile.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado?:"+isRenamed);

        File directoryRenamed = new File("pasta2");
        boolean isDirectoryRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println("Direório renomeado?:"+isDirectoryRenamed);
    }
}
