package github.anthony.java.javacore.Bintroducaometodos.Teste;

import github.anthony.java.javacore.Bintroducaometodos.model.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {

        Calculadora calcteste = new Calculadora();

//        int[] numeros = {10, 20};
//
//        calcteste.somarArray(numeros);

        calcteste.somaVarArgs(1,2,2,3,5);
    }
}
