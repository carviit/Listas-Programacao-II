package Exercicio_04;

public class Teste {

    public static void main(String[] args){

        //Criação dos Sanduíches utilizando o padrão Factory Method

        Sanduiche padrao = SanduichesFactory.fazSanduiche("Padrao");
    
        Sanduiche cg = SanduichesFactory.fazSanduiche("CG");

        Sanduiche jp = SanduichesFactory.fazSanduiche("JP");

        Sanduiche rt = SanduichesFactory.fazSanduiche("RT");

        //Exibição dos ingredientes de cada sanduíche criado.

        padrao.montarSanduiche();

        cg.montarSanduiche();

        jp.montarSanduiche();

        rt.montarSanduiche();

    }
    
}
