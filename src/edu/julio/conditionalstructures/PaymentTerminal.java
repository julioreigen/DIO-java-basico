package edu.julio.conditionalstructures;

public class PaymentTerminal {
    public static void main(String[] args) {
        double balance = 25;
        double withdrawalValue = 17.5;

        if (withdrawalValue < balance) {
            balance -= withdrawalValue;
        }

        System.out.println(balance);
    }
}
