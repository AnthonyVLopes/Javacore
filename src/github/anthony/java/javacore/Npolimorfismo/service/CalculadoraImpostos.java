package github.anthony.java.javacore.Npolimorfismo.service;
import github.anthony.java.javacore.Npolimorfismo.domain.Produto;
import github.anthony.java.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImpostos {

    public static void calcularimposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);

        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }


    }

}
