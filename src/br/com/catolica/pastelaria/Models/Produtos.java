package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Enums.CategoriaProduto;

import java.util.Map;

public abstract class Produtos {
    private String nome;
    private CategoriaProduto categoria;
    private double preco;

    public Produtos(String nome, CategoriaProduto categoria,double preco) {
        this.nome = nome;
        this.categoria = categoria;
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

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
