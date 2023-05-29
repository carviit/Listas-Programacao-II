package Exercicio_08;

public class IntegerSet {
    
    private boolean[] vetor = new boolean[10];

    public IntegerSet(int[] v) {

        for (int i = 0; i < 10; ++i) {

            if (i != v[i]) continue;
            
            this.vetor[i] = true;

        }
    }

    public boolean[] uniao(boolean[] vet1, boolean[] vet2) {

        boolean[] vetUniao = new boolean[10];

        for (int i = 0; i < 10; ++i) {

            if (!vet1[i] && !vet2[i]) continue;

            vetUniao[i] = true;
        }

        return vetUniao;
    }

    public boolean[] intersecao(boolean[] vet1, boolean[] vet2) {

        boolean[] vetIntersecao = new boolean[10];

        for (int i = 0; i < 10; ++i) {

            if (!vet1[i] || !vet2[i]) continue;

                vetIntersecao[i] = true;
        }

        return vetIntersecao;
    }

    public boolean[] diferenca(boolean[] vet1, boolean[] vet2) {

        boolean[] vetDiferenca = new boolean[10];

        for (int i = 0; i < 10; ++i) {

            vetDiferenca[i] = !vet1[i] || !vet2[i];

        }

        return vetDiferenca;

    }

    public void inserirElemento(int x) {

        if (x < 0 || x > 9) {

            System.out.println("Só pode ser inserido valores do intervalo de 0 - 9");

        } else {

            this.vetor[x] = true;

            System.out.println("\n====================================================");

            System.out.println("Elemento inserido com sucesso");

            System.out.println("\nVetor[" + x + "] = " + this.vetor[x]);

            System.out.print("\nVetor Resultado = [");

            for (int i = 0; i < 10; ++i) {

                if (i == 9) {

                    System.out.print(String.valueOf(this.getVetor()[i]) + "]");

                    continue;
                }

                System.out.print(String.valueOf(this.getVetor()[i]) + "," + " ");
            }
            System.out.println();
        }
    }

    public void excluirElemento(int x) {

        if (x < 0 || x > 9) {

            System.out.println("\n====================================================");

            System.out.println("\nSó pode ser excluido valores do intervalo de 0 - 9");

        } else {

            this.vetor[x] = false;

            System.out.println("\n====================================================");

            System.out.println("Elemento excluido com sucesso");

            System.out.println("\nVetor[" + x + "] = " + this.vetor[x]);

            System.out.print("\nVetor Resultado = [");

            for (int i = 0; i < 10; ++i) {

                if (i == 9) {

                    System.out.print(String.valueOf(this.getVetor()[i]) + "]");

                    continue;
                }

                System.out.print(String.valueOf(this.getVetor()[i]) + "," + " ");
            }

            System.out.println();
        }
    }

    public void converterBooleanParaString(boolean[] vetor) {

        int i = 0;

        String[] vetorConvertido = new String[10];

        for (i = 0; i < 10; ++i) {

            if(vetor[i]){

                vetorConvertido[i] = "true";

            } else{

                vetorConvertido[i] = "false";  

            }

        }
        System.out.println("\n====================================================");

        System.out.print("\nVetor Resultado = [");

        for (i = 0; i < 10; ++i) {

            if (i == 9) {

                System.out.print(String.valueOf(vetorConvertido[i]) + "]");

                continue;
            }
            
            System.out.print(String.valueOf(vetorConvertido[i]) + "," + " ");

        }
        System.out.println("\n\nTipo do VETOR: " + vetorConvertido.getClass().getSimpleName());
    }

    public boolean[] getVetor() {
        return this.vetor;
    }

}