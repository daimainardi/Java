package curso.java.programacao.funcional.util;

import curso.java.programacao.funcional.entity.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
