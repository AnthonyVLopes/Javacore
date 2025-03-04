package github.anthony.java.javacore.Gassociacao.model;

public class Time {

    private String nome;
    private Jogador[] jogadors;

    public void imprime() {
        System.out.println(this.nome);
         if(jogadors == null) return;

         for(Jogador jogador : jogadors){
             System.out.println(getJogadors());
         }



    }

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadors) {
        this.nome = nome;
        this.jogadors = jogadors;
    }

    public Jogador[] getJogadors() {
        return jogadors;
    }

    public void setJogadors(Jogador[] jogadors) {
        this.jogadors = jogadors;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
