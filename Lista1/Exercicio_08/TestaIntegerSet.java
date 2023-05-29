package Exercicio_08;

import java.util.Scanner;

public class TestaIntegerSet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor1 = new int[10];

        int[] vetor2 = new int[10];

        int opc = 0;

        for (int i = 0; i < 10; ++i) {

            System.out.print("Digite um valor para o elemento do Vetor1[" + i + "]: ");

            vetor1[i] = input.nextInt();

            System.out.print("\nDigite um valor para o elemento do Vetor2[" + i + "]: ");

            vetor2[i] = input.nextInt();

            System.out.println();
        }
        IntegerSet v1 = new IntegerSet(vetor1);

        IntegerSet v2 = new IntegerSet(vetor2);

        do {

            int numero = 0;
            
            int i = 0;

            System.out.println("\n============= M E N U  DE  O P Ç Õ E S =============\n");

            System.out.println("1 ------- União do VETOR 1 e VETOR 2");

            System.out.println("2 ------- Interseção do VETOR 1 e VETOR 2");

            System.out.println("3 ------- Diferença entre o VETOR 1  e VETOR 2");

            System.out.println("4 ------- Exclusão de um ELEMENTO do VETOR 1");

            System.out.println("5 ------- Adição de um ELEMENTO no VETOR 1");

            System.out.println("6 ------- Converter o VETOR 1 para STRING");

            System.out.println("7 ------- FIM");

            System.out.print("\nDigite a opção desejada: ");

            opc = input.nextInt();

            if (opc == 1) {

                System.out.println("====================================================");

                System.out.print("\nVetor União = [");

                for (i = 0; i < 10; ++i) {
                    
                    if (i == 9) {

                        System.out.print(String.valueOf(v1.uniao(v1.getVetor(), v2.getVetor())[i]) + "]");
                        
                        continue;
                    }
                    
                    System.out.print(String.valueOf(v1.uniao(v1.getVetor(), v2.getVetor())[i]) + "," + " ");
                }
                
                System.out.println();
                
                continue;
            }
            
            if (opc == 2) {
                
                System.out.println("\n====================================================");
                
                System.out.print("\nVetor Interseção = [");
                
                for (i = 0; i < 10; ++i) {
                    
                    if (i == 9) {
                        System.out.print(String.valueOf(v1.intersecao(v1.getVetor(), v2.getVetor())[i]) + "]");
                        continue;
                    }
                    
                    System.out.print(String.valueOf(v1.intersecao(v1.getVetor(), v2.getVetor())[i]) + "," + " ");
                }
                
                System.out.println();
                continue;
            }
            
            if (opc == 3) {
                
                System.out.println("\n====================================================");
                
                System.out.print("\nVetor Diferença = [");
                
                for (i = 0; i < 10; ++i) {
                    
                    if (i == 9) {
                        System.out.print(String.valueOf(v1.diferenca(v1.getVetor(), v2.getVetor())[i]) + "]");
                        continue;
                    }
                    
                    System.out.print(String.valueOf(v1.diferenca(v1.getVetor(), v2.getVetor())[i]) + "," + " ");
                }
                
                System.out.println();
                
                continue;
            }
            if (opc == 4) {
                
                numero = 0;
                
                System.out.print("\nDigite o ELEMENTO que deseja EXCLUIR do VETOR 1: ");
               
                numero = input.nextInt();
               
                v1.excluirElemento(numero);
                
                continue;
            }
            if (opc == 5) {
                
                numero = 0;
                
                System.out.print("\nDigite o ELEMENTO que deseja ADICIONAR do VETOR 1: ");
                
                numero = input.nextInt();

                v1.inserirElemento(numero);

                continue;

            }

            if (opc != 6) continue;

            v1.converterBooleanParaString(v1.getVetor());

        } while (opc != 7);

        System.out.println();

        input.close();
    }
}