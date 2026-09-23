package Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean disponivel = true;

        
        double preco = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("titulo do livro que voce procura:");
        String titulo = scanner.nextLine();

        System.out.println("Nome do autor do livro:");
        String autor = scanner.nextLine();
        Livro livro = new Livro(titulo,
            autor,
            preco,
            disponivel
        );

        scanner.close();

        livro.emprestar();
        livro.devolver();
        System.out.println(livro.estaDisponivel());
    
}
    
}
