package edu.julio.estruturascondicionais;

public class BoletimEscolar {
    public static void main(String[] args) {
        double media = 6.5;

        if (media >= 7)
            System.out.println("Aprovado!");
        else if (media >= 5)
            System.out.println("Recuperação!");
        else
            System.out.println("Reprovado!");
    }
}
