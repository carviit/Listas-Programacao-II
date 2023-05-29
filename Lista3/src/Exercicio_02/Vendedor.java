package Exercicio_02;

public class Vendedor extends Empregado{

    private double valorVendas;
    private int qntVendas;
    
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }
    
    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    @Override
    public String toString(){

        return "\n======== D A D O S  DO  V E N D E D O R ========\n"
        +"\n" + "Nome: " + getNome() 
        + "\n" + "Salário: R$" + String.valueOf(getSalario())
        +"\n" + "Valor das vendas: R$" + String.valueOf(this.valorVendas)
        +"\n" + "Quantidade de vendas: " + String.valueOf(this.qntVendas);

    }

}
