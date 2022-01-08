package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.model;

public final class Comprador {
    private String nome;

    public final void imprime() {
        System.out.println(this.getNome());
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
