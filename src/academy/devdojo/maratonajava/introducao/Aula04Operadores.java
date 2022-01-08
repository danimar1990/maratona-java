package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //Soma
        int numero1 = 12;
        int numero2 = 2;
        double resultadoSoma = numero1 + numero2;
        System.out.println("Soma");
        System.out.println(numero1+" + "+numero2+" = "+resultadoSoma+"\n");

        //Subtração
        int numero3 = 35;
        int numero4 = 9;
        double resultadoSubtracao = numero3 - numero4;
        System.out.println("Subtração");
        System.out.println(numero3+" - "+numero4+" = "+resultadoSubtracao+"\n");

        //Multiplicação
        int numero5 = 9;
        int numero6 = 8;
        double resultadoMultiplicacao = numero5 * numero6;
        System.out.println("Multiplicação");
        System.out.println(numero5+" * "+numero6+" = "+resultadoMultiplicacao+"\n");

        //Divisão
        double numero7 = 100.99;
        double numero8 = 3.2;
        double resultadoDivisao = numero7 / numero8;
        System.out.println("Divisão");
        System.out.println(numero7+" / "+numero8+" = "+resultadoDivisao+"\n");

        //Resto
        double numero9 = 10.99;
        double numero10 = 3.2;
        double resultadoResto = numero9 % numero10;
        System.out.println("Resto");
        System.out.println(numero9+" % "+numero10+" = "+resultadoResto+"\n");
        System.out.println("-------------------------------------");

        //Comparação
        // < > <= >= == !=
        int num1 = 10;
        int num2 = 20;
        boolean isNum1MaiorQueNum2 = num1 > num2;
        boolean isNum1MenorQueNum2 = num1 < num2;
        boolean isNum1MaiorOuIgualQueNum2 = num1 >= num2;
        boolean isNum1MenorOuIgualQueNum2 = num1 <= num2;
        boolean isNum1IgualQueNum2 = num1 == num2;
        boolean isNum1IgualNum1 = num1 == num1;
        boolean isNum1DiferenteNum1 = num1 != num1;
        System.out.println(num1+" é maior que "+num2+"? "+isNum1MaiorQueNum2);
        System.out.println(num1+" é menor que "+num2+"? "+isNum1MenorQueNum2);
        System.out.println(num1+" é maior ou igual a "+num2+"? "+isNum1MaiorOuIgualQueNum2);
        System.out.println(num1+" é menor ou igual a "+num2+"? "+isNum1MenorOuIgualQueNum2);
        System.out.println(num1+" é igual a "+num2+"? "+isNum1IgualQueNum2);
        System.out.println(num1+" é igual a "+num1+"? "+isNum1IgualNum1);
        System.out.println(num1+" é diferente de "+num1+"? "+isNum1DiferenteNum1);
        System.out.println("-------------------------------------");
        //Lógicos
        //&& (AND), || (OU)
        int idade = 35;
        float salario = 6500F;
        boolean isAautorizado = idade > 18 && salario > 4612;
        boolean isNaoAutorizado = idade < 18 && salario >= 3381;
        System.out.println("Autorizado? "+isAautorizado);
        System.out.println("Autorizado? "+isNaoAutorizado);
    }
}
