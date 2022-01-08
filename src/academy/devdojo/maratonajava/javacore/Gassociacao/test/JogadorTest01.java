package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Lionel Andrés Messi Cuccittini");
        Jogador jogador2 = new Jogador("Cristiano Ronaldo dos Santos Aveiro");
        Jogador jogador3 = new Jogador("Neymar da Silva Santos Júnior");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }

}
