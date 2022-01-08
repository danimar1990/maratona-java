package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Dentro da classe CalculadoraTest04");
        int num1 = 1;
        int num2 = 2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("-----------------------");
        System.out.println("Dentro do método alteraDoisNumeros da classe Calculadora");
        calculadora.alteraDoisNumeros(num1, num2);
    }
}
