package Exercicio_05;

public class FabricaFiat extends FabricaDeCarro {

    @Override
    public CarroSedan criaCarroSedan(String cor, int quantidadeDePortas, String anoDeFabricacao, String modelo) {

        if (modelo.equals("Siena")) {

            return new Siena(cor, quantidadeDePortas, anoDeFabricacao, modelo);

        } else {

            return null;
        }

    }

    @Override
    public CarroPopular criaCarroPopular(String cor, int quantidadeDePortas, String anoDeFabricacao, String modelo) {

        if (modelo.equals("Palio")) {

            return new Palio(cor, quantidadeDePortas, anoDeFabricacao, modelo);

        } else {

            return null;

        }

    }

}
