package edu.julio.cases;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    static final double SALARIO_BASE = 2000.0;
    static String[] candidatosSelecionados = new String[5];

    public static void main(String[] args) {
        selecaoCandidatos();
        imprimirCandidatos(candidatosSelecionados);

        System.out.println();

        for (String candidato : candidatosSelecionados) {
            if (candidato != null) {
                entrarEmContato(candidato);
            }
        }
    }

    static double salarioPretendido() {
        // Gera um valor aleatório double entre 1800 e 2200
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO",
                "MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int qntdSelecionados = 0;
        int candidatoAtual = 0;
        while (qntdSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = salarioPretendido();

            // System.out.printf("O candidato %s solicitou o salário de R$%.2f\n", candidato, salarioPretendido);
            if (SALARIO_BASE >= salarioPretendido) {
                // System.out.printf("O candidato %s foi selecionado!\n", candidato);
                qntdSelecionados++;
                candidatosSelecionados[qntdSelecionados - 1] = candidato;
            }
            candidatoAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido){
        if (salarioPretendido > SALARIO_BASE){
            System.out.println("Ligar para o candidato!");
        } else if (salarioPretendido == SALARIO_BASE) {
            System.out.println("Ligar para o candidato, com contra-proposta!");
        }
        else {
            System.out.println("Aguardar resultado dos demais candidatos!");
        }
    }
    static void imprimirCandidatos(String[] selecionados){
        System.out.println("Imprimindo a lista de candidatos selecionados:");
        for (int i = 0; i < selecionados.length; i++) {
            if (selecionados[i] != null) {
                System.out.printf("O candidato de nº %d é: %s\n", i + 1, selecionados[i]);
            }
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }
        } while (tentativasRealizadas < 3 && continuarTentando);

        if (atendeu) {
            System.out.printf("Conseguimos contato com %s na %dª tentativa!\n", candidato, tentativasRealizadas);
        } else {
            System.out.printf("Não conseguimos contato com %s!\n", candidato);
        }
    }
}
