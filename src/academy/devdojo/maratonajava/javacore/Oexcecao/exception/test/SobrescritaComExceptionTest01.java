package academy.devdojo.maratonajava.javacore.Oexcecao.exception.test;

import academy.devdojo.maratonajava.javacore.Oexcecao.exception.model.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexcecao.exception.model.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexcecao.exception.model.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try {
            pessoa.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
