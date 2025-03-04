package github.anthony.java.javacore.Csobrecargametodos.Teste;

import github.anthony.java.javacore.Csobrecargametodos.Model.Anime;

public class AnimeTeste {
    public static void main(String[] args) {

        Anime anime1 = new Anime("Hunter X Hunter");

        anime1.init("Hunter X Hunter", "Anime TV", 136,"Shonen");

        anime1.imprimir();

    }
}
