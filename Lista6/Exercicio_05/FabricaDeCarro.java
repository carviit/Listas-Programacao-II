package Exercicio_05;

public abstract class FabricaDeCarro {

    public abstract CarroSedan criaCarroSedan(String cor, int quantidadeDePortas, String anoDeFabricacao,
            String modelo);

    public abstract CarroPopular criaCarroPopular(String cor, int quantidadeDePortas, String anoDeFabricacao,
            String modelo);

}
