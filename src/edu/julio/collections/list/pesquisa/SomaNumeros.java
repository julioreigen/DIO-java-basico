package edu.julio.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numeros;

    public SomaNumeros(){
        numeros = new ArrayList<Integer>();
    }

    void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    int calcularSoma() {
        int total = 0;
        for(Integer i: numeros) {
            total += i;
        }
        return total;
    }

    int maiorNumero() {
        return numeros.stream().max(Integer::compare).get();
    }

    int menorNumero() {
        return numeros.stream().min(Integer::compare).get();
    }

    List<Integer> exibirNumeros() {
        return numeros;
    }

    public static void main(String[] args) {
        SomaNumeros calculos = new SomaNumeros();
        calculos.adicionarNumero(18);
        calculos.adicionarNumero(72);
        calculos.adicionarNumero(8);
        calculos.adicionarNumero(1);
        calculos.adicionarNumero(11);
        calculos.adicionarNumero(6);

        System.out.println(calculos.exibirNumeros());

        System.out.println("Maior número: " + calculos.maiorNumero());
        System.out.println("Menor número: " + calculos.menorNumero());
        System.out.println("Soma total: " + calculos.calcularSoma());

    }
}
