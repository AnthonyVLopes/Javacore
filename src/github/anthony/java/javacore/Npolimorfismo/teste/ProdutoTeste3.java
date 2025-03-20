package github.anthony.java.javacore.Npolimorfismo.teste;

import github.anthony.java.javacore.Npolimorfismo.domain.Computador;
import github.anthony.java.javacore.Npolimorfismo.domain.Produto;
import github.anthony.java.javacore.Npolimorfismo.domain.Tomate;
import github.anthony.java.javacore.Npolimorfismo.service.CalculadoraImpostos;


public class ProdutoTeste3 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Thinkpad", 2000);
        Tomate tomate = new Tomate("Italiano", 0.5);
        tomate.setDataValidade("11/11/25");
        CalculadoraImpostos.calcularimposto(tomate);
        System.out.println("---------------------");
        CalculadoraImpostos.calcularimposto(produto1);


    }
}
