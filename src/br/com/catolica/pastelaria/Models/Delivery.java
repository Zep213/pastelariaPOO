package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Contracts.IDelivery;
import br.com.catolica.pastelaria.Enums.StatusPedido;
import br.com.catolica.pastelaria.Exeptions.EntradaInvalidaException;

import java.util.ArrayList;

public class Delivery extends PedidoBase implements IDelivery {
    private StatusPedido status;
    private String endereco;
    private double valor;
    private boolean finalizada = false;
    private String descricao;
    private int idEntrega;
    private ArrayList<Produtos> pedidoDelivery = new ArrayList<>();


    public Delivery(Cliente cliente, StatusPedido status, ArrayList<Produtos> pedidos, StatusPedido status1, String endereco, double valor, boolean finalizada, String descricao, int idEntrega) {
        super(cliente, status, pedidos);
        this.status = status;
        this.endereco = endereco;
        this.valor = valor;
        this.finalizada = finalizada;
        this.descricao = descricao;
        this.idEntrega = idEntrega;
    }

    @Override
    public StatusPedido getStatus() {
        return status;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getIdEntrega() {
        return idEntrega;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "status=" + status +
                ", endereco='" + endereco + '\'' +
                ", valor=" + valor +
                ", finalizada=" + (finalizada ? "Sim" : "Não") +
                ", descricao='" + descricao + '\'' +
                ", idEntrega=" + idEntrega +
                '}';
    }

    @Override
    public void adicionarEntrega(Produtos entrega) {
        if (entrega != null) {
            pedidoDelivery.add(entrega);
            System.out.println("Entrega adicionada!");
        }else {
            throw new EntradaInvalidaException("Pedido invalido!");
        }
    }

    @Override
    public void finalizarEntrega(Produtos entrega) {
        if (!pedidoDelivery.contains(entrega)){
            System.out.println("Entrega não encontrada!");
            return;
        }else{
            System.out.println("Entrega de "+ getCliente()+ "foi finalizada com sucesso!");
            finalizada = true;
        }

    }

    @Override
    public void listarEntregas() {
        System.out.println("\n=== Lista de Entregas ===");
        for (Produtos entrega : pedidoDelivery) {
            System.out.println(entrega);
        }
    }
}
