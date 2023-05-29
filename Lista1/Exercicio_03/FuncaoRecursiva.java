package Exercicio_03;

import java.util.Scanner;

public class FuncaoRecursiva {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=====================================");

        System.out.print("Digite um número para calcular sua sequência: ");

        int numero = input.nextInt();

        System.out.println("=====================================");

        System.out.println("\nA sequência do número " + numero + " = " + FuncaoRecursiva.sequencia(numero) + "\n");

        input.close();
    }

    public static int sequencia(int num) {

        if (num == 1) {

            return 1;
        }

        if (num == 2) {

            return 2;
        }
        
        return 2 * FuncaoRecursiva.sequencia(num - 1) + 3 * FuncaoRecursiva.sequencia(num - 2);
    }
}