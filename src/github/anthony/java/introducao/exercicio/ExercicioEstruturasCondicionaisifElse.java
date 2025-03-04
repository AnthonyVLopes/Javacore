package github.anthony.java.introducao.exercicio;


import java.util.Scanner;

public class ExercicioEstruturasCondicionaisifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE SEU salario anual abaixo: ");
        double salarioAnual = sc.nextDouble();
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.80 / 100;
        double terceiraFaixa = 49.50 / 100;
        double salarioCorrigido;

        if (salarioAnual <= 34712) {
            salarioCorrigido = salarioAnual * primeiraFaixa;
            System.out.println("O total de imposto pago será :");
            System.out.println(salarioCorrigido);
        } else if (salarioAnual > 34712 || salarioAnual <= 68507) {
            salarioCorrigido = salarioAnual * segundaFaixa;
            System.out.println("O total de imposto pago será :");
            System.out.println(salarioCorrigido);
        } else {
            salarioCorrigido = salarioAnual + terceiraFaixa;
            System.out.println("O total de imposto pago será :");
            System.out.println(salarioCorrigido);
        }

    }


}
