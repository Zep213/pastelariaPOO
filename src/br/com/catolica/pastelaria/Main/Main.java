package br.com.catolica.pastelaria.Main;

import br.com.catolica.pastelaria.Enums.CategoriaProduto;
import br.com.catolica.pastelaria.Models.Pastel;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pastel pas = new Pastel("Pastel de carne", CategoriaProduto.PASTEL,300, Arrays.asList("carne","azeitona"),6.50);
        pas.exibirDetalhes();
    }
}
