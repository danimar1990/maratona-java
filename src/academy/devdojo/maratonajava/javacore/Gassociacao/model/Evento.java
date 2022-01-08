package academy.devdojo.maratonajava.javacore.Gassociacao.model;

public class Evento {
    private String titulo;
    private Inscrito[] inscritos;
    private Local local;

    public Evento(String titulo) {
        this.titulo = titulo;
    }

    public Evento(String titulo, Inscrito[] inscritos) {
        this.titulo = titulo;
        this.inscritos = inscritos;
    }

    public Evento(String titulo, Inscrito[] inscritos, Local local) {
        this.titulo = titulo;
        this.inscritos = inscritos;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public Inscrito[] getInscritos() {
        return inscritos;
    }

    public Local getLocal() {
        return local;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setInscritos(Inscrito[] inscritos) {
        this.inscritos = inscritos;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
