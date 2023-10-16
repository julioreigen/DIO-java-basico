package edu.julio.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExemplo {
    public static void main(String[] args) {
        List<String> palavras = Arrays
                .asList("java", "kotlin", "javascript", "python", "c", "c++", "go", "ruby");

        // Verifica se a palavra tem mais de 5 caracteres
        Predicate<String> verificador = palavra -> palavra.length() > 5;

        palavras.stream()
                .filter(verificador)
                .forEach(System.out::println);
    }
}
