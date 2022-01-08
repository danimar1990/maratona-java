package academy.devdojo.maratonajava.javacore.Npolimorfismo.model;

public abstract class Produto implements Imposto {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
