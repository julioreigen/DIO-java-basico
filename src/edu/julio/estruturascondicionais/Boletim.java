package edu.julio.estruturascondicionais;

public class Boletim {
    public static void main(String[] args) {
        double media = 6.5;
        String resultado = media >= 7 ? "Aprovado" : (media >= 5 ? "Recuperação" : "Reprovado");
        System.out.println(resultado);
    }
}
