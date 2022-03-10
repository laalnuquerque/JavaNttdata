package javacore.test;

import javacore.introducaoclasses.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Luiz";
        professor.matricula = "1245";
        professor.rg = "48204981x";
        professor.cpf = "456854255";

        System.out.println(professor.nome);
    }
}
