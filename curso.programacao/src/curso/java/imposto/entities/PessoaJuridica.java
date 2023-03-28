package curso.java.imposto.entities;

public class PessoaJuridica extends Pessoa {
    private Integer numeroFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double imposto() {
        Double imposto;
        if (this.numeroFuncionarios > 10){
            imposto = super.getRendaAnual() * 0.14;
        }
        else {
            imposto = super.getRendaAnual() * 0.16;
        }
        return imposto;
    }
    @Override
    public String toString() {
        return "Nome: "+ getNome() + " "
                + String.format("Imposto: %.2f%n", imposto());
    }
}
