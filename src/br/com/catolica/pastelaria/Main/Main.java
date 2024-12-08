package br.com.catolica.pastelaria.Main;

import br.com.catolica.pastelaria.Contracts.ICardapio;
import br.com.catolica.pastelaria.Enums.CategoriaProduto;
import br.com.catolica.pastelaria.Exeptions.EntradaInvalidaException;
import br.com.catolica.pastelaria.Models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produtos> cardapio = new ArrayList<>();
        cardapio.add(new Pastel("Pastel_de_Carne", CategoriaProduto.PASTEL, 200, null, 45, 40));
        cardapio.add(new Pastel("Pastel_de_Carne_de_Sol", CategoriaProduto.PASTEL, 230, null, 100, 40));
        cardapio.add(new Pastel("Pastel_de_Pizza", CategoriaProduto.PASTEL, 250, null, 105, 40));
        cardapio.add(new Pastel("Pastel_de_Misto", CategoriaProduto.PASTEL, 300, null, 130, 40));
        cardapio.add(new Pastel("Pastel_de_Calabresa", CategoriaProduto.PASTEL, 260, null, 105, 40));
        cardapio.add(new Pastel("Pastel_de_Frango", CategoriaProduto.PASTEL, 200, null, 100, 40));
        cardapio.add(new Bebida("Coca-cola", CategoriaProduto.BEBIDA, 300, 450, false, false));
        cardapio.add(new Bebida("Guarana", CategoriaProduto.BEBIDA, 300, 450, false, false));
        cardapio.add(new Bebida("Cajuina", CategoriaProduto.BEBIDA, 300, 450, false, false));
        cardapio.add(new Bebida("Franta-Laranja", CategoriaProduto.BEBIDA, 300, 450, false, false));
        cardapio.add(new Bebida("Fanta-uva", CategoriaProduto.BEBIDA, 300, 450, false, false));

        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        Cliente cliente = new Cliente("zep","1213132",300,500,230,500,null);
        boolean continuar = true;
        Funcionario funcionario = new Funcionario("zepao","80028922");
        while (continuar){
            try {
                System.out.println("\n--- Bem-vindo à Pastelaria ---");
                System.out.println("1. Listar Produtos");
                System.out.println("2. Fazer Pedido");
                System.out.println("3. Ver Pedidos");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");

                int opcao = input.nextInt();

                switch (opcao){
                    case 1:
                        menu.mostrarCardapio(cardapio);
                        break;
                    case 2:
                        cliente.realizarPedido(cardapio);
                        break;
                    case 3:
                        funcionario.mostrarResumoPedidos();
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opçao invalida. Tente novamente");
                        break;

                }
            }catch (EntradaInvalidaException e){
                System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
            }catch (Exception e){
                System.out.println("Erro inesperado:" + e.getMessage());
            }
        }
    }
}
