package Exercicio_06;

import java.util.Scanner;

public class Carro {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        /*****************************************************************************
         * Automóvel pode ser considerado um veiculo que possui motor e 4 rodas      *
         * tem o objetivo de transportar passageiros, tendo uma capacidade para      *                                                                 *
         * o transporte de até oito pessoas. Podendo ter cores e potência diferentes *
         *                                                                           *           
         ****************************************************************************/

         // Substantivos: Motor, Roda, Passageiros, Cor e Potência;
         // Verbos: considerado, possui, transportar, ter;

        
         Cor corCarro1 = new Cor();
         Motor motorCarro1 = new Motor();
         Passageiros passageirosCarro1 = new Passageiros();
         Potencia potenciaCarro1 = new Potencia();
         Roda rodaCarro1 = new Roda();

         System.out.println("\n========== P E R S O N A L I Ç Ã O   D O    C A R R O ==========\n" );

         System.out.print("Digite o TIPO de COR desejado (Fosco ou Metálico): ");

         corCarro1.setTipoDeCor(input.nextLine());

         System.out.print("\nDigite o nome da COR desejado: ");

         corCarro1.setNome(input.nextLine());

         System.out.print("\nDigite o tipo de MOTOR desejado (TURBO ou NORMAL): ");

         motorCarro1.setTipo(input.nextLine());

         System.out.print("\nDigite a quantidade de PASSAGEIROS desejado (sem contar o motorista, 4 ou 5): ");

         passageirosCarro1.setQuantidadeDePassageiros(input.nextInt());

         System.out.print("\nDigite quantos CAVALOS irá possuir o motor (100 ou 200): ");

         potenciaCarro1.setCavalos(input.nextInt());

         System.out.print("\nDigite a quantidade de RODAS EXTRA desejado:  ");

         rodaCarro1.setQuantidadeDeRodas(input.nextInt());

         System.out.println("\n--------- PEDIDO DE CARRO EFETUADO COM SUCESSO ---------");

         System.out.println("\nRESUMO DO PEDIDO\n");

         System.out.println("Tipo de COR: " + corCarro1.getTipoDeCor());

         System.out.println("COR: " + corCarro1.getNome());

         System.out.println("TIPO do MOTOR: " + motorCarro1.getTipo());

         System.out.println("CAVALOS do MOTOR: " + potenciaCarro1.getCavalos());

         System.out.println("QUANTIDADE de passageiros: " + passageirosCarro1.getQuantidadeDePassageiros());

         System.out.println("QUANTIDADE de RODAS EXTRA: " + rodaCarro1.getQuantidadeDeRodas());

         System.out.println("\n========== T E S T   D R I V E ==========" );

         int opc = 0;

         do{

            System.out.println();

            System.out.println("DIGITE 1 PARA LIGAR O MOTOR DO CARRO");

            System.out.println("\nDIGITE 2 PARA DESLIGAR O MOTOR DO CARRO");

            System.out.println("\nDIGITE 3 PARA VERIFICAR A SITUAÇÃO DO MOTOR DO CARRO");

            System.out.println("\nDIGITE 4 PARA SAIR DO TEST DRIVE");

            System.out.print("\nOPÇÃO: ");

            opc = input.nextInt();

            if(opc == 1){

                motorCarro1.setMotorAcionar(true);

                System.out.println("\nMOTOR FOI LIGADO");
    
            } else if(opc == 2){

                motorCarro1.setMotorAcionar(false);

                System.out.println("\nMOTOR FOI DESLIGADO");

            } else if(opc == 3){

                if(motorCarro1.getMotorAcionar() == true){

                    System.out.println("\nO MOTOR ESTÁ LIGADO");

                } else{

                    System.out.println("\nO MOTOR ESTÁ DESLIGADO");

                }
            }

            }while(opc!=4);

    
    
        input.close();

    }           

}
