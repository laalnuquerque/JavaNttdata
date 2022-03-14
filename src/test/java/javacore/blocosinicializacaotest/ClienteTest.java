package javacore.blocosinicializacaotest;

import javacore.blocosinicializacao.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();

        System.out.println("Exibindo quantidade de parcelas possives");

        for (int parcela : c.getParcelas()){
            System.out.println("Parcela " + parcela);
        }

    }
}
