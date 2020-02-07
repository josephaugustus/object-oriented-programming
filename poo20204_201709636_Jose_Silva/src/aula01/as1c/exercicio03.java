package aula01.as1c;;

import java.util.Scanner;

//Armazenar em um vetor uma quantidade de números informada pelo usuário inicialmente. 
//Mostrar o vetor em ordem crescente e em ordem decrescente. Solicitar um
//novo valor do usuário e informar se existe ou não no vetor e em que posição.

public class exercicio03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Informe o tamanho e os números do vetor: ");
        int tamanho = in.nextInt();

        int vetor[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = in.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (vetor[i] < vetor[j]) {
                    int aux;
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        // Crescente
        System.out.println("Ordem Crescente");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (vetor[i] > vetor[j]) {
                    int aux;
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        // Decrescente
        System.out.println("\nOrdem Decrescente ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }

        // Informar se existe ou não no vetor
        System.out.println("\nInforme o número que deseja consultar: ");
        boolean flag = false;
        int n = in.nextInt();

        for (int i = 0; i < tamanho; i++) {
            if (n == vetor[i]) {
                System.out.println("O número está na posição " + i + ".");
                flag = true;
            }
        }

        if (flag == false) {
            System.out.println("O numero não existe no vetor");
        }
    }
}
