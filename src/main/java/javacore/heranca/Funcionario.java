package javacore.heranca;

public class Funcionario extends Pessoa{

    private double salario;

    public Funcionario(String nome){
        super(nome);

    }


    //sobreescrever metodo sobrecarga, imprimir da classes extendida
    public void imprime(){
        super.imprime();
        System.out.println("salario: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu " + super.nome + " recebi o valor de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
