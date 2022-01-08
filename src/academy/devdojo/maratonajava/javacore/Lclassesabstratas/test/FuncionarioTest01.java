package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.model.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.model.Gerente;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.model.Programador;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", 16000);
        Programador programador = new Programador("Gabriel", 3900);
        System.out.println(gerente);
        System.out.println(programador);
        gerente.imprime();
        programador.imprime();
    }
}
