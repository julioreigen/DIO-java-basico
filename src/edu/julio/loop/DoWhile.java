package edu.julio.loop;

import java.util.Random;

public class DoWhile {
    public static void main (String[]args){
        System.out.println("Chamando...");

        do {
            // running till someone answers
            System.out.println("Smartphone tocando...");
        } while (ligando());

        System.out.println("Alô!!!");
    }

    private static boolean ligando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        // denying the act of continuing to ring
        return !atendeu;
    }
}