package Exercicio_06;

public class Sanduiche {

    private Pao pao;
    private Queijo queijo;
    private Presunto presunto;
    private Salada salada;

    public Sanduiche(SanduichesIngredientFactory fabrica) {

        pao = fabrica.criarPao();
        queijo = fabrica.criarQueijo();
        presunto = fabrica.criarPresunto();
        salada = fabrica.criarSalada();
    }

    public void montarSanduiche() {
        
        System.out.println("\n========== S A N D U Í C H E  ==========");
        System.out.println("Pão: " + pao.tipoDoPao());
        System.out.println("Queijo: " + queijo.tipoDoQueijo());
        System.out.println("Presunto: " + presunto.tipoDoPresunto());
        System.out.println("Salada: " + salada.tipoDaSalada());
        System.out.println("=======================================");
    }

}
