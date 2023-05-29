package Exercicio_02;

public class IncrementalSingleton {

    private static IncrementalSingleton instancia = null;
    private int numero;

    private IncrementalSingleton(){

    }

    public static IncrementalSingleton GetInstancia(){

        if(instancia == null){

            instancia = new IncrementalSingleton();

        }

        return instancia;

    }

    @Override
    public String toString(){

        return "Incremental " + numero;

    }
    
}
