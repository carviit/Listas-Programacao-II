package Exercicio_02;

import java.util.Scanner;

public class Floricultura
{
    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        int opc = 0;

        final Planta[] planta = new Planta[50];

        final QuantidadeDePlantas totalDePlantas = new QuantidadeDePlantas();

        System.out.println("======== BEM VINDO  ========");

        do {

            System.out.println("\n-- Digite a opção desejada --\n");
            
            System.out.println("1 ---------- Cadastrar 50 Plantas");
            System.out.println("2 ---------- Venda de PLANTA");
            System.out.println("3 ---------- Ver PLANTAS com estoque abaixo do IDEAL");
            System.out.println("4 ---------- FIM");

            System.out.print("\nOPÇÃO: ");
            
            opc = input.nextInt();

            if (opc == 1) {

                if (totalDePlantas.getQuantidade() == 50) {

                    System.out.println("\nNão é possível cadastrar mais PLANTAS (LIMITE 50)");
                }

                else {

                    totalDePlantas.setQuantidade(50);

                    for (int i = 0; i < 50; ++i) {

                        planta[i] = new Planta();

                        input.nextLine();

                        System.out.print("\nDigite o NOME da PLANTA " + (i + 1) + ": ");

                        planta[i].setNome(input.nextLine());

                        System.out.print("Digite o ESTOQUE IDEAL da PLANTA " + (i + 1) + ": ");

                        planta[i].setEstoqueIdeal(input.nextInt());

                        System.out.print("Digite a QUANTIDADE da PLANTA " + (i + 1) + ": ");

                        planta[i].setQuantidadeEmEstoque(input.nextInt());

                        System.out.println("\n=====================================");
                    }
                }
            }

            else if (opc == 2) {

                int codigo = 0;

                int quantidade = 0;

                if (totalDePlantas.getQuantidade() == 50) {

                    System.out.println();

                    for (int j = 0; j < 50; ++j) {

                        System.out.println("PLANTA " + (j + 1) + "\n");

                        System.out.println("NOME: " + planta[j].getNome());

                        System.out.println("QUANTIDADE EM ESTOQUE: " + planta[j].getQuantidadeEmEstoque());

                        System.out.println("CÓDIGO DA PLANTA: " + j);

                        System.out.println("===========================");
                    }
                    System.out.print("Digite o código da PLANTA que deseja vender: ");

                    codigo = input.nextInt();

                    System.out.print("\nDigite a quantidade que deseja vender: ");

                    quantidade = input.nextInt();

                    planta[codigo].setQuantidadeEmEstoque(planta[codigo].getQuantidadeEmEstoque() - quantidade);
                }
                else {

                    System.out.println("\n============================");

                    System.out.println("NÃO HÁ PLANTAS CADASTRADAS");

                    System.out.println("============================");
                }
            }
            else {

                if (opc != 3) {

                    continue;
                }
                
                if (totalDePlantas.getQuantidade() == 50) {

                    System.out.println("\n===== PLANTAS COM ESTOQUE ABAIXO DO IDEAL ====== ");

                    for (int i = 0; i < 50; ++i) {

                        if (planta[i].getQuantidadeEmEstoque() < planta[i].getEstoqueIdeal()) {

                            System.out.println("\n NOME: " + planta[i].getNome());

                            System.out.println("QUANTIDADE = " + planta[i].getQuantidadeEmEstoque());

                            System.out.println("ESTOQUE IDEAL: " + planta[i].getEstoqueIdeal());
                            
                            System.out.println("============================================");
                        }
                    }
                }
                else {

                    System.out.println("\n============================");

                    System.out.println("NÃO HÁ PLANTAS CADASTRADAS");

                    System.out.println("============================");
                }
            }

        } while (opc != 4);

        input.close();
    }
}
