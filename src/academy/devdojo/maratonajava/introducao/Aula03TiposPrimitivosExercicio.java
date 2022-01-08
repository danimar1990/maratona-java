package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>.
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Danimar";
        String rua = "Martin Berkmiller";
        int numero = 13;
        String bairro = "Flor da Serra";
        String cidade = "Joaçaba";
        String uf = "SC";
        double salario = 4360.0d;
        String data = "01/11/2021";
        String hora = "19:30";

    System.out.println("Eu, "+nome+", residente na rua "+rua+", "+numero+", "
            +bairro+", "+cidade+"/"+uf+", recebi a importância de R$"
            +salario+" em "+data+" às "+hora+".");

    }
}
