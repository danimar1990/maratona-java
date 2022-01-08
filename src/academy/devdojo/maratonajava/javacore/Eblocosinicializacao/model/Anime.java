package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.model;

public class Anime {
    private String nome;
    private int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicialização");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        for (int episodio : this.episodios) {
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

}
