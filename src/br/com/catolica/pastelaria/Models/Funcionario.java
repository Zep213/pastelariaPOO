package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Contracts.IFuncionario;
import br.com.catolica.pastelaria.Enums.StatusPedido;

import java.util.ArrayList;

public class Funcionario extends Pessoa {


   public Funcionario(String nome, String doc) {
      super(nome, doc);
   }
}
