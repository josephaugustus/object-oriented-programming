package aula12.as10b.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Adaptador implements SomadorEsperado {

    SomadorExistente somador = new SomadorExistente();

    List<Integer> lista = new ArrayList<Integer>();

    public int somaVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            lista.add(vetor[i]);
        }
        int result = somador.somaLista(lista);

        return result;
    }
}
