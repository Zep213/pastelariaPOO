package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Contracts.ICliente;

import java.util.ArrayList;
import java.util.Map;

public class Cliente extends Pessoa implements ICliente {
    private double saldo_pix;
    private double saldo_dinheiro;
    private double saldo_credito;
    private double saldo_debito;
    private Map<String ,Produtos> pedido;

    public Cliente(String nome, String doc) {
        super(nome, doc);
    }

    public Cliente(String nome, String doc, double saldo_pix, double saldo_dinheiro, double saldo_credito, double saldo_debito, Map<String, Produtos> pedido) {
        super(nome, doc);
        this.saldo_pix = saldo_pix;
        this.saldo_dinheiro = saldo_dinheiro;
        this.saldo_credito = saldo_credito;
        this.saldo_debito = saldo_debito;
        this.pedido = pedido;
    }

    public Map<String, Produtos> getPedido() {
        return pedido;
    }

    public void setPedido(Map<String, Produtos> pedido) {
        this.pedido = pedido;
    }

    public double getSaldo_debito() {
        return saldo_debito;
    }

    public void setSaldo_debito(double saldo_debito) {
        this.saldo_debito = saldo_debito;
    }

    public double getSaldo_credito() {
        return saldo_credito;
    }

    public void setSaldo_credito(double saldo_credito) {
        this.saldo_credito = saldo_credito;
    }

    public double getSaldo_dinheiro() {
        return saldo_dinheiro;
    }

    public void setSaldo_dinheiro(double saldo_dinheiro) {
        this.saldo_dinheiro = saldo_dinheiro;
    }

    public double getSaldo_pix() {
        return saldo_pix;
    }

    public void setSaldo_pix(double saldo_pix) {
        this.saldo_pix = saldo_pix;
    }

    public void exibirResumo(Map<String ,Produtos> pedido){
        for(Produtos produto : this.pedido.values()){
            System.out.println(produto);
        }
    }


    @Override
    public boolean reaizarpedido(ArrayList<Produtos> pedido) {
        System.out.println();
        return false;
    }
}
