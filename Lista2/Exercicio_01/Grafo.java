package Exercicio_01;

public class Grafo {

    private int vertice = 5;

    int matrizAdjacencia[][] = new int[vertice][vertice];

    public void adicionarAresta(int v1, int v2){

        this.matrizAdjacencia[v1 - 1][v2 - 1] = 1;

    }

    public void saoVizinhos(int v1, int v2){

        if(matrizAdjacencia[v1-1][v2-1] == 1){

            System.out.println("\n --- O vértice " + v1 + " é vizinho do vértice " + v2 + " ---");

        } else{

            System.out.println("\n --- Os vértices " + v1 + " e " + v2 + " NÃO são vizinhos ---");
            
        }

    }

    public void quaisSaoOsVizinhos(int vertice){

        System.out.print("\n --- Os vertíces vizinhos do vértice " + vertice + " são: ");

        for(int i = 0; i < 5; i ++){

            if(matrizAdjacencia[vertice-1][i] == 1){

                System.out.print((i+1) + " ");

            }

        }

        System.out.println(" ---");

    }

    public void verMatrizAdjacentes(){

        System.out.println("\n============ M A T R I Z   D E   A D J A C Ê N C I A ============\n");

        System.out.print("   ");

        for(int i = 0; i < 5; i++){

            System.out.print("[" + (i+1) + "]");

        }

        System.out.println();
       
        for(int i = 0; i < 5; i++){

            System.out.print("[" + (i+1) + "]" + " ");

            for (int j = 0; j < 5; j++){

                System.out.print(matrizAdjacencia[i][j]  + "  ");

            }

            System.out.println();

        }

    }

}
