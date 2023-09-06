package edu.julio.sintaxe.sextasecao;

public class SobreMim {
    public static void main(String[] args) {
        //the arguments start with index 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

        System.out.println("Oi, meu nome é " + nome + " " + sobrenome);
        System.out.println("Eu tenho " + idade + " anos");
        System.out.println("Eu tenho " + altura + " cm de altura.");
    }
}

