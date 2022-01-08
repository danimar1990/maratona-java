package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.model.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.model.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.model.Pessoa;

public class HerancaTest02 {
    public static void main(String[] args) {
        // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a super classe
        // 1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha
        // 2 - Alocado espaço em memória para o objeto da super classe;
        // 3 - Cada atributo da super classe é criado e inicializado com valores default ou definidos na super classe
        // 4 - Bloco de inicialização da super classe é executado na ordem em que aparece
        // 5 - Construtor da super classe é executado
        // 6 - Alocado espaço em memória para o objeto da sub classe
        // 7 - Cada atributo da sub classe é criado e inicializado com valores default ou definidos na sub classe
        // 8 - Bloco de inicialização da sub classe é executado na ordem em que aparece
        // 9 - Construtor da sub classe é executado
        Funcionario funcionario = new Funcionario("Danimar");
    }
}
