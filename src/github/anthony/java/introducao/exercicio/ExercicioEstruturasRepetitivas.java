package github.anthony.java.introducao.exercicio;

public class ExercicioEstruturasRepetitivas {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000000; i += 2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
