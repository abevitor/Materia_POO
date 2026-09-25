package Exercicio8;

public class Cliente {
    private String nome;
    private String email;

     public Cliente(String nome, String email){

        if(nome.isBlank()){
            throw new IllegalArgumentException("O nome não pode ser vazio");

        }

        if(email.isBlank()){
            throw new IllegalArgumentException("O email não pode ser vazio");

        }
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

   
    
}
