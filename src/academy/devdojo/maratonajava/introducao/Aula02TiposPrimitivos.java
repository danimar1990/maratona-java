package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = 31;
        long km = (int) 10000000L; //usado (int) para fazer um cast de long para int
        double salarioDouble = 3450.5D;
        float salarioFloat = 3450.0F;
        byte temperatura = -28;
        short prazoMaximo = 60;
        boolean verdadeiro = true;
        boolean falso = false;
        char bloco = 'E';
        String frase = "Não é preciso vencer todas as batalhas, mas é preciso lutar todos os dias.";

        System.out.println("A minha idade é "+idade+" anos!");
        System.out.println("O ônibus da Unesul possui mais de "+km+"km rodados.");
        System.out.println("Desejo receber uma média de R$"+salarioDouble+"/mês em 2022.");
        System.out.println("O salário líquido aredondado equivale a +/- R$"+salarioFloat+".");
        System.out.println("Hoje, na Rússia, faz "+temperatura+"º.");
        System.out.println("O prazo máximo do financiamento é de "+prazoMaximo+" meses.");
        System.out.println("você pode escolher entre "+verdadeiro+" ou "+falso+".");
        System.out.println("Você está no bloco '"+bloco+"'.");
        System.out.println(frase);
    }
}
