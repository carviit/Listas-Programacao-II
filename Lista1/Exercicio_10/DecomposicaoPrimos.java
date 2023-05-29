package Exercicio_10;

import java.util.Scanner;

public class DecomposicaoPrimos {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Decomposicao d = new Decomposicao();

        int numero = 0;

        System.out.println("\n===================== F A T O R A Ç Ã O =====================");

        System.out.print("\nDigite um número não PRIMO para realizar sua decomposição em fatores primos: ");

        numero = input.nextInt();

        System.out.println("\n===================== R E S U L T A D O =====================\n");

        d.impressaoVetores(d.decomporNumero(numero), numero);

        System.out.println();

        input.close();
    }
    
}
