package Exercicio_08;


    public class Adaptador implements MedidorCelsiusIF {

        private MedidorFarenheit medidorFarenheit;
    
        public Adaptador(MedidorFarenheit medidorFarenheit) {

            this.medidorFarenheit = medidorFarenheit;
        }
    
        @Override
        public double medirTemperatura() {

            double Farenheit = medidorFarenheit.getTemperaturaFarenheit();
            
            double Celsius = (Farenheit - 32) / 1.8;

            return Celsius;
        }
    
    }
    

