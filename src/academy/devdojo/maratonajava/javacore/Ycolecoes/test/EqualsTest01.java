package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.model.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1ABC2", "Apple");
        Smartphone smartphone2 = new Smartphone("1ABC2", "Motorola");
        System.out.println(smartphone1.equals(smartphone2));

        Smartphone smartphone3 = new Smartphone("1ABC2", "Samsung");
        System.out.println(smartphone3.equals(smartphone3));
    }
}
