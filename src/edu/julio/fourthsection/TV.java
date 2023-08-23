package edu.julio.fourthsection;

public class TV {
    boolean state = false;
    int channel = 1;
    int volume = 10;

    public void getAllState() {
        System.out.println();
        System.out.println("=============================================");
        System.out.println("TV is " + (state ? "on" : "off"));
        if (state) {
            System.out.println("Channel: " + channel);
            System.out.println("Volume: " + volume);
        }
        System.out.println("=============================================");
        System.out.println();
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    void powerOnOff(){
        state = !state;
    }
    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }
    void volumeUp(){
        volume++;
    }
    void volumeDown(){
        volume--;
    }
}
