package github.anthony.java.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String [] nome = new String[5];
        nome[1] = "Anthony";
        int [] nome2 = {1,2,3,4,5};
        int [] idade = new int[]{1,2,3,4,5};

//        for (int o = 0; o < idade.length; o++) {
//            System.out.println(idade[o]);
//
//
//        }
        for(int i:idade){
            System.out.println(idade[i]);

        }

//    int[] idade2 = {18,19,20,25,30};
//
//        for (int i = 0; i <= idade2.length; i++) {
//            System.out.println(idade2[i]);
//        }

    }

}
