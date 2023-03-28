package curso.java.conta.bancaria.heranca.entities;

public class ContaComercial extends Conta{

    private double limiteEmprestimo;

    public ContaComercial(int numero, String titular, double saldo, double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    /*public void emprestimo (double valorEmprestimo){
        if (limiteEmprestimo >= valorEmprestimo){
            deposito(valorEmprestimo);
        }*/
    public void emprestimo (double valorEmprestimo){
        if (limiteEmprestimo >= valorEmprestimo){
            saldo += valorEmprestimo - 10.0;
        }
    }
    @Override
    public void saque (double saque){
        super.saque(saque);
        saldo -= 2.0;
    }
}
