package edu.julio.loop;

import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada > 0) {
            Double precoDoce = valorAleatorio();
            if(precoDoce > mesada) {
                precoDoce = mesada;
            }
            System.out.printf("Doce ($%.2f) adicionado ao carrinho.\n", precoDoce);
            mesada -= precoDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Johnny gastou sua mesada com doces.");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
