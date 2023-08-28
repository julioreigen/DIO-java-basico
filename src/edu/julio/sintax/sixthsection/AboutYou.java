package edu.julio.sintax.sixthsection;

import java.util.Scanner;

public class AboutYou {
    /**
     * This code snippet reads input from the user for their height, name, surname, and age.
     * It then prints out a greeting message with the name and surname,
     * followed by the age and height.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your height (cm): ");
        double height = input.nextDouble();

        System.out.print("Your name: ");
        String name = input.next();

        System.out.print("Your surname: ");
        String surname = input.next();

        System.out.print("Your age: ");
        int age = input.nextInt();

        System.out.println("Hello, my name is " + name + " " + surname);
        System.out.println("I am " + age + " years old");
        System.out.println("I am " + height + " cm tall");
    }
}
