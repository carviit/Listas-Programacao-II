package Exercicio_08;

public class Teste {

    public static void main(String[] args){

        MedidorFarenheit farenheit = new MedidorFarenheit();
        
        MedidorAdaptor.Adaptador adaptador = new MedidorAdaptor().new Adaptador(farenheit);
        
        // Usando o adaptador para medir a temperatura em Celsius

        double Celsius = adaptador.medirTemperatura();
        
        // Mostrando a temperatura em Celsius

        System.out.println("Temperatura: " + Celsius + " °C");

    }

    
    
}
