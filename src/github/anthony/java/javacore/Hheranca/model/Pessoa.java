package github.anthony.java.javacore.Hheranca.model;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;


    public void imprime() {
        System.out.println("###################");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF:" + getCpf());
        System.out.println("CEP: " + getEndereco().getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
