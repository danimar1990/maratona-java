package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // it-IT
        Locale localeItaly = new Locale("it", "IT");
        // pt-BR
        Locale localeBrazil = new Locale("pt", "BR");
        // hi-IN
        Locale localeIndia = new Locale("hi", "IN");
        // jp-JP
        Locale localeJapao = new Locale("ja", "JP");
        // nl-NL
        Locale localeHolanda = new Locale("nl", "NL");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        System.out.println(localeItaly.getDisplayCountry());
        System.out.println("Data na Itália agora: "+df1.format(calendar.getTime()));
        System.out.println(localeBrazil.getDisplayCountry());
        System.out.println("Data no Brasil agora: "+df2.format(calendar.getTime()));
        System.out.println(localeIndia.getDisplayCountry());
        System.out.println("Data na Índia agora: "+df3.format(calendar.getTime()));
        System.out.println(localeJapao.getDisplayCountry());
        System.out.println("Data no Japão agora: "+df4.format(calendar.getTime()));
        System.out.println(localeHolanda.getDisplayCountry());
        System.out.println("Data na Holanda agora: "+df5.format(calendar.getTime()));

        //Exibir o nome do país na língua passada no parâmetro
        System.out.println(localeHolanda.getDisplayCountry(localeHolanda));

        //Como se fala Itália em Japonês?
        System.out.println(localeItaly.getDisplayCountry(localeJapao));
    }
}
