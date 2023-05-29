package Exercicio_01;

import java.util.Scanner;

public class Salao
{
    public static void main(final String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int[][] tabela = new int[5][3];

        int manicure = 1;

        int i = 0;
        
        for (int j = 0; j < 5; ++j) {

            System.out.print("Digite a quantidade de \"pés\" realizado pela MANICURE " + manicure + ": ");

            tabela[i][0] = input.nextInt();

            System.out.print("\nDigite a quantidade de \"mãos\" realizado pela MANICURE " + manicure + ": ");

            tabela[i][1] = input.nextInt();

            System.out.print("\nDigite a quantidade de \"serviços\" realizado pela MANICURE " + manicure + ": ");

            tabela[i][2] = input.nextInt();

            System.out.println("=================================================================");

            ++i;

            ++manicure;
        }

        input.close();

        System.out.println("\n====== TABELA DE PREÇO ======\n");

        System.out.println("   MÃO -------- R$ 15,00");
        System.out.println("   PÉ ---------  R$ 10,00");
        System.out.println("   SERVIÇOS --- R$ 20,00");

        System.out.println("\n=============================");

        System.out.println("SERVIÇOS REALIZADOS PELAS MANICURES E RESPECTIVOS SALÁRIOS\n");

        manicure = 1;

        for (i = 0; i < 5; ++i) {

            double salario = 0.0;

            System.out.println("MANICURE " + manicure);

            System.out.println("\nPÉS = " + tabela[i][0]);
            System.out.println("MÃOS = " + tabela[i][1]);
            System.out.println("SERVIÇOS = " + tabela[i][2]);

            salario = (tabela[i][0] * 10 + tabela[i][1] * 15 + tabela[i][2] * 20) / 2;

            System.out.println("\nSALÁRIO = R$ " + salario);

            System.out.println("================================");
            
            ++manicure;
        }
    }
}
