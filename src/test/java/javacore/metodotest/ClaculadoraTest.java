package javacore.metodotest;

import javacore.introducaometodos.Calculadora;

public class ClaculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        //chamado o metodo criado
        calculadora.somaDoisNumeros();

        System.out.println();

        calculadora.subtraiDoisNumeros();

        System.out.println();

        //CASTING converter
        //calculadora.multiplicaDoisNumeros(5, (byte)10);

        calculadora.multiplicaDoisNumeros(5, 10);

        double result = calculadora.divideDoisNumeros(5, 0);
        System.out.println(result);

        double result2 = calculadora.divideDoisNumerosCasting(5, 6);
        System.out.println(result2);

        calculadora.imprimeDoisNumerosDivididos(5, 0);

        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }
}
