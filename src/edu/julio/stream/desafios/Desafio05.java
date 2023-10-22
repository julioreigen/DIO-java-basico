package edu.julio.stream.desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Com a Stream API,
 * calcule a média dos números maiores que 5 e exiba o resultado no console.
 */
public class Desafio05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Cria uma lista com os números maiores que 5.
        List<Integer> maiorQueCinco = numeros.stream()
                .filter(n -> n > 5)
                .toList();

        // Retorna o average da lista de números maiores que 5 ou retorna 0.
        int average = (int) maiorQueCinco.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(average);
    }
}
