package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro c1 = new Carro("BMW 320i",240);
        Carro c2 = new Carro("Mercedes CLK-210", 280);
        Carro c3 = new Carro("Audi R8", 290);


        //System.out.println("velocidade antes de modificar: "+Carro.velocidadeLimite);
        Carro.setVelocidadeLimite(199);
        //System.out.println("velocidade depois de modificar:  "+Carro.velocidadeLimite);


        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
