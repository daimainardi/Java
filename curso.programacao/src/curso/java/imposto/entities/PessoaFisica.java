package curso.java.imposto.entities;

public class PessoaFisica extends Pessoa {
    private Double gastosSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double imposto() {
        Double imposto;
        if (super.getRendaAnual() < 20000.00){
            imposto = super.getRendaAnual() * 0.15;
            if (this.getGastosSaude() != 0){
                imposto -= 0.5 * this.getGastosSaude();
            }
        }
        else {
            imposto = super.getRendaAnual() * 0.25;
            if (this.getGastosSaude() != 0){
                imposto -= 0.5 * this.getGastosSaude();
            }
        }
        return imposto;
    }
    @Override
    public String toString() {
        return "Nome: "+ getNome() + " "
                + String.format("Imposto: %.2f%n", imposto());
    }
}
