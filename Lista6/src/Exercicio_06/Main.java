package Exercicio_06;

public class Main {

    public static void main(String[] args){

        // Criação das fábrica de ingredientes dos sandúiches (CG, RT e JP)

        SanduichesIngredientFactory sanduicheCG = new SanduichesIngredientFactoryCG();
        SanduichesIngredientFactory sanduicheJP = new SanduichesIngredientFactoryJP();
        SanduichesIngredientFactory sanduicheRT = new SanduichesIngredientFactoryRT();
    
        // Criação dos sanduíches CG utilizando a fábrica de ingredientes (CG, RT e JP)

        Sanduiche cg = new  Sanduiche(sanduicheCG);
        Sanduiche jp = new  Sanduiche(sanduicheJP);
        Sanduiche rt = new  Sanduiche(sanduicheRT);

        // Montagem dos sanduíches (CG, RT e JP) e exibição dos ingredientes dos mesmos.

        cg.montarSanduiche();
        jp.montarSanduiche();
        rt.montarSanduiche();

    }
    
}
