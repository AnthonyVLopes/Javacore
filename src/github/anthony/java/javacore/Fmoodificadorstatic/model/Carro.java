package github.anthony.java.javacore.Fmoodificadorstatic.model;

public class Carro {

 private String nome;
 private double velocidadeMaxima ;
 private static double velocidadeLimite= 250;

    public Carro(String nome,double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro(String nome,double velocidadeMaxima, double velocidadeLimite){
        this(nome, velocidadeMaxima); //-> uso bem importante da sobrecarga de construtor
        this.velocidadeLimite = velocidadeLimite;

    }

    public void imprime(){
        System.out.println("---------------------------");
        System.out.println("nome: " + this.nome );
        System.out.println("VeloxMAX: " + this.velocidadeMaxima);
        System.out.println("VeloxLIMITE: " + this.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
