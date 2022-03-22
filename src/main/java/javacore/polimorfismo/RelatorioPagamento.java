package javacore.polimorfismo;

public class RelatorioPagamento {
    public void relatorioPagamenteGerente(Gerente gerente){
        System.out.println("Gerando relatoria de pagamento para gerencia");
        gerente.calcularPagamento();

        System.out.println("Nome " + gerente.getNome());
        System.out.println("Salario desse mês " + gerente.getSalario());
    }

    public void relatorioPagamenteVendedor(Vendedor vendedor){
        System.out.println("Gerando relatoria de pagamento para vendedor");
        vendedor.calcularPagamento();

        System.out.println("Nome " + vendedor.getNome());
        System.out.println("Salario desse mês " + vendedor.getSalario());
    }

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando relatoria de pagamento");
        funcionario.calcularPagamento();

        System.out.println("Nome " + funcionario.getNome());
        System.out.println("Salario desse mês " + funcionario.getSalario());
    }
}
