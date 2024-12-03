package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Enums.StatusPedido;


import java.util.Map;

public abstract class PedidoBase {
    private Cliente cliente;
    private StatusPedido status;

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

    @Override
    public String toString() {
        return "PedidoBase{" +
                "cliente=" + cliente +
                ", status=" + status +
                '}';
    }
}
