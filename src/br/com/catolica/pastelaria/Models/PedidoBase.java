package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Enums.StatusPedido;


import java.util.Map;

public abstract class PedidoBase {
    private Cliente cliente;
    private Map<Produtos, Integer> itens;
    private double valorPedido;
    private StatusPedido status;

    public PedidoBase(Cliente cliente, Map<Produtos, Integer> itens, double valorPedido, StatusPedido status) {
        this.cliente = cliente;
        this.itens = itens;
        this.valorPedido = valorPedido;
        this.status = status;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "PedidoBase{" +
                "cliente=" + cliente +
                ", itens=" + itens +
                ", valorPedido=" + valorPedido +
                ", status=" + status +
                '}';
    }
}
