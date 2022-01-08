package academy.devdojo.maratonajava.javacore.Lclassesabstratas.model;

public class Programador extends Funcionario {
    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
