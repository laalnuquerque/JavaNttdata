package javacore.enumtest;

import javacore.enumeracao.Cliente;
import javacore.enumeracao.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lucas", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);

        System.out.println(cliente);


    }
}
