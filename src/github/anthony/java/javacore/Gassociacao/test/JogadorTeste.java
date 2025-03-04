package github.anthony.java.javacore.Gassociacao.test;

import github.anthony.java.javacore.Gassociacao.model.Jogador;

public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Lionel messi");
        Jogador jogador2 = new Jogador("Cristiano Ronaldo");
        Jogador jogador3 = new Jogador("Flavio Caça Rato");

        Jogador[] jogadores = {jogador1,jogador2,jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }

}
