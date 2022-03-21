package javacore.modificadorfinal;

//classe não pode ser extendida
public final class Carro {

    //modificador final, definir em UPERCASE
    private static final double VELOCIDADE_FINAL = 250;

    //varivel tipo reference
    private final Comprador comprador = new Comprador();
    private String nome;
    private String marca;


    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    //metodo não pode ser sobrescrito
    public final void imprime(){
        System.out.println("Imprimindo carro");


    }

    public Comprador getComprador() {
        return comprador;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
