package edu.julio.sintaxe.terceirasecao;

public class Operadores {
    public static void main(String[] args) {
        // Unário
        int numero = 5;
        numero = -numero; // para negativo
        System.out.println(numero);

        numero = numero * -1; // para positivo
        numero++; // incrementa em 1
        System.out.println(numero);
        System.out.println(++numero); // incrementa em 1
        System.out.println(numero);

        boolean ligado = true;
        ligado = !ligado;
        System.out.println(ligado);

        // Ternário
        int a, b;
        a = 5;
        b = 6;
        String resultado = (a == b) ? "\na é igual a b" : "\na não é igual a b";
        System.out.println(resultado);

        // Relacional
        int n1 = 1;
        int n2 = 2;

        boolean simOuNão = n1 == n2;
        System.out.println("\nn1 é igual a n2? " + simOuNão);

        simOuNão = n1 != n2;
        System.out.println("n1 é diferente de n2? " + simOuNão);

        simOuNão = n1 > n2;
        System.out.println("n1 é maior que n2? " + simOuNão);

        simOuNão = n1 < n2;
        System.out.println("n1 é menor que n2? " + simOuNão);

        simOuNão = n1 >= n2;
        System.out.println("n1 é maior ou igual a n2? " + simOuNão);

        simOuNão = n1 <= n2;
        System.out.println("n1 é menor ou igual a n2? " + simOuNão);

        System.out.println();
        String nome1 = "JULIO";
        String nome2 = new String("JULIO");
        System.out.println(nome1.equalsIgnoreCase(nome2));

        // Lógico
        boolean condicao1 = true;
        boolean condicao2 = false;
        if (condicao1 && condicao2) {
            System.out.println("Ambas as condições são verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println("Ao menos uma condição é verdadeira");
        }
        if (!condicao1 && !condicao2) {
            System.out.println("Ambas são falsas");
        }
    }
}
