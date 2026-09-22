package Exercicio2;

public class Main {
    public static void main(String[] args) {
        
        Casa casa = new Casa();

        casa.setPorta1(false);
        casa.setPorta2(true);
        casa.setPorta3(true);

        System.out.println(casa.quantasPortasEstaoAbertas());
    }
    
}
