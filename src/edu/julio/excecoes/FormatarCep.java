package edu.julio.excecoes;

public class FormatarCep {
    public static void main(String[] args) throws CepInvalidoException {
        try {
            String meuCEP = formatarCEP("4896700");
            System.out.println(meuCEP);
        } catch (CepInvalidoException e) {
            System.out.println("Código CEP inválido (Deve ser 8 dígitos.)");
        }
    }
    static String formatarCEP(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        // Return formatted zip
        String primeirosDigitos = cep.substring(0, 5);
        String ultimosDigitos = cep.substring(5, 8);
        return primeirosDigitos + "-" + ultimosDigitos;
    }
}
