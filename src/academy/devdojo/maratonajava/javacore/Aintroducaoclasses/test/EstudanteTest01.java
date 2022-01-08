package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.model.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.nome = "Danimar";
        estudante1.idade = 31;
        estudante1.sexo = 'M';

        System.out.println("Estudante 1");
        System.out.println("Nome: "+estudante1.nome);
        System.out.println("Idade: "+estudante1.idade);
        System.out.println("Sexo: "+estudante1.sexo);
    }
}
