package Exercicio_01.a;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Teste {
  public static void main(String[] args) throws Exception {

    Scanner input = new Scanner(System.in);

    int opc = 0;

    String nome;

    Set<String> nomes = new HashSet<String>();

    System.out.println("============= I N S E R Ç Ã O  D E  N O M E S ===========");

    do {

      System.out.print("Nome: ");
      nome = input.nextLine();

      nomes.add(nome);

      System.out.println("\nINSERIR MAIS NOMES\n");

      System.out.println("1 --- SIM");
      System.out.println("2 --- NÃO");

      System.out.print("\nOPCÃO: ");
      opc = input.nextInt();

      input.nextLine();

      System.out.println();

    } while (opc != 2);

    do {

      System.out.println("\n=========== M E N U ===========\n");

      System.out.println("1 ------ Remover NOME");
      System.out.println("2 ------ Verificar se NOME foi inserido");
      System.out.println("3 ------ Excluir todos os NOMES");
      System.out.println("4 ------ Imprimir todos os NOMES");
      System.out.println("5 ------ FIM");

      System.out.print("\nOPÇÃO: ");
      opc = input.nextInt();

      input.nextLine();

      if (opc == 1) {

        System.out.print("\nDigite o nome para REMOVER: ");
        nome = input.nextLine();

        if (nomes.remove(nome)) {

          System.out.println("\nO nome (" + nome + "), foi removido com SUCESSO");

        } else {

          System.out.println("\n>>> ERRO, O NOME NÃO EXISTE NO CONJUNTO INSERIDO");

        }

      } else if (opc == 2) {

        System.out.print("\nDigite o nome para VERIFICAR se o mesmo se encontra no CONJUNTO: ");
        nome = input.nextLine();

        if (nomes.contains(nome)) {

          System.out.println("\nO nome (" + nome + "), se encontra no CONJUNTO");

        } else {

          System.out.println("\n>>> O NOME não se encontra no CONJUNTO");

        }

      } else if (opc == 3) {

        nomes.clear();

        System.out.println("\n>> NOMES EXCLUIDOS COM SUCESSO <<");

      } else if (opc == 4) {

        if (nomes.size() != 0) {

          System.out.println("\n======= N O M E S  I N S E R I D O S =======\n");

          for (String n1 : nomes) {

            System.out.println(n1);
          }

        } else {

          System.out.println("\n>> CONJUNTO VAZIO <<");

        }

      }

    } while (opc != 5);

    input.close();

  }
}
