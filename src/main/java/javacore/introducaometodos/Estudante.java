package javacore.introducaometodos;

public class Estudante {
    private String nome;
    private int idade;
    private double [] notas;
    private boolean aprovado;

    public void print(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (notas != null){
            for (double nota : notas){
                System.out.println(nota + "");
            }
        }
    }

    public void tirarMedia(){
        if (notas == null){
            System.out.println("Esse aluno não possui notas");
            return;
        }
        double media = 0;
        for (double nota :notas){
            media += nota;
        }

        media = media / notas.length;

        if (media > 6){
            this.aprovado = true;
            System.out.println(nome + ", aluno aprovado. " + "Sua media é: " +  media);
            return;
        }
        this.aprovado = false;
        System.out.println(nome + ", aluno reprovado. " + "Sua media é: " + media);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if (idade  < 0){
            System.out.println("Digite uma idade valida");
            return;
        }
        this.idade = idade;
    }

    public void setNotas(double[] notas){
        this.notas = notas;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double[] getNotas(){
        return this.notas;
    }

    public boolean isAprovado(){
        return this.aprovado;
    }



}
