package Exercicio_02;

public class Gerente extends Empregado{

    private String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString(){

        return "\n========= D A D O S  DO  G E R E N T E =========\n"
        +"\n" + "Nome: " + getNome() 
        + "\n" + "Matrícula: " + String.valueOf(getMatricula())
        +"\n" + "Nome da Gerência: " + this.nomeGerencia
        +"\n" + "Valor do INSS: R$" + String.valueOf(valorInss());

    }

}
