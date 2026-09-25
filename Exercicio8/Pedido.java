package Exercicio8;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
    }

    public void exibirResumo() {

    System.out.println("Cliente: " + cliente.getNome());

    for (ItemPedido item : itens) {
        item.exibirItem();
    }

    System.out.println("Total: R$ " + calcularTotal());
}

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
