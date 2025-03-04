package github.anthony.java.javacore.Aintroducaoclasses.test;


import github.anthony.java.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.nome = "Rxpapi";
        estudante1.idade = 27;
        estudante1.sexo = 'M';
        estudante1.matricula = "123456";

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Rxnephew";
        estudante2.idade = 28;
        estudante2.sexo = 'M';
        estudante2.matricula = "123465";


        Estudante nedved = new Estudante();
        nedved.nome = "Frank Ocean";

        System.out.println(estudante1.nome);
        System.out.println(nedved.sexo);
    }
}
