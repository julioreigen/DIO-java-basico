package edu.julio.stream.desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Com a ajuda da Stream API, encontre o segundo número maior da lista
 * e exiba o resultado no console.
 */
public class Desafio07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maiorNumero = numeros.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        System.out.println("Maior número da lista: " + maiorNumero);
    }
}
