package github.anthony.java.javacore.Gassociacao.exercicio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;
    private Aluno[] alunos;
    //Ess está fora do requisitos


    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios, Aluno[] alunos) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("----Sistema de Gerenciamento----\n");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade + "\n");

        if (this.seminarios == null) return;
        System.out.println("#### Seminarios ####");
        for (Seminario seminario : this.seminarios) {
            System.out.println("--------------");
            System.out.println("Tema: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEnderco());
//            if (seminario.getLocal() == null) return;
        }
        System.out.println("***Alunos***");
            for (Aluno alunos: this.alunos){
                System.out.println("Alunos:" + alunos.getNome() + " Idade: "+ alunos.getIdade());
            }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
