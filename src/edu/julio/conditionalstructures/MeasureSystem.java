package edu.julio.conditionalstructures;

public class MeasureSystem {
    public static void main(String[] args) {
        String initial = "M";

        switch (initial) {
            case "S" -> System.out.println("Short");
            case "M" -> System.out.println("Medium");
            case "L" -> System.out.println("Large");
            default -> System.out.println("Invalid size");
        }
    }
}
