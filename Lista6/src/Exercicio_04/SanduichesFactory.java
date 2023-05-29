package Exercicio_04;

public class SanduichesFactory {

    public static Sanduiche fazSanduiche(String nomeDoSanduiche){

        if(nomeDoSanduiche == null){

            return null;

        }if(nomeDoSanduiche.equals("Padrao")){

            return new SanduichePadrao();

        }else if(nomeDoSanduiche.equals("CG")){

            return new SanduicheCG();
            
        }else if(nomeDoSanduiche.equals("JP")){

            return new SanduicheJP();
        
        }else if(nomeDoSanduiche.equals("RT")){

            return new SanduicheRT();
        }

        return null;

    }
    
}
