package Aula07_FuncoesRecebendoFuncoes;

import Aula01_LambdaComparadores.Product;
import Aula07_FuncoesRecebendoFuncoes.util.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        /*
        Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos preços somente dos produtos
        cujo nome começa com "T";
         */

        List<Product> lista = new ArrayList<>();

        lista.add(new Product("Televisor", 900.00));
        lista.add(new Product("Mouse", 50.00));
        lista.add(new Product("Tablet", 350.50));
        lista.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double soma = ps.filterSum(lista, p -> p.getPrice() < 100);

        System.out.printf("Soma dos produtos R$ %.2f", soma);

    }
}
