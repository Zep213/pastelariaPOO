package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Contracts.ICardapio;
import br.com.catolica.pastelaria.Enums.CategoriaProduto;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Menu implements ICardapio {
    private ArrayList<Produtos> itens;
    public Menu(){};
    public Menu(ArrayList<Produtos> itens) {
        this.itens = itens != null ? itens : new ArrayList<>();
    }

    public void Cardapio(){
        itens.add(new Pastel("Pastel_de_Carne", CategoriaProduto.PASTEL,200,null,125,40));
        itens.add(new Pastel("Pastel_de_Carne_de_Sol", CategoriaProduto.PASTEL,230,null,100,40));
        itens.add(new Pastel("Pastel_de_Pizza", CategoriaProduto.PASTEL,250,null,105,40));
        itens.add(new Pastel("Pastel_de_Misto", CategoriaProduto.PASTEL,300,null,130,40));
        itens.add(new Pastel("Pastel_de_Calabresa", CategoriaProduto.PASTEL,260,null,105,40));
        itens.add(new Pastel("Pastel_de_Frango", CategoriaProduto.PASTEL,200,null,100,40));
        itens.add(new Bebida("Coca-cola",CategoriaProduto.BEBIDA,300,450,false,false));
        itens.add(new Bebida("Guarana",CategoriaProduto.BEBIDA,300,450,false,false));
        itens.add(new Bebida("Cajuina",CategoriaProduto.BEBIDA,300,450,false,false));
        itens.add(new Bebida("Franta-Laranja",CategoriaProduto.BEBIDA,300,450,false,false));
        itens.add(new Bebida("Fanta-uva",CategoriaProduto.BEBIDA,300,450,false,false));

    }

    public ArrayList<Produtos> getItens(){
        return itens;
    }
}
