package github.anthony.java.javacore.Aintroducaoclasses.Exercicios.Teste;

import github.anthony.java.javacore.Aintroducaoclasses.Exercicios.Dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro toyota = new Carro();
        toyota.nome = "Toyota";
        toyota.modelo = "Supra MK4";
        toyota.ano = 1998;

        Carro honda = new Carro();
        honda.nome = "Honda";
        honda.modelo = "Civic coupe";
        honda.ano = 1995;

  //      toyota = honda;

        System.out.println("Nome: " +honda.nome + " Modelo: " + honda.modelo + " Ano: " + honda.ano );
        System.out.println("Nome: " +toyota.nome + " Modelo: " + toyota.modelo + " Ano: " + toyota.ano );
    }
}
