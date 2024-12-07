package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Contracts.IFuncionario;
import br.com.catolica.pastelaria.Enums.CargoFuncionario;
import br.com.catolica.pastelaria.Enums.StatusPedido;
import br.com.catolica.pastelaria.Exeptions.PagamentoException;

import java.util.ArrayList;

public class Funcionario extends Pessoa implements IFuncionario {
   private ArrayList<String> pagamentosPix = new ArrayList<>();
   private ArrayList<String> pagamentosDebito = new ArrayList<>();
   private ArrayList<String> pagamentosCredito = new ArrayList<>();
   private ArrayList<String> pagamentosDinheiro = new ArrayList<>();
   private ArrayList<Presencial> pedidos = new ArrayList<>();

   public Funcionario(String nome, String doc) {
      super(nome, doc);
   }

   @Override
   public void realizarPagamentoPix(String descricao, double valor) {
      if (valor > 0 && descricao != null) {
         pagamentosPix.add("Descrição: " + descricao + ", Valor: R$" + valor);
      }else {
         throw new PagamentoException("Valor invalido!");
      }
   }

   @Override
   public void realizarPagamentoDebito(String descricao, double valor) {
      if (valor > 0 && descricao != null){
         pagamentosDebito.add("Descricao: " + descricao + ", valor: R$" + valor);
      }
      else {
         throw new PagamentoException("Valor invalido!");
      }
   }

   @Override
   public void realizarPagamentoCredito(String descricao, double valor) {
      if (valor > 0 && descricao != null){
         pagamentosCredito.add("Descricao: " + descricao + ", valor: R$" + valor);
      }
      else {
         throw new PagamentoException("Valor invalido!");
      }
   }

   @Override
   public void realizarPagamentoDinheiro(String descricao, double valor) {
      if (valor > 0 && descricao != null){
         pagamentosDinheiro.add("Descricao: " + descricao + ", valor: R$" + valor);
      }
      else {
         throw new PagamentoException("Valor invalido!");
      }
   }
   @Override
   public void mostrarResumoPagamentos() {
      System.out.println("=== Resumo de Pagamentos ===");
      System.out.println("Pagamentos via Pix:");
      pagamentosPix.forEach(System.out::println);
      System.out.println("\nPagamentos via Débito:");
      pagamentosDebito.forEach(System.out::println);
      System.out.println("\nPagamentos via Crédito:");
      pagamentosCredito.forEach(System.out::println);
      System.out.println("\nPagamentos em Dinheiro:");
      pagamentosDinheiro.forEach(System.out::println);

   }

   @Override
   public void mostrarResumoPedidos() {
      System.out.println("--- Resumo de Pedidos ---");
      pedidos.forEach(System.out::println);
   }

}
