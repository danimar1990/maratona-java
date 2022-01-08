package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("O resultado da soma dos dois números é: ");
        calculadora.somaDoisNumero();
        System.out.println("O resultado da subtração dos dois números é: ");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando a execução dos métodos da classe Calculadora.");
    }
}
