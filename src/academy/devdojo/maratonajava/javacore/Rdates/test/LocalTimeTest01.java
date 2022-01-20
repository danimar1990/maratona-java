package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime timeNow = LocalTime.now();
        System.out.println("Hora definida manualmente: "+time);
        System.out.println("Hora agora: "+timeNow);
        System.out.println("Apenas hora: "+time.getHour());
        System.out.println("Apenas os minutos: "+time.getMinute());
        System.out.println("Apenas os segundos: "+time.getSecond());
        System.out.println("Hora: "+time.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println("Hora mínima: "+LocalTime.MIN);
        System.out.println("Hora máxima: "+LocalTime.MAX);
        System.out.println("Meia noite: "+LocalTime.MIDNIGHT);
    }
}
