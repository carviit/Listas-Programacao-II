package Questao_04;

public class Automovel extends Veiculo{

    public void mudarOleo(){

        System.out.println("Trocando Óleo do Automóvel......");

    }

    @Override
    public void listaVerificacoes(){

        System.out.println("Listando verificações......");

    }

    @Override
    public void ajustar(){

        System.out.println("Ajustando Automóvel.......");

    }
    
    @Override
    public void limpar(){

        System.out.println("Limpando Automóvel.......");

    }


    
}
