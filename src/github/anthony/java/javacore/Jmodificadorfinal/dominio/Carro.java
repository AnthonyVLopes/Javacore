package github.anthony.java.javacore.Jmodificadorfinal.dominio;

public class Carro extends Object {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
