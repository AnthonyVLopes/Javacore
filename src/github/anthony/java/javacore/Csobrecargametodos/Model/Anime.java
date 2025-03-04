package github.anthony.java.javacore.Csobrecargametodos.Model;

import java.security.cert.CertificateFactorySpi;

public class Anime {

    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    //Construtor que necessita do parametro nome para startar
   public Anime(String nome){
        this.nome = nome;
       System.out.println("Dentro do construtor");
   }

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    // Sobrecarga de Metodos

    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome,tipo, episodios);
        this.genero = genero;
    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return this.tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
