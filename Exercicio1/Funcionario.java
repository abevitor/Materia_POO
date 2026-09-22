package Exercicio1;

class Funcionario{
    private double salario;
    private String rg;
    private String departamento;
    private String dataEntrada;
    private String nome;


    public Funcionario(double salario, String rg, String departamento, String dataEntrada, String nome) {
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



