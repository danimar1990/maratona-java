package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate data = LocalDate.parse("2022-01-20");
        LocalTime hora = LocalTime.parse("00:03:39");
        System.out.println("Hora do sistema agora: "+localDateTime);
        System.out.println("Data: "+data);
        System.out.println("Hora: "+hora);
        LocalDateTime localDateTime1 = data.atTime(hora);
        LocalDateTime localDateTime2 = hora.atDate(data);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);

    }
}
