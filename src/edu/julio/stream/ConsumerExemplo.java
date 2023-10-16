package edu.julio.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Usando Consumer com expressão lambda para imprimir pares.
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0)
                System.out.print(numero + " ");
        };

        // Usando Consumer para imprimir pares com Stream.
        numeros.stream().forEach(imprimirNumeroPar);


        // O método a seguir também pode ser utilizado para a função acima.
        numeros.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n + " ");
        });

    }
}
