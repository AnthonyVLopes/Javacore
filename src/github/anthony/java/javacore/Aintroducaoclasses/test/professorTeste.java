package github.anthony.java.javacore.Aintroducaoclasses.test;

import github.anthony.java.javacore.Aintroducaoclasses.dominio.Professor;

import java.awt.color.ProfileDataException;

public class professorTeste {
    public static void main(String[] args) {

        Professor professor1 = new Professor();
        professor1.nome = "Lucas pereira";
        professor1.idade = 35;
        professor1.sexo = 'M';
        professor1.matricula = "5455456";

        System.out.println("Idade: " + professor1.idade + " Sexo: " + professor1.sexo );



    }
}
