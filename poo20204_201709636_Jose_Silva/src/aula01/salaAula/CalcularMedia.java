package aula01.salaAula;

import java.util.Scanner;

public class CalcularMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota1, nota2, nota3, nota4;
        int media, i, contAluno = 0;

        for (i = 0; i < 4; i++) {

            contAluno++;
            System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
            nota1 = sc.nextInt();

            System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
            nota2 = sc.nextInt();

            System.out.println("Aluno " + contAluno + ", digite sua 3ª nota");
            nota3 = sc.nextInt();

            System.out.println("Aluno " + contAluno + ", digite sua 4ª nota");
            nota4 = sc.nextInt();

            // Calcular média
            media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("A média do aluno " + contAluno + " é " + media);

            // Nota do aluno
            if ((media >= 0) && (media < 6)) {
                System.out.println("Reprovado!");
            } else {
                System.out.println("Aprovado!");
            }
        }
    }
}
