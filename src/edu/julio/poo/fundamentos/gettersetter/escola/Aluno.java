package edu.julio.poo.fundamentos.gettersetter.escola;

public class Aluno {
    private String nome;
    private int idade = 0;
    private char sexo;

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F')
            this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }
}
