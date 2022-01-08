package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("H1Z4", 18500);
        Tomate tomate = new Tomate("Sweet Grapes", 15);
        Televisao televisao = new Televisao("Samsung 50'", 3900);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
        System.out.println("------------[Polimorfismo]------------");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImposto(televisao);

    }
}
