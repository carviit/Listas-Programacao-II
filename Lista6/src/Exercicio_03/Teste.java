package Exercicio_03;

public class Teste {

    public static void main(String[] args){

        // Criação das formas geométricas utilizando o FormaGeometricaFactory (Quadrado, Circulo e Triangulo)

        FormaGeometrica f1 = FormaGeometricaFactory.getFormaGeometrica("Quadrado");
        FormaGeometrica f2 = FormaGeometricaFactory.getFormaGeometrica("Triangulo");
        FormaGeometrica f3 = FormaGeometricaFactory.getFormaGeometrica("Circulo");


        // Imprimindo as formas utilizando o método desenhar 

        f1.desenhar();
        f2.desenhar();
        f3.desenhar();

    }
    
}
