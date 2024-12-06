package br.com.catolica.pastelaria.Contracts;

import br.com.catolica.pastelaria.Models.Produtos;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface ICliente {
    boolean reaizarpedido(ArrayList<Produtos> pedido);
}
