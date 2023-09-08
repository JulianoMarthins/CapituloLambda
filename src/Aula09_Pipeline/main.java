package Aula09_Pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> str = lista.stream().map(x -> x * 10);
        System.out.println("Lista - " + Arrays.toString(str.toArray()));

        int sum = lista.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Soma da lista: " + sum);

        List<Integer> pares = lista.stream().filter(x -> x % 2 == 0).toList();

        System.out.println("Números pares: " + pares);






    }
}
