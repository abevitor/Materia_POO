package Exercicio6;

public class Aluno {
    private String nome;
    private int ra;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;

   

    public Aluno(String nome, int ra, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia(){

        media = (nota1 + nota2 + nota3) /3;
        return media;


    }

    public boolean foiAprovado(){


        if(media >= 6){
            return true;
        }else {
            return false;
        }
        
    }

    public double calcularMaiorNota() {
    double maior = nota1;

    if (nota2 > maior) {
        maior = nota2;
    }

    if (nota3 > maior) {
        maior = nota3;
    }

    return maior;
}

@Override
    public String toString() {
        return "Aluno: " + nome +
                "\nRa:  " + ra +
                "\nmedia  " + media;
               

    }


    
}
