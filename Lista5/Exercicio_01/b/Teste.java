package Exercicio_01.b;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opc = 0;

        String nome;
        int id = 0;
        double preco = 0;

        Set<Produto> Produtos = new HashSet<Produto>();

        do {

            System.out.println("\n============= I N S E R Ç Ã O  D E   P R O D U T O S ===========");

            System.out.print("Nome: ");
            nome = input.nextLine();

            System.out.print("ID: ");
            id = input.nextInt();
            input.nextLine();

            System.out.print("Preço: R$ ");
            preco = input.nextDouble();
            input.nextLine();

            Produto produto = new Produto(nome, id, preco);

            if (!Produtos.contains(produto)) {

                Produtos.add(produto);

            } else {

                System.out.println("\n>> ERRO, PRODUTO JÁ SE ENCONTRA CADASTRADO NO SISTEMA <<");

            }

            System.out.println("\nINSERIR MAIS PRODUTOS");
            System.out.println("1 ----- SIM");
            System.out.println("2 ----- NÃO");

            System.out.print("\nOPÇÃO: ");
            opc = input.nextInt();
            input.nextLine();

        } while (opc != 2);

        int i = 1;

        for (Produto produto : Produtos) {

            System.out.println("\n====== PRODUTO " + i + " ======");

            System.out.println(produto);

            i++;

        }

        input.close();

    }
}
