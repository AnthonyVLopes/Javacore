package github.anthony.java.javacore.Jmodificadorfical.dominio;

public class Comprador {

    private String nome;


    @Override
    public String toString(){
        return "Nome Comprador: " + this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

}
