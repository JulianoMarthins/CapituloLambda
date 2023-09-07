package Aula04_Predicate_Ex_removeIf.util;

import Aula01_LambdaComparadores.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.00;
    }
}
