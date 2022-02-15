package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
        if(Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        } else {
            System.out.println("Diretório já existe");
        }

        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);
        Path filePath = Paths.get(subPastaPath.toString(), "fileeee.txt");
        if(Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        } else {
            System.out.println("Arquivo já existe");
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "arquivo_renomeado2.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
