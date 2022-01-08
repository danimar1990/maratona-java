package academy.devdojo.maratonajava.javacore.Minterfaces.model;

public interface DataRemover {
    public default void remove() {
        System.out.println("Removendo dados do banco de dados");
    }
}
