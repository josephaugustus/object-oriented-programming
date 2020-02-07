package aula02.as2b;

import java.util.Scanner;

//Desenvolva um programa em java que leia o nome e a idade de 3 pessoas e mostre o
//nome da pessoa mais velha e o nome da pessoa mais nova.

public class exercicio01 {

    public static void main(String[] args) {

        String[] nome = new String[3];
        int[] idade = new int[3];
        int menorIdade = 99;
        String nomeMenorIdade = "";
        int maiorIdade = 0;
        String nomeMaiorIdade = "";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome: ");
            nome[i] = sc.next();
            System.out.println("Digite a idade:");
            idade[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (idade[i] < menorIdade) {
                menorIdade = idade[i];
                nomeMenorIdade = nome[i];
            }
            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
                nomeMaiorIdade = nome[i];
            }
        }

        System.out.println("Nome da pessoa mais nova: " + nomeMenorIdade);
        System.out.println("Idade da pessoa mais nova: " + menorIdade);
        System.out.println("Nome da pessoa mais velha: " + nomeMaiorIdade);
        System.out.println("Idade da pessoa mais velha: " + maiorIdade);

    }

}
