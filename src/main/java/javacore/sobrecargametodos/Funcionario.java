package javacore.sobrecargametodos;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    //construtor - java cria sozinho
    public Funcionario(String nome, String cpf, double salario, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;

    }

    //sobrecarga
    public Funcionario(){

    }


    //sobrecarga
    public void init(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;

    }

    public void init(String nome, String cpf, double salario, String rg){
        //chama o metodo de cima primeiro e depois executa esse
        init(nome, cpf, salario);
        this.rg = rg;
    }

    //metodo
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public double getSalario(){
        return this.salario;
    }

    public String getRg(){
        return this.rg;
    }
}
