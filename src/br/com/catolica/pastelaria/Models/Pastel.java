package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Enums.CategoriaProduto;

import java.util.List;

public class Pastel extends Produtos{

    int quantidade;
    List<String> recheios;
    double peso;
    double preco;

    public Pastel(String nome, CategoriaProduto categoria, double peso, List<String> recheios,double preco) {
        super(nome, categoria);
        this.peso = peso;
        this.recheios = recheios;
        this.preco = preco;
    }

    public List<String> getRecheios() {
        return recheios;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void adicionarRecheio(String recheio) {
        if (recheio != null && !recheio.isEmpty()) {
            recheios.add(recheio);
        } else {
            throw new IllegalArgumentException("Recheio inválido.");
        }
    }
    public void removerRecheio(String recheio) {
        recheios.remove(recheio);
    }
    public void exibirDetalhes() {
        System.out.println("Pastel: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Recheios: " + String.join(", ", recheios));
        System.out.println("Peso: " + peso + "g");
    }
}
