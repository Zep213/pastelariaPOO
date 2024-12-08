package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Enums.StatusPedido;


import java.util.ArrayList;
import java.util.Map;

public abstract class PedidoBase {
    private Cliente cliente;
    private StatusPedido status;
    private ArrayList<Produtos> pedidos;

    public PedidoBase(Cliente cliente, StatusPedido status) {
        this.cliente = cliente;
        this.status = status;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Produtos> getPedidos() {
        return pedidos;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PedidoBase{" +
                "cliente=" + cliente +
                ", status=" + status +
                '}';
    }
}
