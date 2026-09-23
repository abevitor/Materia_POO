package Exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite o ra");
        int ra = scanner.nextInt();

        System.out.println("Digite as 3 notas:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();



        
        Aluno aluno = new Aluno(nome, ra, nota1, nota2, nota3);

        aluno.calcularMedia();
        aluno.calcularMaiorNota();
        aluno.foiAprovado();

      

        
        

        System.out.println(aluno.foiAprovado());
        System.out.println(aluno.calcularMaiorNota());
        System.out.println(aluno);



    }
    
}
