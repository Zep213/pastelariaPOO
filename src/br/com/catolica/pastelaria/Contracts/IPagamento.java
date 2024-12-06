package br.com.catolica.pastelaria.Contracts;

public interface IPagamento {
    boolean realizarPagamentoPix(double valor);
    boolean realizarPagamentoDinheiro(double valor);
    boolean realizarPagamentoCredito(double valor);
    boolean realizarPagamentoDebito(double valor);
}
