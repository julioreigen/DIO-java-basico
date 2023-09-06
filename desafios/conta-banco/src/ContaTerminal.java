import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = input.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = Integer.parseInt(input.nextLine());

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = input.nextLine();


        Random dinheiro = new Random();
        double saldo = dinheiro.nextDouble(100, 10000);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco!\n" +
                "Sua agência é %s, conta %d e seu saldo (R$ %.2f) já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);
    }
}