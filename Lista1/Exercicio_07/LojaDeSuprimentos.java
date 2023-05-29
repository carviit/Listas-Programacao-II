package Exercicio_07;

import java.util.Scanner;

public class LojaDeSuprimentos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        Invoice tecladoMecanico = new Invoice(456, "teclado gamer", 5, 89.9);
        
        int quantidade = 0;
        
        System.out.println("=========== C O M P R A   D E   P R O D U T O S ===========\n");
        
        System.out.println("Você está COMPRANDO \"Teclado Mecânico\"");
        
        System.out.print("\nDigite a quantidade desejada: ");
        
        quantidade = input.nextInt();
        
        if (quantidade > tecladoMecanico.getQuantidadeDoItem()) {
         
            System.out.println("\nNÃO temos essa QUANTIDADE em ESTOQUE\n");
        
        } else {
          
            tecladoMecanico.setQuantidadeDoItem(tecladoMecanico.getQuantidadeDoItem() - quantidade);
          
            System.out.printf("\nVocê COMPROU " + quantidade + " TECLADOS MEC\u00c2NICOS, o valor total \u00e9 de R$ %.2f", tecladoMecanico.getprecoDoItem() * (double)quantidade);
           
            System.out.println("\n\n============== R E S U M O    D O   P E D I D O ==============\n");
            
            System.out.println("- ID do item: " + tecladoMecanico.getNumeroDoItem());
            
            System.out.println("\n- Descrição: " + tecladoMecanico.getdescricaoDoItem());
           
            System.out.println("\n- Quantidade comprada: " + quantidade);
            
            System.out.println("\n- Valor Unitário: R$ " + tecladoMecanico.getprecoDoItem());
           
            System.out.println("===============================================================\n");
        
        }
       
        System.out.println("QUANTIDADE DE PRODUTO EM ESTOQUE: " + tecladoMecanico.getQuantidadeDoItem());
        
        input.close();
    }
}
