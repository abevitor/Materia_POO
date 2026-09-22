package Exercicio1;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
public String toString() {
    return dia + "/" + mes + "/" + ano;
}

}

class Funcionario{
    private double salario;
    private String rg;
    private String departamento;
    private Data dataEntrada;
    private String nome;
   
    public Funcionario(double salario, String rg, String departamento, Data dataEntrada, String nome) {
        this.salario = salario;
        this.rg = rg;
        this.departamento = departamento;
        this.dataEntrada = dataEntrada;
        this.nome = nome;
    }

    public void receberAumento(double aumento){
        salario += aumento;
    }

    public double calculaGanhoAtual() {
        
        return salario * 12;
    }

    @Override
public String toString() {
    return "Nome: " + nome +
           "\nDepartamento: " + departamento +
           "\nSalário: " + salario +
           "\nRG: " + rg +
           "\nData de entrada: " + dataEntrada;
}

    


}




