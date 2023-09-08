package TestesAleatorios;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        double[] notas = {7, 8, 5};

        double media = Arrays.stream(notas).average().orElse(0.0);
        double piorNota = Arrays.stream(notas).min().orElse(0);
        double maiorNota = Arrays.stream(notas).max().orElse(0);

        String resultado = media >= 6 ? "Aprovado" : (media > 0 ? "Reprovado" : "Nota inválida");

        System.out.printf("Média: %.2f\nSituação: %s\n\n", media, resultado);

        System.out.printf("Maior nota: %.2f\nMaior nota: %.2f", maiorNota, piorNota);

    }
}
