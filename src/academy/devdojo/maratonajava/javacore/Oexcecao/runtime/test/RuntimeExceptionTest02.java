package academy.devdojo.maratonajava.javacore.Oexcecao.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(2,0));
    }

    private static int divisao(int a, int b) {
        //forma 1
        if(b == 0) {
            throw new IllegalArgumentException("Não é possível dividir um número por zero");
        }
        return a/b;
        //forma 2
/*        try {
            return a/b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return 0;*/
    }
}
