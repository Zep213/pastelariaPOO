package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Contracts.ICardapio;
import br.com.catolica.pastelaria.Enums.CategoriaProduto;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Menu implements ICardapio {

    private ArrayList<Produtos> produtos;

    public Menu() {}

    public void CardapioPastel() {
        produtos.add(new Pastel("Pastel_de_Carne", CategoriaProduto.PASTEL, 200, null, 45, 40));
        produtos.add(new Pastel("Pastel_de_Carne_de_Sol", CategoriaProduto.PASTEL, 230, null, 100, 40));
        produtos.add(new Pastel("Pastel_de_Pizza", CategoriaProduto.PASTEL, 250, null, 105, 40));
        produtos.add(new Pastel("Pastel_de_Misto", CategoriaProduto.PASTEL, 300, null, 130, 40));
        produtos.add(new Pastel("Pastel_de_Calabresa", CategoriaProduto.PASTEL, 260, null, 105, 40));
        produtos.add(new Pastel("Pastel_de_Frango", CategoriaProduto.PASTEL, 200, null, 100, 40));
        produtos.add(new Bebida("Coca-cola", CategoriaProduto.BEBIDA, 300, 450, false, false));
        produtos.add(new Bebida("Guarana", CategoriaProduto.BEBIDA, 300, 450, false, false));
        produtos.add(new Bebida("Cajuina", CategoriaProduto.BEBIDA, 300, 450, false, false));
        produtos.add(new Bebida("Franta-Laranja", CategoriaProduto.BEBIDA, 300, 450, false, false));
        produtos.add(new Bebida("Fanta-uva", CategoriaProduto.BEBIDA, 300, 450, false, false));

    }

    public ArrayList<Produtos> getProdutos() {
        return produtos;
    }


    @Override
    public void adicionarProduto(Produtos produto) {
        if (produto != null){
            produtos.add(produto);
        }
    }

    @Override
    public void mostrarCardapio() {
        for (Produtos produto : produtos) {
            System.out.println(produto);
        }
    }
}
