package edu.julio.collections.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private final Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao) {
        eventos.put(data, new Evento(nomeEvento, nomeAtracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> agendaOrdenada = new TreeMap<>(eventos);
        System.out.println(agendaOrdenada);
    }

    public void obterProximoEvento() {
        LocalDate proximaData;
        Evento proximoEvento;

        LocalDate dataAtual = LocalDate.now();

        Map<LocalDate, Evento> agendaOrdenada = new TreeMap<>(eventos);

        for (Map.Entry<LocalDate, Evento> entry: agendaOrdenada.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 15),
                "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 13),
                "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 10, 10),
                "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 11),
                "Evento 4", "Atração 4");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
