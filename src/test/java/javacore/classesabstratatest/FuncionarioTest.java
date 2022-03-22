package javacore.classesabstratatest;

import javacore.classeabstrata.Gerente;
import javacore.classeabstrata.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
       Gerente gerente = new Gerente("Ana", "SIM", 2542);
       Vendedor vendendor = new Vendedor("Carla", "SIM", 2542, 100);

       //func.calculaSalario();//gerente.calculaSalario();

        gerente.calculaSalario();
        vendendor.calculaSalario();

        System.out.println(gerente);
        System.out.println(vendendor);
    }
}
