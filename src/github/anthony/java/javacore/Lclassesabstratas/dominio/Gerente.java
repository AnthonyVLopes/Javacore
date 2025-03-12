package github.anthony.java.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calculadoraBonus() {
        this.salario =  salario + salario * 0.1;
    }
}
