package github.anthony.java.javacore.Hheranca.teste;

import github.anthony.java.javacore.Hheranca.model.Endereco;
import github.anthony.java.javacore.Hheranca.model.Funcionario;
import github.anthony.java.javacore.Hheranca.model.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua dos Alfeneiros","42358-52");
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setCpf("758145444-99");
        pessoa1.setNome("Toysohia");
        pessoa1.setEndereco(endereco);
        pessoa1.imprime();

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Ichigo Kurosaki");
        funcionario1.setCpf("555555");
        funcionario1.setEndereco(endereco);
        funcionario1.setSalario(7500);
        funcionario1.imprime();
        funcionario1.exibirSlario();



    }
}
