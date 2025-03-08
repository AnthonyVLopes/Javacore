package github.anthony.java.javacore.Lclassesabstratas.teste;

import github.anthony.java.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import github.anthony.java.javacore.Lclassesabstratas.dominio.Funcionario;
import github.anthony.java.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {

    public static void main(String[] args) {
        Gerente gerente =  new Gerente("Nami",5000.);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Usopp",1200);
        System.out.println(gerente);
        System.out.println(desenvolvedor);



    }
}
