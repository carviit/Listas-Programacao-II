package Exercicio_01;

import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);

    public void menu(Grafo grafo){

        int opc = 0;

        do{

            System.out.println("\n============ T E S T A    G R A F O ============\n");


            System.out.println("1 ----- Verificar a vizinhança de dois VÉRTICES");

            System.out.println("2 ----- Verificar a vizinhança de um VÉRTICE");

            System.out.println("3 ----- Mostrar MATRIZ de ADJACÊNCIA");

            System.out.println("4 ----- FIM\n");

            System.out.print("Digite a OPÇÃO desejada: ");

            opc = input.nextInt();

            opc(grafo, opc);

        }while(opc != 4);

    }

    public void opc(Grafo grafo, int opcao){

        

        if(opcao == 1){

            int vert1 = 0, vert2 = 0;

            System.out.println("================================================");

            System.out.print("\nDigite o valor do VÉRTICE 1: ");

            vert1 = input.nextInt();

            System.out.print("\nDigite o valor do VÉRTICE 2: ");

            vert2 = input.nextInt();

            grafo.saoVizinhos(vert1, vert2);

        } else if(opcao == 2){

            int vertice = 0;

            System.out.println("================================================");

            System.out.print("\nDigite o valor do VÉRTICE: ");

            vertice = input.nextInt();

            grafo.quaisSaoOsVizinhos(vertice);
            
          
        } else if(opcao == 3){

            grafo.verMatrizAdjacentes();

        }else if(opcao < 1 || opcao > 4){

            System.out.println("\n================ OPÇÃO INVÁLIDA ================");

        }

    }
    
}
