package edu.julio.conditionalstructures;

public class CarrierPlanIF {
    public static void main(String[] args) {
        String plan = "M"; // Basic, Media, Turbo

        if(plan.equals("B")) {
            System.out.println("100 minutes of calls and 5gb of data");
        }else if(plan.equals("M")) {
            System.out.println("100 minutes of calls and 5gb of data");
            System.out.println("Unlimited WhatsApp & Instagram");
        }else if(plan.equals("T")) {
            System.out.println("100 minutes of calls and 5gb of data");
            System.out.println("Unlimited WhatsApp & Instagram");
            System.out.println("5Gb extra on Youtube");
        }
    }
}
