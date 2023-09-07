package Aula01_LambdaComparadores;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }

    // Classe usada para o primeiro exemplo dos métodos de instanciação do comparador.

}
