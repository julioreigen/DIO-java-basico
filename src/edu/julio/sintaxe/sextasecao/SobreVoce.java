package edu.julio.sintaxe.sextasecao;

import java.util.Scanner;

public class SobreVoce {
    /**
     * Este código lê a entrada do usuário quanto à altura, nome, sobrenome e idade.
     * Em seguida, imprime uma mensagem de saudação com o nome e sobrenome,
     * seguido da idade e altura.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a sua altura (cm): ");
        double altura = input.nextDouble();

        System.out.print("Seu nome: ");
        String nome = input.next();

        System.out.print("Seu sobrenome: ");
        String sobrenome = input.next();

        System.out.print("Sua idade: ");
        int idade = input.nextInt();

        System.out.println("Oi, meu nome é " + nome + " " + sobrenome);
        System.out.println("Eu tenho " + idade + " anos");
        System.out.println("Eu tenho " + altura + " cm de altura.");
    }
}
