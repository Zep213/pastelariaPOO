package br.com.catolica.pastelaria.Contracts;

public interface IFuncionario {
    void realizarPagamentoPix(String descricao, double valor);
    void realizarPagamentoDebito(String descricao, double valor);
    void realizarPagamentoCredito(String descricao, double valor);
    void realizarPagamentoDinheiro(String descricao, double valor);
    void mostrarResumoPagamentos();
    void mostrarResumoPedidos();
}
