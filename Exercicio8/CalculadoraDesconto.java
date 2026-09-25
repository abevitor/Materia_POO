package Exercicio8;

public class CalculadoraDesconto {

    public double calcularDesconto(Pedido pedido) {
        double total = pedido.calcularTotal();

        if (total >= 1000) {
            return total * 0.10;
        }

        return 0;
    }
}