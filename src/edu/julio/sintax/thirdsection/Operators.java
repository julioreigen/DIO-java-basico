package edu.julio.sintax.thirdsection;

public class Operators {
    public static void main(String[] args) {
        // Unary
        int number = 5;
        number = -number; // to negative
        System.out.println(number);

        number = number * -1; // to positive
        number++; // increments by 1
        System.out.println(number);
        System.out.println(++number); // increments by 1
        System.out.println(number);

        boolean powerOn = true;
        powerOn = !powerOn;
        System.out.println(powerOn);

        // Ternary
        int a, b;
        a = 5;
        b = 6;
        String result = (a == b) ? "\na is equal to b" : "\na is not equal to b";
        System.out.println(result);

        // Relational
        int n1 = 1;
        int n2 = 2;

        boolean yesOrNot = n1 == n2;
        System.out.println("\nn1 equals n2? " + yesOrNot);

        yesOrNot = n1 != n2;
        System.out.println("n1 is different from n2? " + yesOrNot);

        yesOrNot = n1 > n2;
        System.out.println("n1 is greater than n2? " + yesOrNot);

        yesOrNot = n1 < n2;
        System.out.println("n1 is less than n2? " + yesOrNot);

        yesOrNot = n1 >= n2;
        System.out.println("n1 is greater than or equal to n2? " + yesOrNot);

        yesOrNot = n1 <= n2;
        System.out.println("n1 is less than or equal to n2? " + yesOrNot);

        System.out.println();
        String name1 = "JULIO";
        String name2 = new String("JULIO");
        System.out.println(name1.equalsIgnoreCase(name2));

        // Logical
        boolean condition1 = true;
        boolean condition2 = false;
        if (condition1 && condition2) {
            System.out.println("Both conditions are true");
        }
        if (condition1 || condition2) {
            System.out.println("At least one condition is true");
        }
        if (!condition1 && !condition2) {
            System.out.println("Both conditions are false");
        }
    }
}
