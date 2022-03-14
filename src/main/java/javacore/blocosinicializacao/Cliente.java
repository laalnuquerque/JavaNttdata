package javacore.blocosinicializacao;

public class Cliente {
    // 1 - Alocado espaço na memoria para o objeto que será criado
    // 2 - cada atributo de classe é criado/inicializado com seus valores default ou valores explicitos
    // 3 - Bloco inicializaçao
    // 4 - construtor é executado
    // 5 - bloco de inicialização estatico é executado quando a JVM carregar a classe - apnas uma exxecução
    private static int [] parcelas ;


    //bloco inicializaçao
    static {
        parcelas = new int[100];
        System.out.println("Dentro construtor");
        for (int i = 1; i < 100; i++){
            parcelas[i - 1] = i;
        }
    }

    public  Cliente(){

    }

    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }

    public static int[] getParcelas() {
        return parcelas;
    }
}
