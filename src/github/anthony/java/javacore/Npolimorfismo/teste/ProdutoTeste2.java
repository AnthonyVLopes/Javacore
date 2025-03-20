package github.anthony.java.javacore.Npolimorfismo.teste;

import github.anthony.java.javacore.Npolimorfismo.domain.Computador;
import github.anthony.java.javacore.Npolimorfismo.domain.Produto;
import github.anthony.java.javacore.Npolimorfismo.domain.Tomate;
import github.anthony.java.javacore.Npolimorfismo.service.CalculadoraImpostos;

public class ProdutoTeste2 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Thinkpad",2000);
        Produto produto2 = new Tomate("Italiano",0.5);
        CalculadoraImpostos.calcularimposto(produto1);
    }
}
