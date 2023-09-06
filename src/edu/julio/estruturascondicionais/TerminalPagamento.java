package edu.julio.estruturascondicionais;

public class TerminalPagamento {
    public static void main(String[] args) {
        double saldo = 25;
        double valorRetirada = 17.5;

        if (valorRetirada < saldo) {
            saldo -= valorRetirada;
        }

        System.out.println(saldo);
    }
}
