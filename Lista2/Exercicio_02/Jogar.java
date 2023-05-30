package Exercicio_02;

public class Jogar {

    public static void main(String[] args){

        JogoDaVelha jogo = new JogoDaVelha();

        while(true){

        jogo.exibirGrade();

       if(!jogo.verificaVitoria().equals("")){

            if(jogo.verificaVitoria().equals("empate")){

                System.out.println("\n====== E M P A T E ======\n");

                break;

            }else{

            System.out.println("\n=== Jogador " + jogo.verificaVitoria() + " venceu ===\n");

            break;

            }

        } 
        
        jogo.jogar();

        }

    }
    
}
