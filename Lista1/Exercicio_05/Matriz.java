package Exercicio_05;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        int j = 0;
        int i = 0;

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        
        System.out.println("===============================================");

        for (i = 0; i < 3; ++i) {

            for (j = 0; j < 3; ++j) {

                System.out.print("Digite o valor para a posição Matriz[" + i + "]" + "[" + j + "]: ");

                matriz[i][j] = input.nextInt();

                System.out.println();
            }
        }
        System.out.println("============= M A T R I Z    O R I G I N A L =============\n");

        for (i = 0; i < 3; ++i) {

            for (j = 0; j < 3; ++j) {

                System.out.print(String.valueOf(matriz[i][j]) + " ");
            }

            System.out.println();
        }
        System.out.println("\n============= M A T R I Z    R O T A C I O N A D A =============\n");

        for (i = 0; i < 3; ++i) {

            for (j = 2; j >= 0; --j) {

                System.out.print(String.valueOf(matriz[j][i]) + " ");
            }
            
            System.out.println();
        }
        input.close();
    }
}