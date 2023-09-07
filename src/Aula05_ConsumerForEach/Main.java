package Aula05_ConsumerForEach;

import Aula01_LambdaComparadores.Product;
import Aula05_ConsumerForEach.util.PriceUpDate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args){

        // Fazer um programa uue aumente o preço de uma lista de produtos em 10%

        List<Product> lista = new ArrayList<>();

        lista.add(new Product("TV", 900.00));
        lista.add(new Product("Mouse", 50.00));
        lista.add(new Product("Tablet", 350.50));
        lista.add(new Product("Hd Case", 80.90));

        double juros = 1.1;
        Consumer<Product> cons = (product -> product.setPrice(product.getPrice() * juros));
        lista.forEach(cons);

        //lista.forEach(new PriceUpDate());
        //lista.forEach((product -> product.setPrice(product.getPrice() * 1.1)));

        lista.forEach(System.out::println);

    }
}
