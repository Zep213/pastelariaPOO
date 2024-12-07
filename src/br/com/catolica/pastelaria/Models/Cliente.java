package br.com.catolica.pastelaria.Models;

import br.com.catolica.pastelaria.Contracts.ICliente;
import br.com.catolica.pastelaria.Exeptions.EntradaInvalidaException;
import br.com.catolica.pastelaria.Exeptions.PagamentoException;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Cliente extends Pessoa implements ICliente {
    Produtos produtos;
    private double saldo_pix;
    private double saldo_dinheiro;
    private double saldo_credito;
    private double saldo_debito;
    private ArrayList<Produtos> pedido = new ArrayList<>();
    private double total_pedido;

    public Cliente(String nome, String doc) {
        super(nome, doc);
    }

    public Cliente(String nome, String doc, double saldo_pix, double saldo_dinheiro,
                   double saldo_credito, double saldo_debito, ArrayList<Produtos> pedido, double total_pedido) {
        super(nome, doc);
        this.saldo_pix = saldo_pix;
        this.saldo_dinheiro = saldo_dinheiro;
        this.saldo_credito = saldo_credito;
        this.saldo_debito = saldo_debito;
        this.pedido = pedido;
        this.total_pedido = total_pedido;
    }

    public ArrayList<Produtos> getPedido() {
        return pedido;
    }

    public double getSaldo_debito() {
        return saldo_debito;
    }

    public void setSaldo_debito(double saldo_debito) {
        this.saldo_debito = saldo_debito;
    }

    public double getSaldo_credito() {
        return saldo_credito;
    }

    public void setSaldo_credito(double saldo_credito) {
        this.saldo_credito = saldo_credito;
    }

    public double getSaldo_dinheiro() {
        return saldo_dinheiro;
    }

    public void setSaldo_dinheiro(double saldo_dinheiro) {
        this.saldo_dinheiro = saldo_dinheiro;
    }

    public double getSaldo_pix() {
        return saldo_pix;
    }

    public void setSaldo_pix(double saldo_pix) {
        this.saldo_pix = saldo_pix;
    }

    public double getTotal_pedido() {
        return total_pedido;
    }

    @Override
    public boolean reaizarPedido(ArrayList<Produtos> menu) {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){
            System.out.println("\n--- Cardapio ---");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i));
            }
            System.out.println("0. Finalizar Pedido");
            int escolha = input.nextInt();

            if (escolha == 0){
                continuar = false;
            } else if (escolha > 0 && escolha <= menu.size()) {
                Produtos produtoEscolhido = menu.get(escolha -1);
                pedido.add(produtoEscolhido);
                total_pedido += produtoEscolhido.getPreco();
                System.out.println("Adicionado: " + produtoEscolhido.getNome() + " R$" + produtoEscolhido.getPreco());
            }else{
                throw new EntradaInvalidaException("Digite uma opção valida!");
            }

        }
        return false;
    }

    @Override
    public void finalizarCompra(Funcionario funcionario) {
        System.out.println("--- Resumo do Pedido ---");
        for(Produtos produto : pedido){
            System.out.println(produto);
        }
        System.out.println("O valor da compra foi de " + total_pedido);

        Scanner input = new Scanner(System.in);
        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("1. Pix");
        System.out.println("2. Débito");
        System.out.println("3. Crédito");
        System.out.println("4. Dinheiro");
        int escolhaPagamento = input.nextInt();
        String descricao = "Compra total de R$" + totalCompra;

        switch (escolhaPagamento) {
            case 1 -> funcionario.realizarPagamentoPix(descricao, totalCompra);
            case 2 -> funcionario.realizarPagamentoDebito(descricao, totalCompra);
            case 3 -> funcionario.realizarPagamentoCredito(descricao, totalCompra);
            case 4 -> funcionario.realizarPagamentoDinheiro(descricao, totalCompra);
            default -> throw new PagamentoException("Forma de pagamento invalida");
        }
        System.out.println("Pagamento concluido com sucesso");

    }
}
