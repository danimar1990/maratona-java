package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatório de imposto de computadores");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: "+computador.getNome());
        System.out.println("Valor: "+computador.getValor());
        System.out.println("Imposto: "+imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatório de imposto de tomates");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: "+tomate.getNome());
        System.out.println("Valor: "+tomate.getValor());
        System.out.println("Imposto: "+imposto);
    }

    //Polimorfismo
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Imposto: "+imposto);
        if(produto instanceof Tomate) {
            System.out.println(((Tomate) produto).getDataValidade());
        }
        //ou atribuir para uma variável
        //if(produto instanceof Tomate) {
        //    String dataValidade = ((Tomate) produto).getDataValidade();
        //    System.out.println(dataValidade);
        //}
    }

}
