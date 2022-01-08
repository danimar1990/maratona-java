package academy.devdojo.maratonajava.javacore.Csobrecargametodos.model;

public class Anime {
    private String nome;
    private String categoria;
    private String genero;
    private int episodios;

    public Anime(String nome) {
        System.out.println("Dentro do construtor!");
        this.nome = nome;
    }

    public void init(String nome, String categoria, int episodios) {
        this.nome = nome;
        this.categoria = categoria;
        this.episodios = episodios;
    }

    public void init(String nome, String categoria, String genero, int episodios) {
        this.init(nome, categoria, episodios);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Gênero: "+this.genero);
        System.out.println("Episódios: "+this.episodios);
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
