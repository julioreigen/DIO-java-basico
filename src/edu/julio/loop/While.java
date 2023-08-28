package edu.julio.loop;

import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double allowance = 50.0;
        while(allowance > 0) {
            Double candyPrice = randomValue();
            if(candyPrice > allowance) {
                candyPrice = allowance;
            }
            System.out.printf("Candy ($%.2f) added to cart.\n", candyPrice);
            allowance -= candyPrice;
        }

        System.out.println("Allowance: " + allowance);
        System.out.println("Johnny spent his allowance with candies.");
    }

    private static double randomValue() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
