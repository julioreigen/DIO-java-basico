package edu.julio.conditionalstructures;

public class CarrierPlanSwitch {
    public static void main(String[] args) {
        String plan = "M"; // Basic, Media, Turbo

        switch (plan) {
            case "T": {
                System.out.println("5Gb extra on Youtube");
            }
            case "M": {
                System.out.println("Unlimited WhatsApp & Instagram");
            }
            case "B": {
                System.out.println("100 minutes of calls and 5gb of data");
            }
        }
    }
}
