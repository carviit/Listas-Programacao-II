package Exercicio_10.e;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Calculator calculadora = new Calculator();

        int opc = 0;

        do {
            try {

                System.out.println("\n====== M E N U  D E  O P E R A Ç Õ E S ======\n");

                System.out.println("1 ---- Divisão de dois números");
                System.out.println("2 ---- Logaritmo na base 10 de um número");
                System.out.println("3 ---- FIM");

                System.out.print("\nOPÇÃO: ");
                opc = input.nextInt();

            } catch (InputMismatchException e) {

                System.out.println("\n\n>>ERRO, VALORES INVÁLIDOS");
                input.nextLine();

                e.printStackTrace();

            }

            if (opc == 1) {

                try {

                    System.out.print("\nDigite um número: ");
                    double a = input.nextInt();

                    System.out.print("Digite outro número: ");
                    double b = input.nextInt();

                    System.out.println("\n " + a + " / " + b + " = " + calculadora.div(a, b));

                } catch (Exception e) {

                    System.out.println(e.getMessage());

                    e.printStackTrace();

                }

            } else if (opc == 2) {

                try {

                    System.out.print("\nDigite um número para calcular seu log10: ");
                    double a = input.nextInt();

                    System.out.println("\nlog10 " + a + " = " + calculadora.log10(a));

                } catch (Exception e) {

                    System.out.println(e.getMessage());

                    e.printStackTrace();

                }

            }

        } while (opc != 3);

        input.close();

    }

}
