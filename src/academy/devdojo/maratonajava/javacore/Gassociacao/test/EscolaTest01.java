package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Elézio");
        Professor professor2 = new Professor("Magda");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Superativo", professores);

        escola.imprime();
    }
}
