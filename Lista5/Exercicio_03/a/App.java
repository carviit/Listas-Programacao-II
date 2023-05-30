package Exercicio_03.a;

import java.util.ArrayList;

import java.util.Random;

import java.util.Collections;

public class App {

    public static void main(String[] args){

        ArrayList<Integer> a = new ArrayList<Integer>();

        Random r = new Random();

        //Geração dos valores entre [0-99] e adição do mesmo no ARRAY LIST
    
        for(int i = 0; i < 50; i++){

            int numeroAleatorio = r.nextInt(100);

            a.add(numeroAleatorio);

        }

        //Menor número do ARRAY LIST usando a biblioteca Collections

        System.out.println("Menor número: " + Collections.min(a));

        //Percorre o ARRAY LIST para verificar quantas vezes o menor número apareceu
        
        int contador = 0;

        for (Integer numero : a) {

            if(numero == Collections.min(a)){

                contador++;
            }

        }

        System.out.println("\nO menor número (" + Collections.min(a) + ")" + " apareceu " + contador + " vezes no ARRAY LIST.");

         //Impressão do ARRAY LIST sem está ORDENADO

         System.out.println("\n");

         System.out.println(a);

         System.out.println("\n");

         //Ordenação do ARRAY LIST em ordem CRESCENTE e IMPRESSÃO do mesmo.

         Collections.sort(a);

         System.out.println(a);

     
    }

    
    
}
