package br.com.catolica.pastelaria.Contracts;

import br.com.catolica.pastelaria.Models.Produtos;

import java.util.ArrayList;

public interface ICardapio {
    void adicionarProduto(Produtos produto);
    void mostrarCardapio();
}
