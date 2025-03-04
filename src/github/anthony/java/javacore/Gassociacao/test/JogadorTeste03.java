package github.anthony.java.javacore.Gassociacao.test;

import github.anthony.java.javacore.Gassociacao.model.Jogador;
import github.anthony.java.javacore.Gassociacao.model.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Neymar");
        Time time1  = new Time("SANTOS");
        Jogador[] jogadors= {jogador1};
        jogador1.setTime(time1);

        time1.setJogadors(jogadors);

        System.out.println("----Jogador----");
        jogador1.imprime();

        System.out.println("----Time----");
        time1.imprime();
    }
}
