package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Danimar");
        funcionario.setIdade(31);
        funcionario.setSalarios(new double[]{2500, 3410, 2947});

        funcionario.imprime();
        funcionario.mediaSalarial();
    }
}
