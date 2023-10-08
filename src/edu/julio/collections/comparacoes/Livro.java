package edu.julio.collections.comparacoes;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

// Classe 'Livro' que implementa Comparable
 class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private int ano;

    // Constructor
     public Livro(String titulo, String autor, int ano) {
         this.ano = ano;
         this.autor = autor;
         this.titulo = titulo;
     }

     // Ordenar livros por titulo (Comparable)
    public int compareTo(@NotNull Livro l) {
        return titulo.compareTo(l.titulo);
    }

     public String getTitulo() {
         return titulo;
     }

     public String getAutor() {
         return autor;
     }

     public int getAno() {
         return ano;
     }
 }

 // Classe para comparar Livro por ano (Comparator)
 class CompararAno implements Comparator<Livro> {
    @Override
     public int compare(Livro l1, Livro l2) {
        return Integer.compare(l1.getAno(), l2.getAno());
        /*
		if (l1.getAno() < l2.getAno())
			return -1;
		if (l1.getAno() > l2.getAno())
			return 1;
		else
			return 0;
		 */
    }
 }
 // Classe para comparar Ano
class CompararAutor implements Comparator<Livro> {
     @Override
     public int compare(Livro l1, Livro l2) {
         return l1.getAutor().compareTo(l2.getAutor());
     }
 }

 // Classe para comparar Ano, Autor e Titulo (Comparator)
class CompararAnoAutorTitulo implements Comparator<Livro> {
     @Override
     public int compare(Livro l1, Livro l2) {
         int ano = Integer.compare(l1.getAno(), l2.getAno());
         if (ano != 0)
             return ano;
         int autor = l1.getAutor().compareTo(l2.getAutor());
         if (autor != 0)
             return autor;
         return l1.getTitulo().compareTo(l2.getTitulo());
     }
 }
