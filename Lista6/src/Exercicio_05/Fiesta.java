package Exercicio_05;

public class Fiesta implements CarroPopular {

    private String cor;
    private int quantidadeDePortas;
    private String anoFabricacao;
    private String modelo;

    public Fiesta(String cor, int quantidadeDePortas, String anoFabricacao, String modelo) {

        this.cor = cor;
        this.quantidadeDePortas = quantidadeDePortas;
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;

    }

    @Override
    public void exibirInfoPopular() {

        System.out.println("\n======= F I E S T A =======\n");

        System.out.println("Cor: " + this.cor);
        System.out.println("Quantidade de Portas: " + this.quantidadeDePortas);
        System.out.println("Ano de Fabricação: " + this.anoFabricacao);
        System.out.println("Modelo: " + this.modelo);

    }

}
