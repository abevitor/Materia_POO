package Exercicio5;
public class Main {
    public static void main(String[] args) {

        String marca = "";
        double potencia = 0.0;
        boolean ligada = true;

       
        Lampada lampada = new Lampada(marca, potencia, ligada);

        lampada.ligar();
        lampada.setMarca("jhonsonsbabylampadas");
        lampada.setPotencia(40);

        System.out.println(lampada);





        

    }

    
}
