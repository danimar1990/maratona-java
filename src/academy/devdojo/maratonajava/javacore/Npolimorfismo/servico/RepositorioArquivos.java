package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivos implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando dados em um arquivo");
    }
}
