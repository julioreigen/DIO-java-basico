package edu.julio.collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagem = new HashMap<>();


    public void adicionarPalavra(String palavra, Integer contagem) {
        this.contagem.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        contagem.remove(palavra);
    }

    public void exibirContagem() {
        System.out.println(contagem);
    }

    public void encontrarPalavraMaisFrequente() {
        if (!contagem.isEmpty()) {
            String palavraMaisFrequente = null;
            int maiorFrequencia = Integer.MIN_VALUE;

            for (String palavra : contagem.keySet()) {
                int frequencia = contagem.get(palavra);
                if (frequencia > maiorFrequencia) {
                    palavraMaisFrequente = palavra;
                    maiorFrequencia = frequencia;
                }
            }
            System.out.println("Palavra mais frequente: " + palavraMaisFrequente);
            System.out.println("Frequência: " + maiorFrequencia);
        } else {
            System.out.println("Não há palavras!");
        }
    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();
        contagem.adicionarPalavra("apple", 3);
        contagem.adicionarPalavra("banana", 5);
        contagem.adicionarPalavra("cherry", 2);
        contagem.adicionarPalavra("date", 7);

        contagem.exibirContagem();
//        contagem.removerPalavra("cherry");

        contagem.exibirContagem();
        contagem.encontrarPalavraMaisFrequente();
    }
}
