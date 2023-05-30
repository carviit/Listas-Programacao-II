package Exercicio_01;

public class ProjetorSingleton {

    private static ProjetorSingleton instancia = null;

    private ProjetorSingleton(){}
    
    public static ProjetorSingleton GetInstancia(){

        if(instancia == null){

            instancia = new ProjetorSingleton();

        }

        return instancia;

    }

}
