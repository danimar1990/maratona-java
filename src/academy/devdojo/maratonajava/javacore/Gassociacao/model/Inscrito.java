package academy.devdojo.maratonajava.javacore.Gassociacao.model;

public class Inscrito {
    private String nome;
    private int idade;
    private Evento evento;

    public Inscrito(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Inscrito(String nome, int idade, Evento evento) {
        this.nome = nome;
        this.idade = idade;
        this.evento = evento;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
