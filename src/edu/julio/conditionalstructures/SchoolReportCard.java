package edu.julio.conditionalstructures;

public class SchoolReportCard {
    public static void main(String[] args) {
        double score = 6.5;

        if (score >= 7)
            System.out.println("Approved!");
        else if (score >= 5)
            System.out.println("Retake exams!");
        else
            System.out.println("Repeat next year!");
    }
}
