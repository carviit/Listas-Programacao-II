package Exercicio_06;

public class App {

    public static void main(String[] args) {

        Conta minhaConta = new Conta();

        minhaConta.deposita(100);

        minhaConta.setLimite(150);

        try{

            minhaConta.saca(99);

        }catch(Exception e){

            System.out.println(e.getMessage());

        }
        
    }
    
}
