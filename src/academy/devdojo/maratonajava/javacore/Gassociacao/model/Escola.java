package academy.devdojo.maratonajava.javacore.Gassociacao.model;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime() {
        System.out.println("Escola: "+this.nome);
        if (professores == null) {
            return;
        }
        System.out.print("Professor(es): ");
        for (Professor professor : professores) {
            System.out.print(professor.getNome()+" ");
        }

    }

    public String getNome() {
        return nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
