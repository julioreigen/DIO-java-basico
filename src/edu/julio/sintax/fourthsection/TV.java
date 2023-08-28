package edu.julio.sintax.fourthsection;

public class TV {
    private boolean state = false;
    private int channel = 1;
    private int volume = 10;

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
