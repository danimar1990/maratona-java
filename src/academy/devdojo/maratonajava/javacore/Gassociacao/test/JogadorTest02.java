package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cristiano Ronaldo");
        Time time = new Time("Juventus Football Club");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
