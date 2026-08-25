public class FuncionarioCLT extends Funcionario {
    public double valeTransporte, valeAlimentacao;

    public FuncionarioCLT(String nome, String matricula, double salarioBase, String dataAdmissao, double valeTransporte, double valeAlimentacao) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.valeAlimentacao + this.valeTransporte;
    }

    @Override
    public double calcularDesconto() {
        return super.calcularDesconto() + 50;
    }
}
