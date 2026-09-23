package Exercicio4;

public class Conta {
    private int numero;
    private String titular;
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    private double saldo;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

 public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

 void depositar(double valor){

    saldo +=valor;
 }

 double sacar(double valor){
    if(valor <= saldo){
        saldo -= valor;
      return valor;
    }else {
        System.out.println("Saldo insuficiente");
      return 0;
    }
 }

 double consultarSaldo(){
    return saldo;
 }

 @Override
    public String toString() {
        return "numero da conta: " + numero +
                "\ntitular: " + titular +
                "\nsaldo: " + saldo;
               

    }

 
    
}
