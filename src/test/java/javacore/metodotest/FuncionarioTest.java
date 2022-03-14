package javacore.metodotest;

import javacore.sobrecargametodos.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Luiza", "478.548.533-59", 4500, "4845698-9");
        Funcionario funcionario1 = new Funcionario();

        funcionario.init("Lucas", "478.548.533-59", 4500, "4845698-9");

        funcionario.setNome("Lucas");
        funcionario.setCpf("478.548.533-59");
        funcionario.setSalario(4500);

        System.out.println();
    }
}
