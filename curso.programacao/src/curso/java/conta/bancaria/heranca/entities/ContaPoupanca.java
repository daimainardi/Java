package curso.java.conta.bancaria.heranca.entities;

public final class ContaPoupanca extends Conta {

    private double taxaJuro;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuro) {
        super(numero, titular, saldo);
        this.taxaJuro = taxaJuro;
    }

    public double getTaxaJuro() {
        return taxaJuro;
    }

    public void setTaxaJuro(double taxaJuro) {
        this.taxaJuro = taxaJuro;
    }

    public void saldoAtualizado(double taxaJuro) {
        saldo += saldo * taxaJuro;
    }

    @Override
    public final void saque(double saque) {
        saldo -= saque;
    }
}
