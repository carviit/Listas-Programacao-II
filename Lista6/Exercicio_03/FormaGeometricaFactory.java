package Exercicio_03;

public class FormaGeometricaFactory {

    public static FormaGeometrica getFormaGeometrica(String forma){

        if(forma == null){

            return null;
        }
        if(forma.equals("Quadrado"))
        {
            return new Quadrado();
        }
        else if(forma.equals("Circulo")){

            return new Circulo();
        }
        else if(forma.equals("Triangulo")){

            return new Triangulo();

        }

        return null;
    }
    
}
