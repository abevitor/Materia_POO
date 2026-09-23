package Exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double velocidade = 0;
        boolean ligado = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o modelo do carro:");
        String modelo = scanner.nextLine();

        System.out.println("Digite a marca do carro:  ");
        String marca = scanner.nextLine();

        System.out.println("Deseja ligar o carro? S/N");
        String ligar = scanner.nextLine();

        Veiculo carro = new Veiculo(modelo, marca, velocidade, ligado);

        if (ligar.equalsIgnoreCase("s")) {
            carro.ligar();

        } else {
            carro.desligar();
        }

        if (carro.estaLigado()) {
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro está desligado.");
        }

        System.out.println("Digite quanto deseja acelerar:");
        double aceleracao = scanner.nextDouble();

        carro.acelerar(aceleracao);

        System.out.println("Velocidade atual: " + carro.getVelocidade());

        System.out.println("Digite quanto deseja frear:");
        double freio = scanner.nextDouble();

        carro.frear(freio);

        System.out.println("Velocidade após frear: " + carro.getVelocidade());

        System.out.println(carro);

    }

}
