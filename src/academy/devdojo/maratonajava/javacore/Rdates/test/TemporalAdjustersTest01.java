package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        //now = now.withDayOfMonth(20);
        now = now.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("-----------------");

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println("Próxima quinta ou quinta atual: "+now);
        System.out.println(now.getDayOfWeek());

        System.out.println("-----------------");

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println("Próxima quinta: "+now);
        System.out.println(now.getDayOfWeek());

        System.out.println("-----------------");

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println("Quinta-feira anterior: "+now);
        System.out.println(now.getDayOfWeek());

        System.out.println("-----------------");

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("Primeiro dia do mês: "+now);
        System.out.println(now.getDayOfWeek());

        System.out.println("-----------------");

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Último dia do mês: "+now);
        System.out.println(now.getDayOfWeek());

        System.out.println("-----------------");

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("Primeiro dia do próximo ano: "+now);
        System.out.println(now.getDayOfWeek());

        System.out.println("-----------------");

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("Primeiro dia do próximo mês: "+now);
        System.out.println(now.getDayOfWeek());
    }
}
