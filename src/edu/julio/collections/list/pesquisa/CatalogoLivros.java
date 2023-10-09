package edu.julio.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private final List<Livro> catalogo = new ArrayList<>();

    public void adicionarLivro(String nome, String autor, int ano) {
        catalogo.add(new Livro(nome, autor, ano));
    }
    public void pesquisarPorAutor(String autor) {
        if (!catalogo.isEmpty()) {
            for (Livro l : catalogo) {
                if (l.getAutor().equalsIgnoreCase(autor))
                    System.out.printf("Título: %s - Autor: %s - Ano: %d\n", l.getTitulo(), l.getAutor(), l.getAnoPublicado());
            }
        }
    }
    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        if (!catalogo.isEmpty()) {
            for (Livro l : catalogo) {
                if (l.getAnoPublicado() >= anoInicial && l.getAnoPublicado() <= anoFinal)
                    System.out.printf("Título: %s - Autor: %s - Ano: %d\n", l.getTitulo(), l.getAutor(), l.getAnoPublicado());
            }
        }
    }
    public void pesquisarPorTitulo(String titulo) {
        if (!catalogo.isEmpty()) {
            for (Livro l : catalogo) {
                if (l.getTitulo().equalsIgnoreCase(titulo))
                    System.out.printf("Título: %s - Autor: %s - Ano: %d\n", l.getTitulo(), l.getAutor(), l.getAnoPublicado());
            }
        }
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogo.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogo.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 1994);

        catalogo.pesquisarPorAutor("Autor 2");
        catalogo.pesquisarPorIntervaloAnos(2020, 2021);
        catalogo.pesquisarPorTitulo("Livro 1");
    }
}
