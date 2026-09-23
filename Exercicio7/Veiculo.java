package Exercicio7;

public class Veiculo {
    private String modelo;
    private String marca;
    private double velocidade;
    private boolean ligado;

    public Veiculo(String modelo, String marca, double velocidade, boolean ligado) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidade = velocidade;
        this.ligado = ligado;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public double acelerar(double valor) {

        velocidade = velocidade + valor;

        return velocidade;

    }

    public double frear(double valor) {
        if (valor >= velocidade) {
            velocidade = 0;
        } else {
            velocidade -= valor;
        }

        return velocidade;
    }

    public boolean estaLigado() {
        return ligado;
    }

    public double getVelocidade() {
        return velocidade;
    }

    @Override
    public String toString() {
        return "modelo: " + modelo +
                "\nmarca:  " + marca;
    }

}
