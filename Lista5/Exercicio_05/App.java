package Exercicio_05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean t = true;

        while (t) {

            try {

                System.out.println("Eu sei dividir\n");

                System.out.print("Informe o primeiro valor: ");
                int x = teclado.nextInt();

                System.out.print("Informe o segundo valor: ");
                int y = teclado.nextInt();

                double r = (x / y);

                System.out.println("\n O resultado da divisão é " + r);

                t = false;

            } catch (InputMismatchException e) {

                System.out.println("\n>> Valores INVÁLIDOS, por favor INSIRA NOVAMENTE <<\n");
                teclado.nextLine();

            } catch (ArithmeticException e) {

                System.out.println("\n>> ERRO, divisão por (0), INSIRA VALORES NOVAMENTE <<\n");

            }

        }
        
        teclado.close();

    }
}
