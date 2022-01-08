package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.model;

public class Ferrari extends Carro {
    private String nome;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
