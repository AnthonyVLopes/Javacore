package github.anthony.java.javacore.Eblocoinicializacao.Model;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};
    // 1 -> espaço em memoria alocado
    // 2-> cada atributo da classe é criado e inicializado com valores default ou que já foi setado de forma previa
    // 3-> Bloco de inicialização é execuatado
    // 4 -> Construtor é executado

    {
        System.out.println("Entameni");
    }
    public Anime(){
        episodios = new int[100];
        for (int i = 0; i <episodios.length ; i++) {
            episodios[i] = i+1;

        }
        //        System.out.println(episodios);
        for(int episodios: this.episodios){
            System.out.print (episodios + " ");
        }
    }


}
