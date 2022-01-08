package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.model.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball ZzZ");
        //anime.init("Dragon Ball", "Ação", 240);
        anime.init("Dragon Ball Z", "Anime", "Ação", 278);
        anime.imprime();
    }
}
