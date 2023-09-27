package edu.julio.poo.fundamentos.construtores;

import org.jetbrains.annotations.NotNull;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    Pessoa(){}
    Pessoa(String nome, @NotNull String cpf) {
        this.nome = nome;
        if (cpf.length() == 11) {
            this.cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
        } else if (cpf.length() == 14 && cpf.contains(".") && cpf.contains("-")) {
            this.cpf = cpf;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
