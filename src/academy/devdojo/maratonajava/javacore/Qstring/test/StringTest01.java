package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Danimar"; //String constant pool
        String nome2 = "Danimar";
        nome = nome.concat(" Varisa");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Danimar");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
