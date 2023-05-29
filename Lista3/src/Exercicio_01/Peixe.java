package Exercicio_01;

public class Peixe extends Animal{

    private String tipoHabitat;

    public Peixe(String nome){

        super(nome);

    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    @Override
    public String toString(){

        return "\n========== D A D O S   D O   P E I X E ==========" +
        "\n" + "Nome: " + getNome() + 
        "\n" + "Peso: " + String.valueOf(getPeso()) + "kg" + 
        "\n" + "Tipo de Habitat: " + this.tipoHabitat + 
        "\n" + "=================================================";
    }
    
}
