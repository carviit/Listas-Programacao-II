package Exercicio_06;

public class SanduichesIngredientFactoryRT  implements SanduichesIngredientFactory{

    @Override
    public Pao criarPao() {
        return new PaoBola();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoCheddar();
    }

    @Override
    public Presunto criarPresunto() {
        return new PresuntoDePeru();
    }

    @Override
    public Salada criarSalada() {
        return new SaladaSemVerdura();
    }
    
}
