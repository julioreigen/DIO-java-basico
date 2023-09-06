import java.util.Random;
import java.util.Scanner;

public class PaymentTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your agency number: ");
        String swiftCode = input.nextLine();

        System.out.print("Please enter your account number: ");
        int accountNumber = Integer.parseInt(input.nextLine());

        System.out.print("Please enter your name: ");
        String clientName = input.nextLine();


        Random money = new Random();
        double balance = money.nextDouble(100, 10000);

        System.out.printf("Hi %s, thank you for using our services!\n" +
                        "Your SWIFT code is %s, account %d and your balance ($%.2f) is ready to be withdrawn.",
                clientName, swiftCode, accountNumber, balance);
    }
}
