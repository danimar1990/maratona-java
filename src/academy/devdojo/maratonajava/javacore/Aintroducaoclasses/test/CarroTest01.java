package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "BMW";
        carro1.modelo = "320i";
        carro1.ano = 2022;

        System.out.println("Carro 1");
        System.out.println("Marca: "+carro1.marca);
        System.out.println("Modelo: "+carro1.modelo);
        System.out.println("Ano: "+carro1.ano);

        System.out.println("---------------------");

        Carro carro2 = new Carro();
        carro2.marca = "Porsche";
        carro2.modelo = "Cayenne";
        carro2.ano = 2022;

        System.out.println("Carro 2");
        System.out.println("Marca: "+carro2.marca);
        System.out.println("Modelo: "+carro2.modelo);
        System.out.println("Ano: "+carro2.ano);
    }
}
