package javacore.modificadorestatico;

public class Cliente {
    // 1 - Alocado espaço na memoria para o objeto que será criado
    // 2 - cada atributo de classe é criado/inicializado com seus valores default ou valores explicitos
    // 3 - Bloco inicializaçao
    // 4 - construtor é executado
    private int [] parcelas ;


    //bloco inicializaçao
    {
        parcelas = new int[100];
        System.out.println("Dentro construtor");
        for (int i = 1; i < 100; i++){
            parcelas[i - 1] = i;
        }
    }

    public Cliente(){

    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }

    public int[] getParcelas() {
        return parcelas;
    }
}
