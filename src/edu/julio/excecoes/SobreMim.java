package edu.julio.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Seu nome: ");
            String nome = input.next();

            System.out.print("Seu sobrenome: ");
            String sobrenome = input.next();

            System.out.print("Sua altura (cm): ");
            double altura = Double.parseDouble(input.next().replace(",", "."));

            System.out.print("Sua idade: ");
            int idade = input.nextInt();

            System.out.println("Oi, meu nome é " + nome + " " + sobrenome);
            System.out.println("Eu tenho " + Math.abs(idade) + " anos");
            System.out.println("Eu tenho " + Math.abs(altura) + " cm de altura.");

        } catch (InputMismatchException e) {
            System.out.println("Sua idade deve ser um número inteiro!");
        } catch (NumberFormatException e) {
            System.out.println("Sua altura deve ser um número!");
        }
    }
}

