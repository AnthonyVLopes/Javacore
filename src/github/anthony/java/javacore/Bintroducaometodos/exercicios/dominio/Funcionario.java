package github.anthony.java.javacore.Bintroducaometodos.exercicios.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;

    public double[] getSalarios(double[] doubles) {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
       for(double salario: this.salarios){
            System.out.print("Salario: " + salario + " ");

       }
       System.out.println( "\n------------------------");

    }

    public void mediaSalario() {

        if(salarios == null){
            return;
        }
        double loop = 0;
        for (double media : this.salarios) {
            loop += media;
        }
        System.out.println("Media dos Salarios: " + loop / salarios.length);
    }

}
