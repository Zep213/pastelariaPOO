package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Enums.CategoriaProduto;

public class Bebida extends Produtos{
    private int mls;
    private boolean gelo;
    private boolean limao;


    public Bebida(String nome, CategoriaProduto categoria, int mls, double preco, boolean gelo, boolean limao) {
        super(nome, categoria,preco);
        this.mls = mls;
        this.gelo = gelo;
        this.limao = limao;
    }

    public int getMls() {
        return mls;
    }

    public boolean isGelo() {
        return gelo;
    }

    public boolean isLimao() {
        return limao;
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
                "categoria: " + getCategoria() +
                ", nome: '" + getNome() + '\'' +
                ", limao: " + limao +
                ", gelo: " + gelo +
                ", preco: " + getPreco() +"R$"+
                ", mls: " + mls +
                '}';
    }
}
