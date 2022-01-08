package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 4000);
        Produto produto1 = new Tomate("Siciliano", 13);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("15/03/2021");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------");
        CalculadoraImposto.calcularImposto(produto);



    }
}
