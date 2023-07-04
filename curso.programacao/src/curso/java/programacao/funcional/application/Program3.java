package curso.java.programacao.funcional.application;

import curso.java.programacao.funcional.entity.Product;
import curso.java.programacao.funcional.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
        // expressão lambda
        //list.removeIf(p -> p.getPrice() >= 100);

        //• Implementação da interface:
        list.removeIf(new ProductPredicate());
        for (Product p: list) {
            System.out.println(p);
        }

    }

}
