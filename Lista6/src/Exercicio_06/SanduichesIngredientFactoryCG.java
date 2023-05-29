package Exercicio_06;

public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory{

    @Override
    public Pao criarPao() {
        return new PaoIntegral();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoPrato();
    }

    @Override
    public Presunto criarPresunto() {
        return new PresuntoDeFrango();
    }

    @Override
    public Salada criarSalada() {
        return new SaladaSemVerdura();
    }
}

