package edu.julio.poo.fundamentos.enums;

public enum EstadoBrasileiro {
    // Estados disponíveis
    SALVADOR ("BA", "Bahia", 29),
    SAO_PAULO ("SP", "São Paulo", 35),
    PIAUI ("PI", "Piauí", 22),
    MARANHAO ("MA", "Maranhão", 21),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro", 33),
    MINAS_GERAIS ("MG", "Minas Gerais", 31),
    CEARA ("CE", "Ceará", 23),;

    private final String nome;
    private final String sigla;
    private final int ibge;

    EstadoBrasileiro(String sigla, String nome, int ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }
    public String getSigla(){
        return sigla;
    }
    public String getNome(){
        return nome;
    }
    public int getIbge(){
        return ibge;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }

}
