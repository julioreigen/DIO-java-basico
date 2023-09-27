package edu.julio.poo.fundamentos.gettersetter.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno joao = new Aluno();
        joao.setNome("João");
        joao.setIdade(8);
        joao.setSexo('M');

        System.out.println("O aluno " + joao.getNome() + " tem "
                + joao.getIdade() + " anos");
    }
}
