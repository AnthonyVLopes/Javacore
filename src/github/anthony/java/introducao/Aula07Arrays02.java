package github.anthony.java.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        //INICIALIZAÇÃO DE CADA TIPO DE ARRAY

        //Byte, Short, int, long, float e double = 0
        //Char = '\u0000' o que equivale a um espaço em branco
        // Boolean = false
        //String = mull


        String[] nome = new String[4];
        nome[0] = "Anthony";
        nome[1] = "Valdemar";
        nome[2] = "lopes";
        nome[3] = "Silva";

        for (int i = 0; i < nome.length; i++) {
            System.out.println(nome[0]);
            //break;

        }

    }
}
