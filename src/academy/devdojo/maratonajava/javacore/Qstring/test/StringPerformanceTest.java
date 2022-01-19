package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio0 = System.currentTimeMillis();
        concatString(100_000);
        long fim0 = System.currentTimeMillis();
        System.out.println("Tempo gasto para String: "+(fim0-inicio0)+"ms");

        long inicio1 = System.currentTimeMillis();
        concatStringBuilder(100_000);
        long fim1 = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder: "+(fim1-inicio1)+"ms");

        long inicio2 = System.currentTimeMillis();
        concatStringBuffer(100_000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer: "+(fim2-inicio2)+"ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto +=i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder stringBuilder = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            stringBuilder.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer stringBuffer = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            stringBuffer.append(i);
        }
    }
}
