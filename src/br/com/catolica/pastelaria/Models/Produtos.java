package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Enums.CategoriaProduto;

import java.util.Map;

public abstract class Produtos {
    String nome;
    CategoriaProduto categoria;
    int quantidade;
    double preco;

    public Produtos(String nome, CategoriaProduto categoria, int quantidade, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", categoria=" + categoria +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
