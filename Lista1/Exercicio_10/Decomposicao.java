package Exercicio_10;

public class Decomposicao {

    public int decomporNumero(int x){

        int y = x;

        int valorPrimo = 2;

        int valores = 0;

        for(int i = 0; i <= y; i++){

            if(x % valorPrimo == 0){

                x /= valorPrimo;

                valores++;

            }

            else{

                valorPrimo++;

                valores++;

            }

            if(x == 1){

                break;
            }

        }

        return valores;

    }

    public void impressaoVetores(int total, int x){

        int y = x;

        int valorPrimo = 2;

        int[] vetor = new int[total];

        System.out.print("Vetor = [ ");

        for(int i = 0; i <= y; i++){


            if(x % valorPrimo == 0){

                vetor[i] = valorPrimo;

                System.out.print(vetor[i] + " ");

                x /= valorPrimo;

            }

            else{

                valorPrimo++;

            }

            if(x == 1){

                break;
            }

        }

        System.out.println("]");

    }
    
}
