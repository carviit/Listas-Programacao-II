package Exercicio_04;

import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int[][] tabela = new int[12][4];
       
        int jan = 0;
        int fev = 0;
        int mar = 0;
        int abr = 0;
        int mai = 0;
        int jun = 0;
        int jul = 0;
        int ago = 0;
        int set = 0;
        int out = 0;
        int nov = 0;
        int dez = 0;
        
        System.out.println("======================================================");
        
        for (int i = 0; i < 12; ++i) {
            
            for (int y = 0; y < 4; ++y) {
            
                System.out.print("Digite a quantidade de vendas da SEMANA " + (y + 1) + " no M\u00caS " + (i + 1) + ": ");
              
                tabela[i][y] = input.nextInt();
    
            }
            
            System.out.println("======================================================");
        }
        
        for (int y = 0; y < 4; ++y) {
            
            jan += tabela[0][y];
            fev += tabela[1][y];
            mar += tabela[2][y];
            abr += tabela[3][y];
            mai += tabela[4][y];
            jun += tabela[5][y];
            jul += tabela[6][y];
            ago += tabela[7][y];
            set += tabela[8][y];
            out += tabela[9][y];
            nov += tabela[10][y];
            dez += tabela[11][y];
        }
        
        System.out.println("\n =================== R E S U L T A D O S ===================\n");
       
        System.out.println("----- TOTAL DE VENDA EM CADA M\u1ebcS DO ANO -----\n");
        
        System.out.println("Janeiro: " + jan + " VENDAS");
        
        System.out.println("Fevereiro: " + fev + " VENDAS");
        
        System.out.println("Março: " + mar + " VENDAS");
        
        System.out.println("Abril: " + abr + " VENDAS");
        
        System.out.println("Maio: " + mai + " VENDAS");
        
        System.out.println("Junho: " + jun + " VENDAS");
       
        System.out.println("Julho: " + jul + " VENDAS");
        
        System.out.println("Agosto: " + ago + " VENDAS");
        
        System.out.println("Setembro: " + set + " VENDAS");
       
        System.out.println("Outubro: " + out + " VENDAS");
        
        System.out.println("Novembro: " + nov + " VENDAS");
        
        System.out.println("Dezembro: " + dez + " VENDAS");
       
        System.out.println("\n----- TOTAL DE VENDA EM CADA SEMANA DO ANO -----\n");
        
        int semana = 1;
        
        for (int i = 0; i < 12; ++i) {
            
            for (int y = 0; y < 4; ++y) {
                
                System.out.println("Semana " + semana + " : " + tabela[i][y] + " VENDAS");

                ++semana;
            }
        }
        
        System.out.println("\n----- TOTAL DE VENDAS NO ANO -----\n");
        
        int totalDeVendas = jan + fev + mar + abr + mai + jun + jul + ago + set + out + nov + dez;
        
        System.out.println("Vendas no ANO : " + totalDeVendas + " VENDAS");
        
        input.close();
    }
}