package Exercicio_05;

public class Teste {

    public static void main(String[] args) {

        // Criação da Fábrica da FORD por meio do padrão de projeto AbstractFactory
        // (Fabrica De Carro).

        FabricaDeCarro fabricaFord = Cliente.getFabricaDeCarro("Ford");

        // Criação da Fábrica da FORD por meio do padrão de projeto AbstractFactory
        // (Fabrica De Carro).

        FabricaDeCarro fabricaFiat = Cliente.getFabricaDeCarro("Fiat");

        // Criação dos carros populares utilizando a fábrica de carro (Palio e Fiesta).

        CarroPopular c1 = fabricaFiat.criaCarroPopular("Vermelho", 2, "2002", "Palio");

        CarroPopular c2 = fabricaFord.criaCarroPopular("Preto", 2, "2001", "Fiesta");

        // Criação dos carros sedan utilizando a fábrica de carro (Siena e Fiesta
        // Sedan).

        CarroSedan c3 = fabricaFiat.criaCarroSedan("Cinza", 4, "2017", "Siena");

        CarroSedan c4 = fabricaFord.criaCarroSedan("Cinza metálico", 4, "2019", "Fiesta Sedan");

        // Exibição dos dados dos carros criados pelas fábricas

        c1.exibirInfoPopular();
        c2.exibirInfoPopular();

        c3.exibirInfoSedan();
        c4.exibirInfoSedan();

    }

}
