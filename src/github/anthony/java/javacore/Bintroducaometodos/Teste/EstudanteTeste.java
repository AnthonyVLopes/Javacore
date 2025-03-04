package github.anthony.java.javacore.Bintroducaometodos.Teste;

import github.anthony.java.javacore.Bintroducaometodos.model.Estudante;

public class EstudanteTeste {

    public static void main(String[] args) {

        Estudante estudanteNovo = new Estudante();

        estudanteNovo.nome = "Frank Ocean";
        estudanteNovo.idade = 37;
        estudanteNovo.sexo = 'M';

        Estudante estudanteDois = new Estudante();
        estudanteDois.nome = "Tyler, The creator";
        estudanteDois.idade = 32;
        estudanteDois.sexo = 'M';

        estudanteNovo.imprimir();
        estudanteDois.imprimir();





    }

}
