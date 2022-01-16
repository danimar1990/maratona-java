package academy.devdojo.maratonajava.javacore.Oexcecao.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
        System.out.println("----------------");
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
            //throw new RuntimeException();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando o arquivo");
        }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        } finally {
            System.out.println("Fechando o arquivo");
        }
    }
}
