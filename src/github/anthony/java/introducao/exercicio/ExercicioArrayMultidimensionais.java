package github.anthony.java.introducao.exercicio;

public class ExercicioArrayMultidimensionais {
    public static void main(String[] args) {
        int[][] idade = new int[3][3];
        idade[0][0] = 31;
        idade[0][1] = 35;
        idade[0][2] = 19;

        idade[1][0] = 21;
        idade[1][1] = 30;
        idade[1][2] = 19;

        idade[2][0] = 45;
        idade[2][1] = 10;
        idade[2][2] = 33;

        for (int i = 0; i < idade.length; i++) {
            for (int j = 0; j <idade[i].length ; j++) {
                System.out.println("idade: " + idade[i][j]);
            }
        }

    }
}
