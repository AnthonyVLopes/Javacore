package github.anthony.java.javacore.Kenum.teste;

import github.anthony.java.javacore.Kenum.dominio.Cliente;
import github.anthony.java.javacore.Kenum.dominio.TipoCliente;
import github.anthony.java.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTeste {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Morpheus", TipoCliente.PESSOA_FISICA,TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Travis Scott", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);



        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
