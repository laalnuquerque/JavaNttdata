package javacore.metodotest;

import javacore.introducaometodos.Calculadora;

public class ParametroTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num7 = 4;
        int num8 = 6;
        calculadora.alteraDoisNumeros(num7, num8);
        System.out.println("Num7 " + num7);
        System.out.println("Num8 " + num8);
    }
}
