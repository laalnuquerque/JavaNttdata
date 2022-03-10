package javacore.metodotest;

import javacore.introducaometodos.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.cpf = "278.671.588.90";
        professor.matricula = "12457";
        professor.nome = "Luiz";
        professor.rg = "1452645-9";

        Professor professor2 = new Professor();
        professor2.cpf = "742.742.742.90";
        professor2.matricula = "5771774";
        professor2.nome = "Luiza";
        professor2.rg = "4523257-9";


        professor.imprime();
        professor2.imprime();
    }
}
