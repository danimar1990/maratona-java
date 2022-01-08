package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class EventoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do evento:");
        String evento = entrada.nextLine();
        System.out.println("Digite o endereço do local:");
        String local = entrada.nextLine();
        System.out.println("Digite o nome do palestrante:");
        String palestrante = entrada.nextLine();
        System.out.println("Quem você deseja inscrever:");
        String inscrito = entrada.nextLine();
        System.out.println("Idade do participante:");
        String idade = entrada.nextLine();

        System.out.println("---------------------[INSCRIÇÃO]---------------------");
        System.out.println("Evento: "+evento);
        System.out.println("Local: "+local);
        System.out.println("Palestrante: "+palestrante);
        System.out.println("Inscrito: "+inscrito);
        System.out.println("Idade: "+idade);
    }
}
