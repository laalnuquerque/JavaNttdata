package javacore.metodotest;

import javacore.introducaometodos.Calculadora;

public class ClaculadoraTest {
    public static void main(String[] args) {
        //Calculadora calculadora = new Calculadora();

        //chamado o metodo criado
        Calculadora.somaDoisNumeros();

        System.out.println();

        Calculadora.subtraiDoisNumeros();

        System.out.println();

        //CASTING converter
        //calculadora.multiplicaDoisNumeros(5, (byte)10);

        Calculadora.multiplicaDoisNumeros(5, 10);

        double result = Calculadora.divideDoisNumeros(5, 0);
        System.out.println(result);

        double result2 = Calculadora.divideDoisNumerosCasting(5, 6);
        System.out.println(result2);

        Calculadora.imprimeDoisNumerosDivididos(5, 0);

        int[] numeros = {1, 2, 3, 4, 5};
        Calculadora.somaArray(numeros);

        Calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }
}
