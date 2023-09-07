package Aula06_Function_Ex_map;

import Aula01_LambdaComparadores.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {


        List<Product> lista = new ArrayList<>();

        lista.add(new Product("TV", 900.00));
        lista.add(new Product("Mouse", 50.00));
        lista.add(new Product("Tablet", 350.50));
        lista.add(new Product("Hd Case", 80.90));

        Function<Product, String> fun = p -> p.getName().toUpperCase();

        List<String> nome = lista.stream().map(fun).toList();

        //List<String> nome = lista.stream().map((product -> product.getName().toUpperCase())).toList();

        //List<String> nome = lista.stream().map(new UpperCaseName()).toList();

        nome.forEach(System.out::println);
    }
}
