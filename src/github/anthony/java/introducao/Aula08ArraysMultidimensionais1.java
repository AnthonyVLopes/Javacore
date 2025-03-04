package github.anthony.java.introducao;

import java.util.Arrays;

public class Aula08ArraysMultidimensionais1 {
    public static void main(String[] args) {
        int[][] dia = new int[3][3];
        dia[0][0] = 31;
        dia[0][1] = 28;
        dia[0][2] = 31;

        dia[1][0] = 31;
        dia[1][1] = 28;
        dia[1][2] = 31;

//        for (int i = 0; i < dia.length; i++) {
//            for (int j = 0; j < dia[i].length; j++) {
//                System.out.println(dia[i][j]);
//
//            }
//        }

        //Com uso do ForEach

        for (int[] arrNovo : dia) {
            for (int arrNovoDenovo : arrNovo) {
                System.out.println(arrNovoDenovo);
            }

        }

    }
}
