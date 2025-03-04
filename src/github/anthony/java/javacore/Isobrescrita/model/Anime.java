package github.anthony.java.javacore.Isobrescrita.model;

public class Anime extends Object {

    private String nome;


    public Anime(String nome){
        this.nome = nome;
    }
    // sobreescrita/override do metodo toString para fazer retornar a valor em memoria passado pelo parametro
    //toda classe criada já extende automaticamente do pacote object é como se fosse uma classe "avo"

    @Override
    public String toString(){
    return "Anime: " + this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
