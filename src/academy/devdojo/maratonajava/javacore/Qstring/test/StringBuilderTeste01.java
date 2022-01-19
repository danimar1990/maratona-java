package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Danimar";
        nome.concat(" Invelox");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Danimar");
        System.out.println(sb.toString());
        sb.append(" &").append(" Jaqueline");
        System.out.println(sb);
        sb.substring(0,2);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
    }
}
