package edu.julio.estruturascondicionais;

public class PlanoOperadoraSwitch {
    public static void main(String[] args) {
        String plano = "M"; // Básico, Mídia, Turbo

        switch (plano) {
            case "T": {
                System.out.println("5Gb extra no Youtube");
            }
            case "M": {
                System.out.println("WhatsApp & Instagram ilimitados");
            }
            case "B": {
                System.out.println("100 minutos de chamadas e 5gb de dados");
            }
        }
    }
}
