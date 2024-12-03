package br.com.catolica.pastelaria.Models;

public abstract class Pessoa {
    String nome;
    String doc;


    public Pessoa(String nome, String doc) {
        this.nome = nome;
        this.doc = doc;

    }

    public String getNome() {
        return nome;
    }

    public String getDoc() {
        return doc;
    }

}
