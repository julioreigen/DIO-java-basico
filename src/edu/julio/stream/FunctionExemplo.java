package edu.julio.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
public class FunctionExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 4, 6, 8);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();

        numerosDobrados.forEach(n -> System.out.print(n + " "));
    }
}
