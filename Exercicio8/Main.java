
package Exercicio8;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "Ana",
                "ana@email.com"
        );

        Cliente cliente2 = new Cliente(
                "Vitor",
                "Vitor@gmail.com"
        );

        Produto notebook = new Produto(
                "Notebook",
                3500.00,
                10
        );

        Produto mouse = new Produto(
                "Mouse",
                120.00,
                30
        );

        Produto teclado = new Produto(
                "Teclado",
                320.00,
                67
        );

        // Primeiro pedido da Ana
        Pedido pedido = new Pedido(cliente);

        pedido.adicionarItem(notebook, 1);
        pedido.adicionarItem(mouse, 2);
        pedido.adicionarItem(teclado, 1);

        // Pedido do Vitor
        Pedido pedido2 = new Pedido(cliente2);

        pedido2.adicionarItem(notebook, 2);
        pedido2.adicionarItem(teclado, 4);

        // Segundo pedido da Ana
        Pedido pedido3 = new Pedido(cliente);

        pedido3.adicionarItem(mouse, 10);
        pedido3.adicionarItem(teclado, 1);

        // Exibindo os pedidos
        System.out.println("===== PEDIDO 1 =====");
        pedido.exibirResumo();

        System.out.println("\n===== PEDIDO 2 =====");
        pedido2.exibirResumo();

        System.out.println("\n===== PEDIDO 3 =====");
        pedido3.exibirResumo();
    }
}

