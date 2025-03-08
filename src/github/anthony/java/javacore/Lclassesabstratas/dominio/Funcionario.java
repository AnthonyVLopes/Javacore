package github.anthony.java.javacore.Lclassesabstratas.dominio;

public  abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

       calculadoraBonus();
    }

public void calculadoraBonus(){
        this.salario = salario + salario * 0.1;
    }

}
