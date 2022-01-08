package academy.devdojo.maratonajava.javacore.Bintroducaometodos.model;

public class ImpressoraEstudante {
    Estudante estudante = new Estudante();

    public void imprime(Estudante estudante) {
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("---------------");
    }
}
