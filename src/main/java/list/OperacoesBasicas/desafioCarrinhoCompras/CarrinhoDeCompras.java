package main.java.list.OperacoesBasicas.desafioCarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List <Item> compras = new ArrayList<>();



    public void adicionarItem(String nome, double preco, int quantidade){
        compras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List <Item> itensRemovidos = new ArrayList<>();

        for (Item i: compras) {
            if (i.getNome().equalsIgnoreCase(nome)){
                itensRemovidos.add(i);
            }
        compras.removeAll(itensRemovidos);

        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;
        for (Item i: compras) {
            valorTotal = valorTotal + i.getPreco() * i.getQuantidade();
        }
            return valorTotal;
    }

    public void exibirItens(){
        System.out.println(compras.toString());
    }

    public static void main(String[] args) {

        CarrinhoDeCompras compra1 = new CarrinhoDeCompras();

        compra1.adicionarItem("Sabão", 2.00, 3);
        compra1.exibirItens();
        compra1.adicionarItem("Papel Higiênico", 5.00, 3);
        compra1.exibirItens();
        compra1.removerItem("Sabão");
        compra1.exibirItens();
        System.out.println(compra1.calcularValorTotal());
    }
}
