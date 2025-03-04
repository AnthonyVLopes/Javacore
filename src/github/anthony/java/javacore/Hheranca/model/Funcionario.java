package github.anthony.java.javacore.Hheranca.model;

public class Funcionario extends Pessoa {

private double salario;

public void imprime(){
    super.imprime(); // Basicamente é um sobrecarga de um metodo em outra classe
    System.out.println(this.salario);
}

public void exibirSlario(){
    System.out.println("Eu," + this.nome + " Concordo que esse valor: " + this.salario +"  está condizente com meu salario.");
    //Aqui em cima estou utilizando o modificador de acesso "protected" para acessar o valor em outra classe, porem no mesmo pacote
    //Então esse modificador so deixa visiel para todos no mesmo pacote

}

public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
