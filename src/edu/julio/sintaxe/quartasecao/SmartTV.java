package edu.julio.sintaxe.quartasecao;

import java.util.Scanner;

/**
 * Criar uma classe que represente uma televisão, onde:
 * Ela tenha as características: ligada (boolean), canal (int) e volume (int);
 * Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
 * Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
 * Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
 */

public class SmartTV {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        TV tv = new TV();
        int escolha;

        do {
            tv.getAllState();
            System.out.println("""
                    Opções:
                    1 - Ligar/Desligar
                    2 - Mudar canal
                    3 - Canal Up
                    4 - Canal Down
                    5 - Volume Up
                    6 - Volume Down
                    7 - Sair""");
            System.out.print("Escolha uma opção: ");
            escolha = input.nextInt();
            option(escolha, tv);
        } while (escolha != 7);

    }
    static void option(int escolha, TV tv){
        switch (escolha) {
            case 1:
                tv.powerOnOff();
                return;
            case 2:
                System.out.print("Digite o número do canal: ");
                int ch = input.nextInt();
                tv.setCanal(ch);
                return;
            case 3:
                tv.channelUp();
                return;
            case 4:
                tv.channelDown();
                return;
            case 5:
                tv.volumeUp();
                return;
            case 6:
                tv.volumeDown();
                return;
            case 7:
                System.exit(0);
                return;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
