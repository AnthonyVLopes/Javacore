package github.anthony.java.javacore.Npolimorfismo.teste;

import github.anthony.java.javacore.Npolimorfismo.domain.Computador;
import github.anthony.java.javacore.Npolimorfismo.domain.Tomate;
import github.anthony.java.javacore.Npolimorfismo.service.CalculadoraImpostos;

public class ProdutoTeste {
    public static void main(String[] args) {

        Computador computador = new Computador("Lenovo 15.6 i5 13Gen",7500);
        Tomate tomate = new Tomate("Tomate Italiano",10);
        CalculadoraImpostos.calcularimposto(computador);
        System.out.println("---------------");
        CalculadoraImpostos.calcularimposto(tomate);

    }
}
