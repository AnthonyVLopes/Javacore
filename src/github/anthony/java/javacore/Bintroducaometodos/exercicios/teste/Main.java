package github.anthony.java.javacore.Bintroducaometodos.exercicios.teste;

import github.anthony.java.javacore.Bintroducaometodos.exercicios.dominio.Funcionario;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario01 =  new Funcionario();

        funcionario01.setNome("Anthony");
        funcionario01.setIdade(21);
        funcionario01.setSalarios(new double[]{1500,1800,3500});

        funcionario01.imprimir();
        funcionario01.mediaSalario();

    }
}
