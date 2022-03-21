package javacore.enumeracao;

public enum TipoCliente {
    //constant specific class body
    PESSOA_FISICA(1, "Pessoa Fisica"),  PESSOA_JURIDICA(2, "Pessoa Juridica"){
        public String getId(){
            return "B";
    }
    };

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    //constant specific class body

    public String getId(){
        return "A;";
    }

    public int getTipo() {
        return tipo;
    }
}
