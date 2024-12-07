package br.com.catolica.pastelaria.Contracts;

public interface IFuncionario {
    boolean realizarPagamentoPix(double valor);
    boolean realizarPagamentoDinheiro(double valor);
    boolean realizarPagamentoCredito(double valor);
    boolean realizarPagamentoDebito(double valor);
    boolean realizarPedido(String item, int quantidade);
    void mostrarResumoPagamentos();
    void mostrarResumoPedidos();
}
