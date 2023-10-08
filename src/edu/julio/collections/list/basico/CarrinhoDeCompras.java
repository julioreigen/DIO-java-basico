package edu.julio.collections.list.basico;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Caneta BIC", 4.42, 4);
        carrinho.adicionarItem("Borracha Texto", 1.50, 2);
        carrinho.adicionarItem("Caderno Death Note", 52.90, 1);
        carrinho.removerItem("Caneta Bic");

        System.out.println("Itens: " + carrinho.exibirItens());
        System.out.println("\nValor total do carrinho: R$" + carrinho.calcularValorTotal());

    }

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> listaDeRemocao = new ArrayList<>();
        if (!carrinho.isEmpty()) {
            for (Item i : carrinho) {
                if (i.getNome().equalsIgnoreCase(nome))
                    listaDeRemocao.add(i);
            }
            carrinho.removeAll(listaDeRemocao);
        } else
            System.out.println("A lista está vazia!");
    }

    public double calcularValorTotal() {
        double total = 0;
        if (!carrinho.isEmpty()) {
            for (Item i : carrinho) {
                total += i.getPreco() * i.getQuantidade();
            }
        }
        return total;
    }

    public String exibirItens() {
        if (!carrinho.isEmpty()) {
            return this.carrinho.toString();
        }
        return "O carrinho está vazio!";
    }
}
