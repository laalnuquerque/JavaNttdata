package javacore.metodotest;

import javacore.sobrecargaconstrutores.Estudante;

public class Estudando2Test {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("121212", "Lucas", new double[]{5, 7, 9});

        estudante.imprime();
    }
}
