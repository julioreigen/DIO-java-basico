package edu.julio.poo.pilares;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("123456789");
//        jeep.ligar();

        Moto suzuki = new Moto();
        suzuki.setChassi("987654321");
//        suzuki.ligar();

        Veiculo coringa = suzuki;
        coringa.ligar();
    }
}
