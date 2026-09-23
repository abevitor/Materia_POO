package Exercicio3;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;
    private boolean disponivel;

    public Livro(String titulo, String autor, double preco, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public void emprestar(){
        disponivel = false;
    }

    public void devolver(){
        disponivel = true;
    }

    public boolean estaDisponivel(){
        return disponivel;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo +
                "\nautor: " + autor +
                "\npreco: " + preco +
                "\ndisponibilidade: " + disponivel;

    }

}
