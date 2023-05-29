package Exercicio_10.e;

public class Calculator {

    public double div(double a, double b) throws InvalidOperationException {

        if (b == 0) {

            throw new InvalidOperationException("\n>>ERRO, DIVISÃO POR ZERO");

        }

        return a / b;
    }

    public double log10(double x) throws InvalidOperationException {

        if (x <= 0) {

            throw new InvalidOperationException("\n>>ERRO, VALOR INSERIDO INVÁLIDO");
        }

        return Math.log10(x);
    }

}
