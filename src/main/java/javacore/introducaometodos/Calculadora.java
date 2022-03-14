package javacore.introducaometodos;

public class Calculadora {
    public static void somaDoisNumeros(){
        System.out.println(5 + 5);
    };

    public static void subtraiDoisNumeros(){
        System.out.println(10 - 6);
    }

    //metodo com parametro
    public static void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    //metodo com retorno
    public static double divideDoisNumeros(double num1, double num2){
        //double resultado = num1 / num2;
        //return resultado;

        if (num2 != 0){
            return num1 / num2;
        }
        return 0;

    }

    public static void imprimeDoisNumerosDivididos(double num5, double num6){
        if (num6 != 0){
            System.out.println( num5 / num6);
            return;
        }
        System.out.println("Não divide por zero");

    }

    //casting
    public static double divideDoisNumerosCasting(double num3, double num4){
        return (int) (num3 / num4);
    }

    public static void alteraDoisNumeros(int num7, int num8){
        num7 = 8;
        num8 = 9;

        System.out.println("Num7 " + num7);
        System.out.println("Num8 " + num8);
    }

    public static void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public static void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
