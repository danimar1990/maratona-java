package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.model.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball Z", "Anime", "Ação/Luta", 278, "Pixar");
        Anime anime2 = new Anime("Jackie Chan", "Anime", "Ação/Luta", 112);
        anime.imprime();
        System.out.println("---------------");
        anime2.imprime();
    }
}
