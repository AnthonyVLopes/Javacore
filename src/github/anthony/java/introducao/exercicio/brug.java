package github.anthony.java.introducao.exercicio;

import java.util.Scanner;

public class brug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lore acurada da proxima semana : ");

        boolean rrQuererAlgo = sc.nextBoolean();

        if (rrQuererAlgo) {
            System.out.println("Não confuda as coisas, talvez vc estaja confusa");
        } else {
            System.out.println("Me desculpe por confundir as coisas, acabei levando as coisa para outro lado");
        }
    }
}

