package github.anthony.java.introducao.exercicio;

import java.util.Scanner;

public class ExercicioEstruturasRepetitivasBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor Integral do veiculo: ");

        double valorCarro = sc.nextDouble();

        for (int valorParcela = 1; valorParcela <= 1000; valorParcela++) {
            double parcelaFinal = valorCarro / valorParcela;
            if (parcelaFinal < 1000) {
                break;
            }
            System.out.println("valor " + valorParcela + " R$ " + parcelaFinal);

        }


    }
}
