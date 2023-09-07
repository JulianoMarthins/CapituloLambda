package Aula01_LambdaComparadores;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> lista = new ArrayList<>();

        lista.add(new Product("Playstation 5", 4500.00));
        lista.add(new Product("Xbox serie X", 3800.00));
        lista.add(new Product("Nintendo Switch", 2300.00));

//        Comparator<Product> comp = (p1, p2) -> {
//            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//        };
//
//        lista.sort(comp);

        lista.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));


        System.out.println("Teclado novo");
        System.out.println("Teclado novo");


        for (Product p : lista) {
            System.out.println(p);
        }
    }
}
