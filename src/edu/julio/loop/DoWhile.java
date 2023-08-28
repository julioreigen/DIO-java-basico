package edu.julio.loop;

import java.util.Random;

public class DoWhile {
    public static void main (String[]args){
        System.out.println("Calling...");

        do {
            // running till someone answers
            System.out.println("Smartphone ringing...");
        } while (calling());

        System.out.println("Hello!!!");
    }

    private static boolean calling() {
        boolean answered = new Random().nextInt(3) == 1;
        System.out.println("Answered? " + answered);
        // denying the act of continuing to ring
        return !answered;
    }
}