package academy.devdojo.maratonajava.javacore.Dconstrutores.model;

public class Anime {
    private String nome;
    private String categoria;
    private String genero;
    private int episodios;
    private String estudio;

    public Anime(String nome, String categoria, String genero, int episodios) {
        this();
        this.nome = nome;
        this.categoria = categoria;
        this.genero = genero;
        this.episodios = episodios;
    }

    public Anime(String nome, String categoria, String genero, int episodios, String estudio) {
        this(nome, categoria, genero, episodios);
        this.estudio = estudio;
    }

    //Construtor vazio
    public Anime() {
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Estúdio: " + this.estudio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

}
