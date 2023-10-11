package edu.julio.collections.list.ordenacao;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    List<Integer> numeros;

    public OrdenacaoNumeros() {
        numeros = new ArrayList<>();
    }

    void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    List<Integer> ordenarAsc() {
        List<Integer> ascendente = new ArrayList<>(numeros);
        ascendente.sort(Integer::compareTo);
        return ascendente;
    }

    List<Integer> ordenarDesc() {
        List<Integer> descendente = new ArrayList<>(numeros);
        descendente.sort(Collections.reverseOrder());
        return descendente;
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordem = new OrdenacaoNumeros();
        ordem.adicionarNumero(18);
        ordem.adicionarNumero(5);
        ordem.adicionarNumero(108);
        ordem.adicionarNumero(42);
        ordem.adicionarNumero(11);

        System.out.println(ordem.ordenarAsc());
        System.out.println(ordem.ordenarDesc());
    }
}
