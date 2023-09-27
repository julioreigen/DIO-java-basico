package edu.julio.poo.fundamentos.enums;

import java.util.stream.Stream;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
            // System.out.println(e.getSigla() + " - " + e.getNome());
        }
        System.out.println();

        // Streams
        Stream<EstadoBrasileiro> stream = Stream.of(EstadoBrasileiro.values());
        stream.forEach(e -> System.out.println(e.getSigla() + " - " + e.getNome()));

        System.out.println();

        //
        EstadoBrasileiro eb = EstadoBrasileiro.CEARA;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}
