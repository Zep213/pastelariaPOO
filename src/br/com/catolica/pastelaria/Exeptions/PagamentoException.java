package br.com.catolica.pastelaria.Exeptions;

public class PagamentoException extends RuntimeException {
    public PagamentoException(String message) {
        super(message);
    }
}
