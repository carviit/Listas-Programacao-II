package Exercicio_06;

public class ContaExcecao extends Exception{

    @Override
    public String getMessage() {

        return "\n\t\t\t>> ERRO <<" + "\n" +
        "\nEXCESSÃO DO CARLOS VITOR\n";
    }

}
