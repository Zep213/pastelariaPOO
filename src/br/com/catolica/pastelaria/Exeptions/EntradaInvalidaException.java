package br.com.catolica.pastelaria.Exeptions;

public class EntradaInvalidaException extends RuntimeException {
    public EntradaInvalidaException(String message) {
        super(message);
    }
}
