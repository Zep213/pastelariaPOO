package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Enums.CategoriaProduto;

public class Bebida extends Produtos{
    private int mls;
    private double preco;
    private boolean gelo;
    private boolean limao;
    private String sabor;

    public Bebida(String nome, CategoriaProduto categoria, int mls, double preco, boolean gelo, boolean limao, String sabor) {
        super(nome, categoria);
        this.mls = mls;
        this.preco = preco;
        this.gelo = gelo;
        this.limao = limao;
        this.sabor = sabor;
    }

    public int getMls() {
        return mls;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isGelo() {
        return gelo;
    }

    public boolean isLimao() {
        return limao;
    }

    public String getSabor() {
        return sabor;
    }

    public void setGelo(boolean gelo) {
        this.gelo = gelo;
    }

    public void setLimao(boolean limao) {
        this.limao = limao;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "categoria: " + categoria +
                ", nome: '" + nome + '\'' +
                ", limao: " + limao +
                ", gelo: " + gelo +
                ", preco: " + preco +"R$"+
                ", mls: " + mls +
                '}';
    }
}
