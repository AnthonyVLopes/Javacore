package github.anthony.java.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

        calculadoraBonus();
    }
    @Override
    public void imprime(){
    } // Uma classe não  extender de outras duas superclasses, mas a hieraquia pode ser maior.

    public abstract void calculadoraBonus();


}
