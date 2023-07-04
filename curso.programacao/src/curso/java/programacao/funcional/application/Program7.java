package curso.java.programacao.funcional.application;

import curso.java.programacao.funcional.entity.Product;
import curso.java.programacao.funcional.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program7 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        System.out.println("Sum = " + String.format("%.2f", sum));



    }
}
