package academy.devdojo.maratonajava.javacore.Oexcecao.exception.model;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {
    public void salvar() throws LoginInvalidoException, RuntimeException {
        System.out.println("Salvando funcionário");
    }
}
