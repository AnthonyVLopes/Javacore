package github.anthony.java.javacore.Bintroducaometodos.model;

public class Calculadora {

    public void somarDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(100 - 10);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double dividirDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void divideDoisNumeros2(double num1, double num2) {

        if (num2 == 0) {
            System.out.println("Não existe divisão por 0");
            return;
        }

        System.out.println(num1 / num2);

    }

    public void alteraDoisnumeros(int num1, int num2) {
        num1 = 99;
        num2 = 55;

        System.out.println("Primeiro valor: " + num1);
        System.out.println("Segundo valor: " + num2);

    }

    public void somarArray(int[] num1){
        int soma = 0;
       for(int num: num1){
           soma += num;
       }
        System.out.println(soma);
    }

    public void somaVarArgs(int...numeros){
        int soma = 0;
        for(int num:numeros){
            soma += num;
        }
        System.out.println(soma);
    }

}
