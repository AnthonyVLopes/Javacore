package github.anthony.java.javacore.Jmodificadorfical.teste;

import github.anthony.java.javacore.Jmodificadorfical.dominio.Carro;
import github.anthony.java.javacore.Jmodificadorfical.dominio.Comprador;

public class CarroTeste {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Honda Civic");


        System.out.println(carro1);
        System.out.println(Carro.VELOCIDADE_LIMITE);


        carro1.COMPRADOR.setNome("Yamcha");
        System.out.println(carro1.COMPRADOR);


    }

}
