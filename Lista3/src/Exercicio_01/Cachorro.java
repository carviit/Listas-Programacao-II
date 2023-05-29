package Exercicio_01;

public class Cachorro extends Animal{

    private String raca;

    public Cachorro(String nome){

        super(nome);

    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString(){

        return "\n========== D A D O S   D O   C A C H O R R O ==========" +
        "\n" + "Nome: " + getNome() + 
        "\n" + "Peso: " + String.valueOf(getPeso()) + "kg" + 
        "\n" + "Raça: " + this.raca + 
        "\n" + "=================================================";
    }

}
