package Aula06_Function_Ex_map.util;

import Aula01_LambdaComparadores.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {



    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
