package github.anthony.java.javacore.Gassociacao.test;

import github.anthony.java.javacore.Gassociacao.model.Jogador;
import github.anthony.java.javacore.Gassociacao.model.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        //Associação uniderional
        Jogador jogador1 = new Jogador("Neymar");
        Time time  = new Time("Santos");
        jogador1.setTime(time);
        jogador1.imprime();


    }

}
