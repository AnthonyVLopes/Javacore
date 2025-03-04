package github.anthony.java.javacore.Gassociacao.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("---Digite abaixo---");
        String next = entrada.nextLine();

        System.out.println("---digite sua idade---");
        int i = entrada.nextInt();

        System.out.println("---Ditige seu sexo---");
        char sexo = entrada.next().charAt(0);

        System.out.println("Nome: " + next + "\nIdade: " + i + "\nSexo: " + sexo);

    }
}
