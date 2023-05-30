package Exercicio_05;

public class Cliente {

    public static FabricaDeCarro getFabricaDeCarro(String fabrica) {

        if (fabrica.equals("Fiat"))
            return new FabricaFiat();

        else if (fabrica.equals("Ford"))
            return new FabricaFord();

        return null;
    }
    
}
