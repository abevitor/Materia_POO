package Exercicio5;
public class Lampada {
    private String marca;
    private double potencia;
    private boolean ligada;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }


    public Lampada(String marca, double potencia, boolean ligada) {
        this.marca = marca;
        this.potencia = potencia;
        this.ligada = ligada;
    }

    public void desligar(){
        ligada = false;
        System.out.println("A lampada esta desligada");
        
    }

    public void ligar(){
        ligada = true;
        System.out.println("A lampada esta ligada");
    }

    public boolean estaLigada(){
        return ligada;
    }

    @Override
    public String toString() {
        return "marca da lampada: " + marca +
                "\npotencia da lampada:  " + potencia +
                "\na lampada esta ligada?  " + ligada;
               

    }
    
}
