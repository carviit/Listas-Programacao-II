package Exercicio_10.abcd;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Calculator calculadora = new Calculator();

        int opc = 0;

        do {

            System.out.println("\n====== M E N U  D E  O P E R A Ç Õ E S ======\n");

            System.out.println("1 ---- Divisão de dois números");
            System.out.println("2 ---- Logaritmo na base 10 de um número");
            System.out.println("3 ---- FIM");

            System.out.print("\nOPÇÃO: ");
            opc = input.nextInt();

            if (opc == 1) {

                System.out.print("\nDigite um número: ");
                double a = input.nextInt();

                System.out.print("Digite outro número: ");
                double b = input.nextInt();

                System.out.println("\n " + a + " / " + b + " = " + calculadora.div(a, b));

            } else if (opc == 2) {

                System.out.print("\nDigite um número para calcular seu log10: ");
                double a = input.nextInt();

                System.out.println("\nlog10 " + a + " = " + calculadora.log10(a));

            }

        } while (opc != 3);

        input.close();

    }

}
