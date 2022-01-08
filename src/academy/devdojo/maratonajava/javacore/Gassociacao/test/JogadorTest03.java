package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Lionel Andrés Messi Cuccittini");
        Jogador jogador2 = new Jogador("Cristiano Ronaldo dos Santos Aveiro");
        Jogador jogador3 = new Jogador("Neymar da Silva Santos Júnior");
        Jogador[] jogadoresPSG = {jogador1,jogador3};
        Jogador[] jogadoresJuventus = {jogador2};

        Time time1 = new Time("Paris Saint-Germain Football Club");
        Time time2 = new Time("Juventus Football Club");

        jogador1.setTime(time1);
        jogador2.setTime(time2);
        jogador3.setTime(time1);

        time1.setJogadores(jogadoresPSG);
        time2.setJogadores(jogadoresJuventus);

        System.out.println("-------------------[TIME 1]-------------------");
        time1.imprime();
        System.out.println();
        System.out.println("-----------[Jogadores]-----------");
        jogador1.imprime();
        jogador3.imprime();

        System.out.println("-------------------[TIME 2]-------------------");
        time2.imprime();
        System.out.println();
        System.out.println("-----------[Jogadores]-----------");
        jogador2.imprime();

    }
}
