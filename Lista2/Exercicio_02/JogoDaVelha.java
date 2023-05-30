package Exercicio_02;

import java.util.Scanner;

public class JogoDaVelha {

    static public int jogadas = 0;

    static public char elemento = 'X';

    Scanner input = new Scanner(System.in);

    private char matriz[][] = new char [3][3];

    public void setMatriz(int l, int c, char elemento) {

        this.matriz[l][c] = elemento;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public enum StatusPlace{    

        EMPTY(' '), PLAYER_ONE('X'), PLAYER_TWO('O');

        private char valor;

        StatusPlace(char valor){

            this.valor = valor;

        }

        public char getValor() {
            return valor;
        }

    }

    public JogoDaVelha(){

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                getMatriz()[i][j] = StatusPlace.EMPTY.getValor();

            }
        }

    }

    public void exibirGrade(){

        limpaTela();

        System.out.println("   0   1   2"); 

        System.out.printf("0  %c | %c | %c %n", getMatriz()[0][0], getMatriz()[0][1], getMatriz()[0][2]);
        System.out.println("==============");
        System.out.printf("1  %c | %c | %c %n", getMatriz()[1][0], getMatriz()[1][1], getMatriz()[1][2]);
        System.out.println("==============");
        System.out.printf("2  %c | %c | %c %n", getMatriz()[2][0], getMatriz()[2][1], getMatriz()[2][2]);

    }

    public void limpaTela(){

        for(int i = 0; i < 100; i++){

            System.out.println();
        }
    }

    public boolean verificaPosicao(int posicao[], char elemento){ 
        
        if(getMatriz()[posicao[0]][posicao[1]] == ' '){

            setMatriz(posicao[0], posicao[1], elemento);

            return true;

        }else{
            
            System.out.println("\nJogada INVÁLIDA, posição já ocupada!");

            return false;
        }
 
    }

    public int[] alocarPosicao(char elemento){

        int posicao[] = new int[2];

        System.out.println("\nVez do JOGADOR: " + elemento);

        System.out.print("\nDigite a posição da linha: "); 
        
        posicao[0] = input.nextInt();

        System.out.print("\nDigite a posição da coluna: ");

        posicao[1] = input.nextInt();

        jogadas++;

        return posicao;

    }

    public void jogar(){

        if(verificaPosicao(alocarPosicao(elemento), elemento)){

           if(elemento == StatusPlace.PLAYER_ONE.getValor()){

                elemento = StatusPlace.PLAYER_TWO.getValor();

           }else{

                elemento = StatusPlace.PLAYER_ONE.getValor();

           }   

        }   
     
    }

    public String verificaVitoria(){

        int c1 = 0;
        int c2 = 0;

        // Verifica LINHAS

        for(int j = 0; j < 3; j++){

            for (int i = 0; i < 3; i++){

                if(this.matriz[i][j] == StatusPlace.PLAYER_ONE.getValor()){

                    c1++;

                }else if(this.matriz[i][j] == StatusPlace.PLAYER_TWO.getValor()){

                    c2++;
                }

            }

            if(c1 == 3){
            
                return "X";

            }else if(c2 == 3){

                return "O";
            }

            c1 = 0;
            c2 = 0;

        }

        // Verifica COLUNAS

        for(int j = 0; j < 3; j++){

            for (int i = 0; i < 3; i++){

                if(this.matriz[j][i] == StatusPlace.PLAYER_ONE.getValor()){

                    c1++;

                }else if(this.matriz[j][i] == StatusPlace.PLAYER_TWO.getValor()){

                    c2++;
                }

            }

            if(c1 == 3){
            
                return "X";

            }else if(c2 == 3){

                return "O";
            }

            c1 = 0;
            c2 = 0;

        }

        // Verifica DIAGONAL

        for(int j = 0; j < 3; j++){

            if(this.matriz[j][j] == StatusPlace.PLAYER_ONE.getValor()){

                c1++;

            }else if(this.matriz[j][j] == StatusPlace.PLAYER_TWO.getValor()){

                c2++;
            }

        }

        if(c1 == 3){
            
            return "X";

        }else if(c2 == 3){

            return "O";
        }

        // Verifica se todas as posições estão ocupadas retornando empate

        if(jogadas == 9){

            return "empate";
        }

    return "";
    }
 
}
