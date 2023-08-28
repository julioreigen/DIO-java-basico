package edu.julio.loop;

public class For2 {
    public static void main(String[] args) {
        String[] students = {"Felipe", "Jonas", "Julia", "Marcos"};

        // For
        for (int x = 0; x < students.length; x++) {
            System.out.println("The student in index " + x + " is " + students[x]);
        }

        // For each
        for (String student : students) {
            System.out.println(student);
        }
    }
}
