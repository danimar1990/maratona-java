package academy.devdojo.maratonajava.javacore.Gassociacao.model;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime() {
        System.out.println("Jogador: "+this.nome);
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
