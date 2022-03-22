package javacore.polimorfismo;

public class Gerente extends Funcionario{
    private double pnl;

    public Gerente(String nome, double salario, double pnl) {
        super(nome, salario);
        this.pnl = pnl;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", pnl=" + pnl +
                '}';
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + pnl;
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }
}