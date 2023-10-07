package edu.julio.poo.pilares.mensageiros.service;

public abstract class MessageService {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConexaoInternet() {
        System.out.println("Conexão estabelecida!");
    }
    protected void salvarHistoricoMensagem(){
        System.out.println("Histórico de mensagens salvo!");
    }
}
