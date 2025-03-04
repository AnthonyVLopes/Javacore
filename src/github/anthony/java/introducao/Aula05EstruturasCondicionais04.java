package github.anthony.java.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        byte dia = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor de 1 a 7. Respectivo a um dia na semana: ");
        dia = sc.nextByte();
        // char, int, byte, short, enum. string
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }
        char sexo  = 'F';
        switch (sexo){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("sexo invalido!");
        }

    }
}
