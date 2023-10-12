package edu.julio.collections.map.basico;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            if (agendaContatoMap.containsKey(nome))
                agendaContatoMap.remove(nome);
        }
    }

    void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    Integer pesquisarPorNome(String nome) {
        Integer numero = null;
        if (!agendaContatoMap.isEmpty()) {
            numero = agendaContatoMap.get(nome);
        }
        return numero;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Camila", 123456);
        agenda.adicionarContato("Camila", 5665);
        agenda.adicionarContato("Camila Cavalcante", 111111111);
        agenda.adicionarContato("Camila DIO", 654987);
        agenda.adicionarContato("Julio", 584447336);
        agenda.adicionarContato("Camila", 44444);

        agenda.exibirContatos();

        agenda.removerContato("Camila");
        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Julio"));
    }
}