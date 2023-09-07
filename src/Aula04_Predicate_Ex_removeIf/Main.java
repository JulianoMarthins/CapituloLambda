package Aula04_Predicate_Ex_removeIf;

import Aula01_LambdaComparadores.Product;
import Aula04_Predicate_Ex_removeIf.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        /*
        Fazer um programa que, a partir de uma lista de produtos, remova da lista somente aqueles cujo o preço
        mínimo seja 100.
         */


        List<Product> lista = new ArrayList<>();

        lista.add(new Product("TV", 900.00));
        lista.add(new Product("Mouse", 50.00));
        lista.add(new Product("Tablet", 350.50));
        lista.add(new Product("Hd Case", 80.90));

        double min = 100.00;
        Predicate<Product> pred = p -> p.getPrice() >= min;

        lista.removeIf(pred);
        //lista.removeIf(new ProductPredicate());
        //lista.removeIf((product -> product.getPrice() <= 100));

        lista.sort((Product p1, Product p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        lista.forEach(System.out::println);


    }


}
