package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat01 {
    public static void main(String[] args) {
        String pattern = "'Relatório impresso em Joaçaba, dia' dd 'de' MMMM 'de' yyyy 'as' HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Relatório impresso em Joaçaba, dia 19 de janeiro de 2022 as 22:33:19"));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
