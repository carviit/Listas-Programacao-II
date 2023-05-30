package Exercicio_08;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Digite um número: ");
            int a = input.nextInt();

            System.out.print("Digite outro número: ");
            int b = input.nextInt();

            divideNumeros(a, b);

        } catch (NumberFormatException e) {

            e.printStackTrace();

        }

        input.close();
    }

    public static void divideNumeros(int x, int y) {

        try {

            System.out.println("\n>> Resultado " + x + "/" + y + " = " + (x / y) + "\n");

        } catch (ArithmeticException e) {

            e.printStackTrace();

        }

    }

}
