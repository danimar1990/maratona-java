package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Todos os espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, dígitos e _
        // \W = Tudo o que não for incluso no \w
        // [] = Range
        // ? zero ou uma ocorrência
        // * zero ou mais
        // + uma ou mais
        // {n, m} de n até m
        // () agrupamento
        // | ex: o(v|c)o = ovo ou oco
        // $ fim da linha
        // . ex: 1.3 = 123 ou 133 ou 1A3
        String regex = "([a-zA-Z0-9\\._-])+@([a-z])+(\\.([a-z])+)+";
        String texto = "danimar@invelox.com.br, i#c$&a@haha.9, contato123@hotmail.com, #@¨$jiraya.com, br4ia@mail.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto....: "+texto);
        System.out.println("Índice...: 0123456789");
        System.out.println("Regex....: "+regex);
        System.out.println("Posições encontradas:");
        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
        System.out.println("'i#c$&a@haha.c9m' é um e-mail válido?: "+"i#c$&a@haha.c9m".matches(regex));
        //Array de String
        System.out.println("Quebra de String por vírgula: "+Arrays.toString(texto.split(",")));
        //Primeiro item removendo espaço em branco
        System.out.println("Item da primeira posição: "+(texto.split(",")[1].trim()));
    }
}
