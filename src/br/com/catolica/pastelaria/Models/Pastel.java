package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Enums.CategoriaProduto;
import br.com.catolica.pastelaria.Exeptions.EntradaInvalidaException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pastel extends Produtos{

    private int quantidade;
    private List<String> recheios;
    private double peso;
    private double preco;

    public Pastel(String nome, CategoriaProduto categoria, double peso, List<String> recheios,double preco, int quantidade) {
        super(nome, categoria);
        this.peso = peso;
        this.preco = preco;
        this.recheios = recheios != null ? new ArrayList<>(recheios) : new ArrayList<>();
        this.quantidade = quantidade;
    }


    public List<String> getRecheios(){
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
        if (recheio != null && !recheio.trim().isEmpty()){
            recheios.add(recheio);
            System.out.println("Recheio '" + recheio + "' adicionado com sucesso.");
        }else {
            throw new EntradaInvalidaException("Recheio invalido");
        }
    }
    public void removerRecheio(String recheio) {
        if (recheios.contains(recheio)) {
            recheios.remove(recheio);
            System.out.println("Recheio removido com sucesso");
        } else {
            System.out.println("Recheio não encontrado.");
        }
    }

    @Override
    public String toString() {
        return "Pastel{" +
                "categoria=" + categoria +
                ", nome='" + nome + '\'' +
                ", preco: " + preco + "R$" +
                ", peso: " + peso +
                ", recheios: " + recheios +
                ", quantidade: " + quantidade +
                '}';
    }

}
