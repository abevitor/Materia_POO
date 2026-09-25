package Exercicio8;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {

        if (preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero.");
        }

        if (estoque < 0) {
            throw new IllegalArgumentException("O estoque não pode ser negativo.");
        }

        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public int adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
        estoque += quantidade;
        return estoque;
    }

    public int retirarEstoque(int quantidade) {

        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }

        if (quantidade > estoque) {
            throw new IllegalArgumentException("Estoque insuficiente.");
        }
        estoque -= quantidade;
        return estoque;
    }

}
