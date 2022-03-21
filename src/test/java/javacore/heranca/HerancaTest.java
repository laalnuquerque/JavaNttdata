package javacore.heranca;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Kyle");
        Endereco end = new Endereco();

        p.setNome("Gina");
        p.setCpf("457.985.695-86");
        end.setBairro("Jardins");
        end.setRua("Rua 25");
        p.setEndereco(end);

        p.imprime();

        Funcionario f = new Funcionario("Kyle");

        System.out.println("----------------------------------");

        f.setNome("Augusti");
        f.setCpf("45.965.986-80");
        f.setSalario(15000);
        f.setEndereco(end);

        f.imprime();
    }
}
