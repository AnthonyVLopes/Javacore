package github.anthony.java.javacore.Gassociacao.exercicio;

public class Main {
    public static void main(String[] args) {

        Local local1 = new Local("Rua dos alfeneiros");

        Aluno aluno1 = new Aluno("Mokey D luffy", 19);
        Aluno aluno2 = new Aluno("Portgas D Ace", 23);
        Aluno[] alunosParaSeminario = {aluno1, aluno2};
        Seminario seminario1 = new Seminario("Como se Tornar marinheiro", alunosParaSeminario, local1);
        Seminario seminario2 = new Seminario("Culinaria do Baratie", alunosParaSeminario, local1);
        Seminario[] seminariosdisponiveis = {seminario1};

        Professor professor1 = new Professor("Monkey D Garp","Marinheiro",seminariosdisponiveis,alunosParaSeminario);


        professor1.imprime();


    }
}
