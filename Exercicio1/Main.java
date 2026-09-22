package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cabrunco:");
        String nome = scanner.nextLine();

        System.out.println("Digite quando ele entrou na empresa. Ex: 14/04/2005");
        String entrada = scanner.nextLine();

        System.out.println("Digite o departamento que ele pertence:");
        String depart = scanner.nextLine();

        System.out.println("Digite o salario do cabrunco:");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o rg do cabrunco");
        String rg = scanner.nextLine();

       




        Funcionario func1 = new Funcionario(
                salario,
                rg,
                depart,
                entrada,
                nome);


                func1.receberAumento(400);
                 double ganhoAnual = func1.calculaGanhoAtual();

                System.out.println(func1);
                System.out.println("Seu ganho anual é de: " + ganhoAnual);

    }

}
