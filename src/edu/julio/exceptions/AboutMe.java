package edu.julio.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Your name: ");
            String name = input.next();

            System.out.print("Your surname: ");
            String surname = input.next();

            System.out.print("Input your height (cm): ");
            double height = Double.parseDouble(input.next().replace(",", "."));

            System.out.print("Your age: ");
            int age = input.nextInt();

            System.out.println("Hello, my name is " + name + " " + surname);
            System.out.println("I am " + Math.abs(age) + " years old");
            System.out.println("I am " + Math.abs(height) + " cm tall");

        } catch (InputMismatchException e) {
            System.out.println("Your age must be an integer!");
        } catch (NumberFormatException e) {
            System.out.println("Your height must be a number!");
        }
    }
}

