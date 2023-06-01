package curso.java.estruturadedados.listas;

public class Cliente {
    private long codigo;
	private String razaoSocial;
	private String endereco;
	private double previsaoVendas;

	public Cliente(long codigo, String razaoSocial, String endereco, double previsaoVendas) {
		this.codigo = codigo;
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
		this.previsaoVendas = previsaoVendas;
	}

	public String toString() {
		return "Codigo: "+codigo+" Razão Social: "+razaoSocial;
	}

	public void atualizaRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void atualizaPrevisao(double previsaoVendas) {
		this.previsaoVendas = previsaoVendas;
	}

	public void mudaEndereco(String endereco) {
		this.endereco = endereco;
	}
}
