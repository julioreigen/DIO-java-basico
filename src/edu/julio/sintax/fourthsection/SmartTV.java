package edu.julio.sintax.fourthsection;

import java.util.Scanner;

/**
 * Make a class to represent a Smart TV where:
 * it contains the characteristics: state (boolean), channel (int) and volume (int);
 * The TV can turn on and off
 * The TV can increase and decrease the volume by +1 or -1;
 * The TV can change the channel by 1 or inform the corresponding number.
 */

public class SmartTV {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        TV tv = new TV();
        int choice;

        do {
            tv.getAllState();
            System.out.println("""
                    Options:
                    1 - Power On/Off
                    2 - Change channel
                    3 - Channel up
                    4 - Channel down
                    5 - Volume up
                    6 - Volume down
                    7 - Exit""");
            System.out.print("Choose an option: ");
            choice = input.nextInt();
            option(choice, tv);
        } while (choice != 7);

    }
    static void option(int choice, TV tv){
        switch (choice) {
            case 1:
                tv.powerOnOff();
                return;
            case 2:
                System.out.print("Choose a channel: ");
                int ch = input.nextInt();
                tv.setChannel(ch);
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
                System.out.println("Invalid option!");
        }
    }
}
