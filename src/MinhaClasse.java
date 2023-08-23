package src;

public class MinhaClasse {
    public static void main(String[] args) {
        String nome = "Julio César";
        String sobrenome = "de Brito";
        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);
    }
    static String nomeCompleto(String nome, String sobrenome){
        return nome + " " + sobrenome;
    }
}
