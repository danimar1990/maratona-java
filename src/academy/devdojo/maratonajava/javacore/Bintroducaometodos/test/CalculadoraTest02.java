package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("O resultado da multiplicação dos dois números é: ");
        int num1 = 10;
        calculadora.multiplicaDoisNumeros(num1, 50);
        System.out.println("Finalizando a execução dos métodos da classe Calculadora.");
    }
}