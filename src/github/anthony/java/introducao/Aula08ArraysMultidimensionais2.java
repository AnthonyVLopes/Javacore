package github.anthony.java.introducao;

public class Aula08ArraysMultidimensionais2 {
    public static void main(String[] args) {
        int[][] num = new int[3][];
        num[0] = new int[]{1, 2, 3};
        num[1] = new int[4];
        num[2] = new int[6];



        for (int[] numLocal : num) {
            System.out.println("\n---");
            for (int inteirolocal : numLocal) {
                System.out.print(inteirolocal);

            }
        }

    }
}
