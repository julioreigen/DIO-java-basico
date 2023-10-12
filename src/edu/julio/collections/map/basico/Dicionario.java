package edu.julio.collections.map.basico;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> dic = new HashMap<>();

    public Dicionario() {}

    void adicionarPalavra(String palavra, String definicao) {
        dic.put(palavra, definicao);
    }

    void removerPalavra(String palavra) {
        if (!dic.isEmpty())
            dic.remove(palavra);
    }

    void exibirPalavras() {
        System.out.println(dic);
    }

    String pesquisarPorPalavra(String palavra) {
        if (!dic.isEmpty()) {
            return "Definição de " + palavra + ": " + dic.get(palavra);
        }
        return "Palavra não encontrada!";
    }

    public static void main(String[] args) {
        Dicionario dc = new Dicionario();
        dc.adicionarPalavra("Escola", "Estabelecimento que se destina ao ensino, público ou particular; colégio: ir à escola.");
        dc.adicionarPalavra("Bicicleta", "Veículo de duas rodas, sendo a traseira acionada por um sistema de pedais que movimentam uma corrente transmissora.");
        dc.adicionarPalavra("Faculdade", "Instituição de ensino superior");
        dc.adicionarPalavra("Nodular", "Que se refere à nódulo (pequeno nó): imagem nodular.");

        dc.exibirPalavras();

        dc.removerPalavra("Bicicleta");
        dc.exibirPalavras();

        System.out.println(dc.pesquisarPorPalavra("Escola"));
    }
}
