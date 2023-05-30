package Exercicio_02;

public class Empregado extends Pessoa{

    private String matricula;
    private double salario;

    public double valorInss(){

        return (this.salario * 0.11);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
