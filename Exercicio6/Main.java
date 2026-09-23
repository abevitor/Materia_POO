package Exercicio6;

public class Main {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("Vitor", 3754, 2, 5, 5);

        aluno.calcularMedia();
        aluno.calcularMaiorNota();
        aluno.foiAprovado();

        System.out.println(aluno.foiAprovado());
        System.out.println(aluno.calcularMaiorNota());
        System.out.println(aluno);



    }
    
}
