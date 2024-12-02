package br.com.catolica.pastelaria.Models;

public abstract class Pessoa {
    String nome;
    String doc;
    String email;
    String cep;
    String telefone;

    public Pessoa(String nome, String doc, String email, String cep, String telefone) {
        this.nome = nome;
        this.doc = doc;
        this.email = email;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getDoc() {
        return doc;
    }

    public String getEmail() {
        return email;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }
}
