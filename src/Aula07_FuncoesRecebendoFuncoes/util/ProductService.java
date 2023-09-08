package Aula07_FuncoesRecebendoFuncoes.util;

import Aula01_LambdaComparadores.Product;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ProductService {

    public double filterSum(List<Product> lista, Predicate<Product> criteria) {
        double sum = 0.0;

        for (Product p : lista) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }


}
