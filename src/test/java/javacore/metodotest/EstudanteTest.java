package javacore.metodotest;

import javacore.introducaometodos.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();

        aluno.setNome("Lucas");
        aluno.setIdade(-25);
        aluno.setNotas(new double[] {3, 2, 9.5});
        aluno.print();
        aluno.tirarMedia();

        System.out.println(aluno.getNome());
    }
}
