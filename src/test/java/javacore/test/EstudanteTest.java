package javacore.test;

import javacore.introducaoclasses.Estudantes;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudantes joao = new Estudantes();
        joao.nome = "João";
        joao.matricula = "1212";
        joao.idade = 15;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);



    }
}
