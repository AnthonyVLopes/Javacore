package github.anthony.java.introducao.exercicio;

import java.util.Scanner;

public class ExercicioEstruturasRepetitivasContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorCarro = 30000;

        for (int valorParcela = 1; valorParcela <= 1000; valorParcela++) {
            double parcelaFinal = valorCarro / valorParcela;

            if (parcelaFinal < 1000) {
                break;

            }
        }

    }
}


