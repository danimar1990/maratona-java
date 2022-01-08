package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivos;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio1 = new RepositorioBancoDeDados();
        Repositorio repositorio2 = new RepositorioArquivos();
        Repositorio repositorio3 = new RepositorioMemoria();
        repositorio1.salvar();
        repositorio2.salvar();
        repositorio3.salvar();
    }
}
