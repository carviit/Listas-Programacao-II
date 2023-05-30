package Exercicio_05;

public class FabricaFord extends FabricaDeCarro {

    @Override
    public CarroPopular criaCarroPopular(String cor, int quantidadeDePortas, String anoDeFabricacao, String modelo) {

        if (modelo.equals("Fiesta")) {

            return new Fiesta(cor, quantidadeDePortas, anoDeFabricacao, modelo);

        } else {

            return null;
        }

    }

    @Override
    public CarroSedan criaCarroSedan(String cor, int quantidadeDePortas, String anoDeFabricacao, String modelo) {

        if (modelo.equals("Fiesta Sedan")) {

            return new FiestaSedan(cor, quantidadeDePortas, anoDeFabricacao, modelo);

        } else {

            return null;
        }

    }

}
