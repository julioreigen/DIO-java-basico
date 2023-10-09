package edu.julio.collections.set.basico;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c: convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.printf("Existem %d convidado(s) dentro do Set de Convidados.\n", conjuntoConvidados.contarConvidados());

        conjuntoConvidados.adicionarConvidado("Julio", 1001);
        conjuntoConvidados.adicionarConvidado("João", 1002);
        conjuntoConvidados.adicionarConvidado("Ana", 1002);
        conjuntoConvidados.adicionarConvidado("Yasmin", 1003);

        System.out.printf("Existem %d convidado(s) dentro do Set de Convidados.\n", conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1001);
        System.out.printf("Existem %d convidado(s) dentro do Set de Convidados.\n", conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();

    }
}
