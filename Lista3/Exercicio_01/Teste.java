package Exercicio_01;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("============= C A D A S T R O    D O S   A N I M A I S =============");

        System.out.print("\nDigite o nome do PEIXE: ");

        Peixe p1 = new Peixe(input.nextLine());

        System.out.print("Digite o PESO do PEIXE: ");

        p1.setPeso(input.nextDouble());

        input.nextLine();

        System.out.print("Digite o HABITAT natural do PEIXE: ");

        p1.setTipoHabitat(input.nextLine());

        System.out.println("\n================= A N I M A L    C A D A S T R A D O =================");

        System.out.println(p1);

        System.out.print("\nDigite o nome do CACHORRO: ");

        Cachorro c1 = new Cachorro(input.nextLine());

        System.out.print("Digite o PESO do CACHORRO: ");

        c1.setPeso(input.nextDouble());

        input.nextLine();

        System.out.print("Digite a RAÇA do CACHORRO: ");

        c1.setRaca(input.nextLine());

        System.out.println("\n================= A N I M A L    C A D A S T R A D O =================");

        System.out.println(c1);

        input.close();
    }
    
}