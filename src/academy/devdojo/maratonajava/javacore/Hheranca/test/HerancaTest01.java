package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.model.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.model.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.model.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Martin Berkmiller");
        endereco.setCep("89600-000");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Danimar");
        pessoa.setCpf("18592937490");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("----------------------------------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Jaqueline");
        funcionario.setCpf("22385373690");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();
        System.out.println("----------------------------------");
        funcionario.relatorioPagamento();
    }
}
