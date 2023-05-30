package Exercicio_07;

public class Conta extends ContaExcecao {

    private double saldo;
    private int limite;

    public Conta(double saldo) {

        this.saldo = saldo;

    }

    void deposita(double saldo) {

        this.saldo += saldo;

    }

    void saca(double valor) throws ContaExcecao {

        if (valor < this.saldo) {

            throw new ContaExcecao();

        }

        this.saldo -= valor;

    }

    void setLimite(int limite) {

        this.limite = limite;

    }

    public double getSaldo() {
        return saldo;
    }

    public int getLimite() {
        return limite;
    }

}
