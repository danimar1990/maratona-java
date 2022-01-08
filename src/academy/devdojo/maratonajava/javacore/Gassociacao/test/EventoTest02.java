package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Evento;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Inscrito;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Palestrante;

public class EventoTest02 {
    public static void main(String[] args) {
        Local local = new Local("Rua Martin Berkmiller, 13, Flor da Serra");
        Evento evento = new Evento("Tomorrowland 2022");
        Palestrante palestrante = new Palestrante("Mark Zukerberg", "Influenciador");
        Inscrito inscrito = new Inscrito("Danimar", 31);

        System.out.println("Evento: "+evento.getTitulo());
        System.out.println("Local: "+local.getEndereco());
        System.out.println("Palestrante: "+palestrante.getNome());
        System.out.println("Inscrito: "+inscrito.getNome()+", Idade:"+inscrito.getIdade());
    }
}
