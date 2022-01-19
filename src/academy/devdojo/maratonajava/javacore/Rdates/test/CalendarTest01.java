package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        Date date = c.getTime();
        System.out.println(date);

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }

        System.out.println("Dia da semana: "+c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia da semana no mês: "+c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Dia do mês "+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia do ano: "+c.get(Calendar.DAY_OF_YEAR));

        c.add(Calendar.DAY_OF_MONTH, 8);
        c.roll(Calendar.HOUR, 6);
        Date date1 = c.getTime();
        System.out.println(date1);
    }
}
