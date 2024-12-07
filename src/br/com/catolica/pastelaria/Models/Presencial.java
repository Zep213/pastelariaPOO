package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Enums.FormaDePagamento;
import br.com.catolica.pastelaria.Enums.StatusPedido;

import java.time.LocalDate;
import java.util.ArrayList;
public class Presencial extends PedidoBase{
    private FormaDePagamento pagamento;
    private String descricao;
    private LocalDate dataPedido;

    public Presencial(Cliente cliente, StatusPedido status, ArrayList<Produtos> pedidos, FormaDePagamento pagamento, String descricao, LocalDate dataPedido) {
        super(cliente, status, pedidos);
        this.pagamento = pagamento;
        this.descricao = descricao;
        this.dataPedido = dataPedido;
    }

    public FormaDePagamento getPagamento() {
        return pagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    @Override
    public String toString() {
        return "Presencial{" +
                "pagamento=" + pagamento +
                ", descricao='" + descricao + '\'' +
                ", dataPedido=" + dataPedido +
                '}';
    }
}
