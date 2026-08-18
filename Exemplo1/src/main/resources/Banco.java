public class Banco {
    public String nome;
    public String cpf;
    public double saldo;

    public Banco (String novoNome, String novoCPF, double novoSaldo) {
        this.nome = novoNome;
        this.cpf = novoCPF;
        this.saldo = novoSaldo;
    }

    public Banco () {
        this.nome = "Sem nome";
        this.cpf = "Sem cpf";
        this.saldo = 0;
    }
}
