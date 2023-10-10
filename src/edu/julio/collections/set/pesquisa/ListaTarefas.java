package edu.julio.collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private final Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa t: tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaSet.remove(t);
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        System.out.println(tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t: tarefaSet) {
            if (t.isConcluido()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t: tarefaSet) {
            if (!t.isConcluido()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarComoConcluida(String descricao) {
        for (Tarefa t: tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(true);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Fumar um fino de canto");
        listaTarefas.adicionarTarefa("Ver meus manos");
        listaTarefas.adicionarTarefa("Fazer o corte americano");
        listaTarefas.adicionarTarefa("Ver meus manos");

        listaTarefas.contarTarefas();
        listaTarefas.exibirTarefas();

        listaTarefas.marcarComoConcluida("Ver meus manos");
        listaTarefas.exibirTarefas();

        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

    }
}
