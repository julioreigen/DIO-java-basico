package edu.julio.poo.pilares.mensageiros.server;

import edu.julio.poo.pilares.mensageiros.service.MessageService;

import java.util.Random;

public class FacebookMessenger extends MessageService {
    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando mensagem no Messenger...");
        salvarHistoricoMensagem();
        if (sucessoAleatorio()) {
            System.out.println("Mensagem enviada!");
        } else
            System.out.println("Ocorreu um erro! Mensagem não enviada!");
    }

    public void receberMensagem(){
        System.out.println("Uma mensagem foi recebida!");
    }

    private boolean sucessoAleatorio() {
        Random r = new Random();
        return r.nextInt(1, 3) == 1;
    }
}
