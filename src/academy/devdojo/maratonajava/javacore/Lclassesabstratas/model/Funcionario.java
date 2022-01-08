package academy.devdojo.maratonajava.javacore.Lclassesabstratas.model;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public abstract void calculaBonus();
}
