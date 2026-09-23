package Exercicio4;

public class Main {
    public static void main(String[] args) {

        String titular = "";
        double saldo = 0.0;
        int numero = 0;


        Conta conta = new Conta(numero, titular, saldo);
        conta.setTitular("jhonsons");
        conta.depositar(100);
        conta.setSaldo(128312);
        conta.sacar(10000);
        conta.consultarSaldo();

        System.out.println(conta);
    }
    
}
