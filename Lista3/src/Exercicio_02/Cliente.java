package Exercicio_02;

public class Cliente extends Pessoa{

    private double valorDivida;
    private int anoNascimento;

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
    
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString(){

        return "\n========= D A D O S  DO  C L I E N T E =========\n"
        +"\n" + "Nome: " + getNome()
        + "\n" + "Idade: " + String.valueOf(getIdade())
        + "\n" + "Sexo: " + String.valueOf(getSexo())
        + "\n" + "Valor da Dívida: R$ " + String.valueOf(this.valorDivida)
        +"\n" + "Ano de nascimento: " + String.valueOf(this.anoNascimento);
    
    }
    
}
