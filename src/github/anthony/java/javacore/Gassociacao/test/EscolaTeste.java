package github.anthony.java.javacore.Gassociacao.test;

import github.anthony.java.javacore.Gassociacao.model.Escola;
import github.anthony.java.javacore.Gassociacao.model.Professor;

public class EscolaTeste {

    public static void main(String[] args) {

        //RELACINAMENTO MUITOS PRA UM
        Professor professor1 = new Professor("Fiodor Dostoevisk");
        Professor professor2 = new Professor("Tostoy");

        Professor[] professors = {professor1,professor2};
        Escola escola = new Escola("Military Engineering",professors);
        escola.imprime();


    }

}
