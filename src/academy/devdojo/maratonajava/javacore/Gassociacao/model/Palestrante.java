package academy.devdojo.maratonajava.javacore.Gassociacao.model;

public class Palestrante {
    private String nome;
    private String especialidade;
    private Evento[] eventos;

    public Palestrante(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Palestrante(String nome, String especialidade, Evento[] eventos) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.eventos = eventos;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public Evento[] getEventos() {
        return eventos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setEventos(Evento[] eventos) {
        this.eventos = eventos;
    }
}
