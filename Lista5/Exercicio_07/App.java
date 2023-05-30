package Exercicio_07;

public class App {

    public static void main(String[] args) {

        Conta minhaConta = new Conta(100);

        minhaConta.deposita(100);

        minhaConta.setLimite(150);

        try {

            minhaConta.saca(50);

        } catch (Exception e) {

            double saldoAtual = minhaConta.getSaldo();

            System.out.println(e.getMessage());

            System.out.println("SALDO ATUAL: " + saldoAtual);

        }

    }

}
