package edu.julio.collections.set.pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        if (numero.matches("[0-9]+"))
            this.numero = numero;
        else
            this.numero = null;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String numero) {
        if (!numero.contains("[a-zA-Z]+"))
            this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome()) && Objects.equals(getNumero(), contato.getNumero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumero());
    }

    @Override
    public String toString() {
        return "{" + nome + ", " + numero + "}";
    }
}
