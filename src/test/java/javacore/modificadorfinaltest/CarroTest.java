package javacore.modificadorfinaltest;

import javacore.modificadorfinal.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();

        System.out.println(c.getComprador());

        c.getComprador().setNome("Mirim");

        System.out.println(c.getComprador());


    }
}
