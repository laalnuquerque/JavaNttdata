package javacore.heranca;

public class Pessoa {
    //usado para acessar atributos dentro do mesmo pacote ou por classes filhas
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome){
        this.nome = nome;

    }

    public Pessoa(String nome, String cpf){
        //usa paramentro do metodo anterior
        this(nome);
        this.cpf = cpf;

    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereco: " + this.endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
