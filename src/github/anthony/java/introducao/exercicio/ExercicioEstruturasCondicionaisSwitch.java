package github.anthony.java.introducao.exercicio;

import java.util.Scanner;

public class ExercicioEstruturasCondicionaisSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor de 1 a 7: ");

        byte dia = sc.nextByte();
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção invalida!");
                break;


        }

    }
}
