package edu.julio.poo.pilares;

public class Carro extends Veiculo {

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Ligando o carro");
    }
    private void confereCombustivel() {
        System.out.println("Conferindo o combustivel");
    }
    private void confereCambio() {
        System.out.println("Conferindo o câmbio");
    }
}
