package Exercicio_07;

public class Teste {

    public static void main(String[] args){

         SomadorExistente somadorExistente = new SomadorExistente();

         SomadorEsperado adaptor = new SomaVetorListaAdaptor(somadorExistente);
 
         Cliente cliente = new Cliente(adaptor);
 
         cliente.executar();

    }
    
}
