package github.anthony.java.javacore.Bintroducaometodos.Teste;

import github.anthony.java.javacore.Bintroducaometodos.model.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa pessoa01 = new Pessoa();

        pessoa01.setNome("Frank Ocean");
        pessoa01.setIdade(32);

        System.out.println(pessoa01.getNome());
        System.out.println(pessoa01.getIdade());

    }
}
