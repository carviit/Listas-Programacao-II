package Exercicio_07;

import java.util.List;
import java.util.ArrayList;

public class SomaVetorListaAdaptor implements SomadorEsperado {

    private SomadorExistente conversor;

    public SomaVetorListaAdaptor(SomadorExistente conversor) {
        this.conversor = conversor;
    }

    public int somaVetor(int[] vetor) {
        
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < vetor.length; i++) {

            l.add(vetor[i]);

        }

        return conversor.somaLista(l);
    }

}