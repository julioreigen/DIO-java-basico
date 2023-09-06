package edu.julio.loop;

public class For2 {
    public static void main(String[] args) {
        String[] alunos = {"Felipe", "Jonas", "Julia", "Marcos"};

        // For
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O estudante no índice " + x + " é " + alunos[x]);
        }

        // For each
        for (String estudante : alunos) {
            System.out.println(estudante);
        }
    }
}
