package aula01.salaAula.as1c;

import java.util.Scanner;

//Criar um programa que o usuário informe uma quantidade X de funcionários e a seguir
//informe os X nomes e X salários. O programa deve armazenar os dados em 2 vetores.
//Posteriormente, o programa deve varrer o vetor de salários e mostrar:
// O maior salário (posição, nome e salário)
// O menor salário (posição, nome e salário)
// A média salarial
// Os maiores que a média (nomes e salários)
// Os menores que a média (nomes e salários)

public class exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número de funcionários da sua empresa: ");
        int funcionarios = sc.nextInt();

        String nome[] = new String[funcionarios];
        double salario[] = new double[funcionarios];

        for (int i = 0; i < funcionarios; i++) {
            System.out.println("Informe o nome do funcionário " + (i + 1) + ":");
            nome[i] = sc.next();
            System.out.println("Informe o salario: ");
            salario[i] = sc.nextDouble();
        }

        double maior, menor, media;
        maior = salario[0];
        menor = salario[0];
        media = 0;
        int auxmaior = 0;
        int auxmenor = 0;

        for (int i = 0; i < funcionarios; i++) {
            if (salario[i] > maior) {
                maior = salario[i];
                auxmaior = i;
            }
            if (salario[i] < menor) {
                menor = salario[i];
                auxmenor = i;
            }
            media = media + salario[i];
        }

        media = media / funcionarios;

        System.out.println("O maior salário é de: " + maior + "\nDo colaborador: " + nome[auxmaior]
                + "\nNa posição: " + auxmaior + ".");

        System.out.println("\nO menor salário é de: " + menor + "\nDo colaborador: " + nome[auxmenor]
                + "\nNa posição: " + auxmenor + ".");

        System.out.println("A média salarial é: " + media);

        System.out.println("Os colaboradores com rendimentos maiores que a média são:");

        for (int i = 0; i < funcionarios; i++) {
            if (salario[i] >= media) {
                System.out.println("Nome do colaborador: " + nome[i] + "\nCom um rendimento de: " + salario[i] + ".");
            }
        }

        System.out.println("\nOs colaboradores com rendimentos menores que a média são:");
        for (int i = 0; i < funcionarios; i++) {
            if (salario[i] < media) {
                System.out.println("Nome do colaborador: " + nome[i] + "\nCom um salário de: " + salario[i] + ".");
            }
        }
    }
}
