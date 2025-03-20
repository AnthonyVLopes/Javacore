package github.anthony.java.javacore.Npolimorfismo.domain;

public class Computador extends Produto {

    private static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("imposto do computador: ");
        return this.valor * IMPOSTO_POR_CENTO;
    }

}
