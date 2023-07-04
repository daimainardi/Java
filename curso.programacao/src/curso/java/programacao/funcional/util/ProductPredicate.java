package curso.java.programacao.funcional.util;

import curso.java.programacao.funcional.entity.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
