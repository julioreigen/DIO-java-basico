package edu.julio.poo.fundamentos.construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("João",
                "123.456.789-10");

        joao.setEndereco("Rua da corte, 237");

        System.out.println(joao.getNome());
        System.out.println(joao.getCpf());
        System.out.println(joao.getEndereco());
    }
}
