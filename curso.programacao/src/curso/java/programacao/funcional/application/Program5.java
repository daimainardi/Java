package curso.java.programacao.funcional.application;

import curso.java.programacao.funcional.entity.Product;
import curso.java.programacao.funcional.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program5 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
        // implementação da interface:
        //list.forEach(new PriceUpdate());
        //list.forEach(System.out::println);

        //Reference method com método estático:
        //list.forEach(Product::staticPriceUpdate);
        //list.forEach(System.out::println);

        //Reference method com método não estático:
        //list.forEach(Product::nonStaticPriceUpdate);
        //list.forEach(System.out::println);

        //Expressão lambda declarada:
        //Consumer<Product> cons = p -> p.setPrice(p.getPrice() *1.1);
        //list.forEach(cons);
        //list.forEach(System.out::println);

        //Expressão lambda inline:
        list.forEach(p-> p.setPrice(p.getPrice() *1.1));
        list.forEach(System.out::println);
    }

}
