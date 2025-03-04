package github.anthony.java.javacore.Bintroducaometodos.model;

public class Estudante {
    public String nome ;
    public char sexo;
    public int idade ;

    public void imprimir (){
        System.out.println("__________________");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);

    }
}
