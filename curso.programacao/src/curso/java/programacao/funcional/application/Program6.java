package curso.java.programacao.funcional.application;

import curso.java.programacao.funcional.entity.Product;
import curso.java.programacao.funcional.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program6 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //Implementação da interface:
        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        //names.forEach(System.out::println);

        //Reference method com método estático:
        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        //names.forEach(System.out::println);

        //Reference method com método não estático:
        //List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
        //names.forEach(System.out::println);

        //Expressão lambda declarada:
        //Function<Product, String> func = p -> p.getName().toUpperCase();
        //List<String> names = list.stream().map(func).collect(Collectors.toList());
        //names.forEach(System.out::println);

        //Expressão lambda inline:
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);

    }
}
