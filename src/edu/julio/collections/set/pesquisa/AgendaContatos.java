package edu.julio.collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agenda;

    public AgendaContatos() {
        this.agenda = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero) {
        agenda.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(agenda);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c: agenda) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroDeContato(String nome, String novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c: agenda) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;

    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Maria", "123456789");
        agenda.adicionarContato("Jose", "987654321");
        agenda.adicionarContato("Maria", "123456789");
        agenda.adicionarContato("Julio", "7794488255");
        agenda.adicionarContato("Joan", "58444733611");
        agenda.adicionarContato("Jaime", "DJAINDSDNSAI1");

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Julio"));

        System.out.println("Contato atualizado: " + agenda.atualizarNumeroDeContato("Jaime", "555666555"));
        agenda.exibirContatos();
    }
}
