package academy.devdojo.maratonajava.javacore.Npolimorfismo.model;

public class Televisao extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.09;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }

}
