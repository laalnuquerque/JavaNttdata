package javacore.polimorfismo;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Oswaldo", 5000,2200);
        Vendedor v = new Vendedor("lucas", 2000, 20000);

        RelatorioPagamento relatorio = new RelatorioPagamento();
        //relatorio.relatorioPagamenteGerente(g);
        // relatorio.relatorioPagamenteVendedor(v);

        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("--------------------------------");
        relatorio.relatorioPagamentoGenerico(v);

        Funcionario f = g;
        System.out.println("--------------------------------");
        System.out.println(f.getSalario());
    }
}
