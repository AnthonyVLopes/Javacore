package github.anthony.java.javacore.Dconstrutores.Teste;

import github.anthony.java.javacore.Dconstrutores.Model.Anime;

public class AnimeTeste {
    public static void main(String[] args) {

        Anime anime1 = new Anime("One piece", "Anime e manga",1000,"Aventura");
        Anime anime2 = new Anime();

        anime1.imprimir();
    }
}
