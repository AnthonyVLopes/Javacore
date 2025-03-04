package github.anthony.java.javacore.Fmoodificadorstatic.teste;

import github.anthony.java.javacore.Fmoodificadorstatic.model.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Fusca", 150);
        Carro carro2 = new Carro("BMW", 280);
        Carro carro3 = new Carro("Porsche", 300);
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
