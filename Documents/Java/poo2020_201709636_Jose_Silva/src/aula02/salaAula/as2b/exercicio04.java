package aula02.salaAula.as2b;

import java.util.Scanner;

//Um banco concederá um crédito especial aos seus clientes, variável com o saldo médio
//no último ano. Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do
//crédito de acordo com a tabela abaixo. Mostre uma mensagem informando o saldo médio
//e o valor do crédito. (use o comando caso-de e não faça repetições)
//Saldo médio Percentual de 0 a 200 nenhum crédito
//de 201 a 400 20% do valor do saldo médio
//de 401 a 600 30% do valor do saldo médio
//acima de 601 40% do valor do saldo médio

public class exercicio04 {

    public static void main(String[] args) {
        int saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu saldo: ");
        saldo = sc.nextInt();

        switch ((saldo - 1) / 200) {
            case 0:
                System.out.println("De 0 e 200, nenhum crédito.");
                break;
            case 1:
                System.out.println("De 201 e 400, 20% do valor do saldo médio.");
                break;
            case 2:
                System.out.println("De 401 e 600, 30% do valor do saldo médio.");
                break;
            default:
                System.out.println("Acima de 601, 40% do valor do saldo médio.");
                break;
        }
    }
}
