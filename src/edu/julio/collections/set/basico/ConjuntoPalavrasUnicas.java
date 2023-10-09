package edu.julio.collections.set.basico;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private final Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        palavrasUnicas = new HashSet<>();
    }

    void adicionarPalavra(String palavra){
        if (!palavra.strip().contains(" ")) {
            String s1 = palavra.substring(0, 1).toUpperCase();
            String s2 = s1 + palavra.substring(1);
            palavrasUnicas.add(s2);
        }
    }
    void removerPalavra(String palavra){
        if (!palavrasUnicas.isEmpty()) {
            String palavraParaRemover = "";
            for (String p : palavrasUnicas) {
                if (p.equalsIgnoreCase(palavra)) {
                    palavraParaRemover = p;
                    break;
                }
            }
            if (!palavraParaRemover.isEmpty()) {
                palavrasUnicas.remove(palavraParaRemover);
            }
        }
    }
    String verificarPalavra(String palavra){
        for (String p: palavrasUnicas) {
            if (p.equalsIgnoreCase(palavra))
                return "Palavra encontrada no conjunto!";
        }
        return "Palavra não encontrada no conjunto!";
    }
    Set<String> exibirPalavrasUnicas(){
        return palavrasUnicas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
        return Objects.equals(palavrasUnicas, that.palavrasUnicas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas unicas = new ConjuntoPalavrasUnicas();

        unicas.adicionarPalavra("Eu");
        unicas.adicionarPalavra("Sou");
        unicas.adicionarPalavra("Melhor");
        unicas.adicionarPalavra("Receba");
        unicas.adicionarPalavra("melhor");
        unicas.adicionarPalavra("sou");
        System.out.println(unicas.exibirPalavrasUnicas());
        unicas.removerPalavra("melhor");
        System.out.println(unicas.verificarPalavra("RECEBA"));
        System.out.println(unicas.exibirPalavrasUnicas());
    }
}
