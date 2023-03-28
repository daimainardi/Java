package curso.java.exemplo.entity;

public class Product {
    private String descricao;
    private int quantidade;
    private double preco;

    @Override
    public String toString() {
        return "Product{" +
                "descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Product(String descricao, int quantidade, double preco) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }
}
