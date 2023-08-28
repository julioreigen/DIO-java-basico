package edu.julio.sintax.firstsection;

import java.util.Scanner;

public class SchoolReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your final score: ");
        int finalScore = input.nextInt();
        input.close();

        if (finalScore >= 7) {
            System.out.println("Approved!");
        }
        else if (finalScore >= 5) {
            System.out.println("Retake exams!");
        }
        else {
            System.out.println("You failed!");
        }
    }
}
