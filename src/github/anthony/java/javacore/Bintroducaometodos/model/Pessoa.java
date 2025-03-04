package github.anthony.java.javacore.Bintroducaometodos.model;

public class Pessoa {

    // Estudos de modificador de acesso PRIVATE e metodos  GET e SET para proteção de metodos

    private String nome;
    private int idade;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
                System.out.println("idade invlida");
                return;
        }

        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }


}
