package Exercicio_03.b;

public class Empregados {

    private String id;
    private String nome;
    private double salario;
    private String dataDeContrato;

    public Empregados(String id, String nome, double salario, String dataDeContrato){

        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.dataDeContrato = dataDeContrato;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataDeContrato() {
        return dataDeContrato;
    }

    public void setDataDeContrato(String dataDeContrato) {
        this.dataDeContrato = dataDeContrato;
    }

    @Override
    public String toString() {
        
        return "Nome: " + nome + "\n" + 
               "ID: " + id + "\n" + 
               "Salário: R$ " + salario + "\n" +
               "Data de contrato: " + dataDeContrato;
    }



}
