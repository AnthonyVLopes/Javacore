package github.anthony.java.javacore.Kenum.teste;

import github.anthony.java.javacore.Kenum.dominio.Cliente;
import github.anthony.java.javacore.Kenum.dominio.TipoCliente;

public class ClienteTeste {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Morpheus", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Travis Scott", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Young Thug", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Don Toliver", TipoCliente.PESSOA_JURIDICA);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}
