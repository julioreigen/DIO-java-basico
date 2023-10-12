package edu.julio.collections.map.ordenacao;

import java.util.*;

public class LivrariaOnline {
    private final Map<String, Livro> livraria;

    public LivrariaOnline() {
        livraria = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livraria.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        if (!livraria.isEmpty()) {
            for (var entry : livraria.entrySet()) {
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    livraria.remove(entry.getKey());
                    break;
                }
            }
        }
    }

    public Map<String, Livro> exibirLivrosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livraria.entrySet());
        livrosParaOrdenarPorPreco.sort(new Livro.ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (var entry: livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> exibirLivrosPorAutor(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livraria.entrySet());
        livrosParaOrdenarPorAutor.sort(new Livro.ComparatorPorAutor());

        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for (var entry: livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double valorMaisCaro = Double.MIN_VALUE;

        for (var entry: livraria.entrySet()) {
            if (entry.getValue().getPreco() > valorMaisCaro) {
                valorMaisCaro = entry.getValue().getPreco();
                livroMaisCaro = new Livro(entry.getValue().getTitulo(), entry.getValue().getAutor(), entry.getValue().getPreco());
            }
        }
        return livroMaisCaro;
    }
    public Livro obterLivroMaisBarato() {
        Livro livrosMaisBarato = null;
        double valorMaisBarato = Double.MAX_VALUE;

        for (var entry: livraria.entrySet()) {
            if (entry.getValue().getPreco() < valorMaisBarato) {
                valorMaisBarato = entry.getValue().getPreco();
                livrosMaisBarato = new Livro(entry.getValue().getTitulo(), entry.getValue().getAutor(), entry.getValue().getPreco());
            }
        }
        return livrosMaisBarato;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosDoAutor = new TreeMap<>();
        for (var entry: livraria.entrySet()) {
            if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                livrosDoAutor.put(entry.getKey(), entry.getValue());
            }
        }
        return livrosDoAutor;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosPorPreco());

        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosPorAutor());

        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        System.out.println("Livros de " + autorPesquisa + ": " + livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa));

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livraria);

    }
}
