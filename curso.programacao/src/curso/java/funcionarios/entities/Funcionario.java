package curso.java.funcionarios.entities;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void novoSalario (Double aumento) {
         this.salario = this.salario + (aumento/100) * this.salario;
    }

    @Override
    public String toString() {
        return "id = " + id + ", nome = " + nome +
                ", " + String.format("salário R$ %.2f" , salario);
    }

}
