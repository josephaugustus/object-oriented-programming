package aula02.salaAula.as2b;

import java.util.Scanner;
import javax.swing.JOptionPane;

//Uma pesquisa sobre algumas características físicas da população de uma determinada
//região coletou os seguintes dados, referentes a cada habitante, para serem analisados:
//- sexo (masculino, feminino)
//- cor dos olhos (azuis, verdes, castanhos)
//- cor dos cabelos (louros, castanhos, pretos)
//- idade em anos.
//Para cada habitante, foi perfurado um cartão com esses dados, e o último cartão, que não
//corresponde a ninguém, conterá o valor da idade igual a -1. Implementar um algoritmo que
//determine e escreva:
//a) a maior idade dos habitantes;
//b) porcentagem de indivíduos do sexo feminino cuja idade esteja entre 18 e 35 anos,
//inclusive, e que tenham olhos verdes e cabelos louros

public class exercicio03 {

    public static void main(String[] args) {
        int populacao;

        populacao = Integer.parseInt(JOptionPane.showInputDialog("### Pesquisa Populacional ###"));

        String gender[] = new String[populacao + 1];
        String eyeColor[] = new String[populacao + 1];
        String hairColor[] = new String[populacao + 1];
        int age[] = new int[populacao + 1];

        double soma = 0;
        double percentual;

        Scanner sc = new Scanner(System.in);

        int i;

        int max = age[0];
        int min = 150;

        for (i = 0; i < populacao + 1; i++) {
            if (i < populacao) {
                gender[i] = JOptionPane.showInputDialog("Gênero " + (i + 1) + "\nM - Masculino\nF - Feminino");
                eyeColor[i] = JOptionPane.showInputDialog("Cor dos Olhos " + (i + 1) + "\nA - Azul\nV - Verde)\nC - Castanho)");
                hairColor[i] = JOptionPane.showInputDialog("Cor dos Cabelos " + (i + 1) + "\nL - Louros)\nC - Castanhos)\nP - Pretos");
                age[i] = Integer.parseInt(JOptionPane.showInputDialog("Idade " + (i + 1)));
            } else {
                gender[i] = "";
                eyeColor[i] = "";
                hairColor[i] = "";
                age[i] = -1;
            }
        }

        for (i = 0; i <= populacao; i++) {
            if (age[i] > max) {
                max = age[i];
            }
        }

        for (i = 0; i <= populacao; i++) {

            if (gender[i].equals("F") && age[i] > 18 && age[i] < 35 && eyeColor[i].equals("V") && hairColor[i].equals("L")) {
                soma = soma + 1;
            }
        }

        percentual = (soma / populacao) * 100;

        System.out.println("A maior idade é " + max + " anos");

        System.out.println("O percentual é " + percentual + "%");
    }
}
