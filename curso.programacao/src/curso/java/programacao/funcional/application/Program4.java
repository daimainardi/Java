package curso.java.programacao.funcional.application;

import curso.java.programacao.funcional.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program4 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Reference method com método estático:
        //list.removeIf(Product::staticProductPredicate);

        // Reference method com método não estático:
        //list.removeIf(Product::nonStaticProductPredicate);

        // Expressão lambda declarada:
        double min = 100.0;
        //Predicate<Product> pred = p -> p.getPrice() >= min;
        //list.removeIf(pred);

        // Expressão lambda inline:
        list.removeIf(p -> p.getPrice() >= min);

        for (Product p: list) {
            System.out.println(p);
        }
    }
}
