package br.com.catolica.pastelaria.Contracts;

import br.com.catolica.pastelaria.Models.Delivery;
import br.com.catolica.pastelaria.Models.Produtos;

public interface IDelivery {
    void adicionarEntrega(Produtos entrega);
    void finalizarEntrega(Produtos entrega);
    void listarEntregas();
}
