package edu.julio.sintaxe.primeirasecao;

import java.util.Scanner;

public class BoletimEscolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua média final: ");
        int mediaFinal = input.nextInt();
        input.close();

        if (mediaFinal >= 7) {
            System.out.println("Aprovado!");
        }
        else if (mediaFinal >= 5) {
            System.out.println("Recuperação!");
        }
        else {
            System.out.println("Reprovado!");
        }
    }
}
