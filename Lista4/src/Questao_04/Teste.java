package Questao_04;


public class Teste {

    public static void main(String[] args){

        Oficina o = new Oficina();

        Automovel HondaCivic = new Automovel();
        Automovel PalioFire = new Automovel();

        Bicicleta Caloi = new Bicicleta();
        Bicicleta Monark = new Bicicleta();

        o.veiculos.add(HondaCivic);
        o.veiculos.add(PalioFire);
        o.veiculos.add(Caloi);
        o.veiculos.add(Monark);

        int quantidadeDeVeiculos = o.veiculos.size();

        System.out.println("===================================================");

        for(int i = 0; i<quantidadeDeVeiculos;i++){

           o.manutencao(o.proximo());

        }

    }
    
}
