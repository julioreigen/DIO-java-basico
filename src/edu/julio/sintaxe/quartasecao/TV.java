package edu.julio.sintaxe.quartasecao;

public class TV {
    private boolean estado = false;
    private int canal = 1;
    private int volume = 10;

    public void getAllState() {
        System.out.println();
        System.out.println("=============================================");
        System.out.println("TV está " + (estado ? "ligada" : "desligada"));
        if (estado) {
            System.out.println("Canal: " + canal);
            System.out.println("Volume: " + volume);
        }
        System.out.println("=============================================");
        System.out.println();
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    void powerOnOff(){
        estado = !estado;
    }
    void channelUp(){
        canal++;
    }
    void channelDown(){
        canal--;
    }
    void volumeUp(){
        volume++;
    }
    void volumeDown(){
        volume--;
    }
}
