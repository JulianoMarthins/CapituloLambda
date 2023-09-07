package Aula02_PFuncionalCalculosLambdas;


import Aula01_LambdaComparadores.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int compareProdutos(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
    public static void main(String[] args) {

        List<Product> lista = new ArrayList<>();

        lista.add(new Product("Televisor", 900.00));
        lista.add(new Product ("Notebook", 1200.00));
        lista.add(new Product("Tablet", 450.00));

        lista.sort(Main::compareProdutos);

        lista.forEach(System.out::println);





    }
}
