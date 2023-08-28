package edu.julio.conditionalstructures;

public class ReportCard {
    public static void main(String[] args) {
        double score = 6.5;
        String result = score >= 7 ? "Approved" : (score >= 5 ? "Retake exams" : "Repeat next year");
        System.out.println(result);
    }
}
