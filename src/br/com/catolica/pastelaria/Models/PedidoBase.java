package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Enums.StatusPedido;


import java.util.ArrayList;
import java.util.Map;

public abstract class PedidoBase {
    private Cliente cliente;
    private StatusPedido status;
    private ArrayList<Produtos> pedidos;

    public PedidoBase(Cliente cliente, StatusPedido status,ArrayList<Produtos> pedidos) {
        this.cliente = cliente;
        this.status = status;
        this.pedidos = pedidos;
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

    @Override
    public String toString() {
        return "PedidoBase{" +
                "cliente=" + cliente +
                ", status=" + status +
                '}';
    }
}
