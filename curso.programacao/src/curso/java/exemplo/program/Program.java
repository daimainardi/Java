package curso.java.exemplo.program;

import curso.java.exemplo.entity.Product;

public class Program {
    public static void main(String[] args) {
        Product product = new Product("Arroz", 4, 3.5);

        System.out.println(product);
        System.out.println("Descrição: " + product.getDescricao());
    }
}
