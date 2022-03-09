package javacore.introducaometodos;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(5 + 5);
    };

    public void subtraiDoisNumeros(){
        System.out.println(10 - 6);
    }

    //metodo com parametro
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    //metodo com retorno
    public double divideDoisNumeros(double num1, double num2){
        //double resultado = num1 / num2;
        //return resultado;

        if (num2 != 0){
            return num1 / num2;
        }
        return 0;

    }

    //casting
    public double divideDoisNumerosCasting(double num3, double num4){
        return (int) (num3 / num4);
    }
}
