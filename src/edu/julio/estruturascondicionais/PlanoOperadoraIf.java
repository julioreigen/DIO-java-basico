package edu.julio.estruturascondicionais;

public class PlanoOperadoraIf {
    public static void main(String[] args) {
        String plano = "M"; // Básico, Mídia, Turbo

        if(plano.equals("B")) {
            System.out.println("100 minutos de chamadas e 5gb de dados");
        }else if(plano.equals("M")) {
            System.out.println("100 minutos de chamadas e 5gb de dados");
            System.out.println("WhatsApp e Instagram ilimitados");
        }else if(plano.equals("T")) {
            System.out.println("100 minutos de chamadas e 5gb de dados");
            System.out.println("WhatsApp e Instagram ilimitados");
            System.out.println("5Gb extra no Youtube");
        }
    }
}
