package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Enums.CategoriaProduto;

import java.util.Map;

public abstract class Produtos {
    String nome;
    CategoriaProduto categoria;



    public Produtos(String nome, CategoriaProduto categoria) {
        this.nome = nome;
        this.categoria = categoria;

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

    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
