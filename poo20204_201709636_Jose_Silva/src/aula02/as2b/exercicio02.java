package aula02.as2b;

import java.util.Scanner;

//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
//percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que
//a percentagem do distribuidor seja de 28% e os impostos de 45%, escreva um algoritmo
//que leia o custo de fábrica de um carro e escreva o custo ao consumidor.

public class exercicio02 {

    public static void main(String[] args) {

        Double custoDeFabrica;
        Double custoDoConsumidor;
        Double margemDistribuidor = 28.0;
        Double margemDeImpostos = 45.0;
        Double Distribuidor;
        Double ValorImpostos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o custo do veículo:");
        custoDeFabrica = sc.nextDouble();

        Distribuidor = (custoDeFabrica * margemDistribuidor) / 100.000;
        ValorImpostos = (custoDeFabrica * margemDeImpostos) / 100;

        custoDoConsumidor = (ValorImpostos + Distribuidor);

        System.out.println("O custo ao consumidor é: " + custoDoConsumidor);
    }
}
