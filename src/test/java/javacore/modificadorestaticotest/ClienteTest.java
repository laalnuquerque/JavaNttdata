package javacore.modificadorestaticotest;


import javacore.blocosinicializacao.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c  = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();

        System.out.println("Exibindo quantidade de parcelas possives");

        for (int parcela : c.getParcelas()){
            System.out.println("Parcela " + parcela);
        }

        System.out.println("tamanho: " + Cliente.getParcelas().length);
        System.out.println("tamanho: " + Cliente.getParcelas().length);
        System.out.println("tamanho: " + Cliente.getParcelas().length);

    }
}
