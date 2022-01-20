package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate data = LocalDate.of(2022, Month.JANUARY, 19);
        LocalDate agora = LocalDate.now();
        System.out.println("Mês: "+data.getMonth().getValue()+" - "+data.getMonth());
        System.out.println("Dia da semana: "+data.getDayOfWeek());
        System.out.println("Dia do mês: "+data.getDayOfMonth());
        System.out.println("Qtde dias no mês: "+data.lengthOfMonth());
        System.out.println("Dia do ano: "+data.getDayOfYear());
        System.out.println("Ano: "+data.getYear());
        System.out.println("Ano Bisexto? "+data.isLeapYear());
        System.out.println("Dia do ano: "+data.get(ChronoField.DAY_OF_MONTH));
        System.out.println("Data como é salva no DB: "+data);
        System.out.println("Data agora: "+agora);
        System.out.println("Data mínima permitida: "+LocalDate.MIN);
        System.out.println("Data máxima permitida: "+LocalDate.MAX);
    }
}
