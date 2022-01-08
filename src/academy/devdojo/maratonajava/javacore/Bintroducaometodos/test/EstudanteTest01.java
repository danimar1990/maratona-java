package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Danimar";
        estudante1.idade = 31;
        estudante1.sexo = 'M';

        estudante2.nome = "Jaqueline";
        estudante2.idade = 31;
        estudante2.sexo = 'F';

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

        estudante1.imprime();
        estudante2.imprime();
    }
}
