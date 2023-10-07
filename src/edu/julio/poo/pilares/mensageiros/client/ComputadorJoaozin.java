package edu.julio.poo.pilares.mensageiros.client;

import edu.julio.poo.pilares.mensageiros.server.FacebookMessenger;
import edu.julio.poo.pilares.mensageiros.server.MSNMessenger;
import edu.julio.poo.pilares.mensageiros.server.Telegram;
import edu.julio.poo.pilares.mensageiros.service.MessageService;

public class ComputadorJoaozin {
    public static void main(String[] args) {

        MessageService smi = null;

        String appEscolhido="tg";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fb"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
