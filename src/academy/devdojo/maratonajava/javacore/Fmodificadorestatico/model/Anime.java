package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.model;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em memória para o objeto;
    // 2 - Cada atributoi de classe é criado e inicializado com valores default ou definidos
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

     static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    {
        System.out.println("Dentro do bloco de inicialização não-estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    /*public void setNome(String nome) {
        this.nome = nome;
    }*/

    /*public void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }*/

}
