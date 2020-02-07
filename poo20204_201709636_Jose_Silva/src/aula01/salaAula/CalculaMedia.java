package aula01.salaAula;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Váriaveis
        String nomeAluno1;
        String nomeAluno2;
        String nomeAluno3;
        String nomeAluno4;

        // Recebe dados dos alunos
        System.out.println("Digite seu nome do Aluno 1: ");
        nomeAluno1 = sc.nextLine();
        double n1Aluno1 = 7.5;
        double n2Aluno1 = 9.0;
        double n3Aluno1 = 8.9;
        double mediaAluno1 = (n1Aluno1 + n2Aluno1 + n3Aluno1) / 3;

        System.out.println("Digite seu nome do Aluno 2: ");
        nomeAluno2 = sc.nextLine();
        double n1Aluno2 = 8.2;
        double n2Aluno2 = 7.8;
        double n3Aluno2 = 9.0;
        double mediaAluno2 = (n1Aluno2 + n2Aluno2 + n3Aluno2) / 3;

        System.out.println("Digite seu nome do Aluno 3: ");
        nomeAluno3 = sc.nextLine();
        double n1Aluno3 = 5.7;
        double n2Aluno3 = 3.1;
        double n3Aluno3 = 4.2;
        double mediaAluno3 = (n1Aluno3 + n2Aluno3 + n3Aluno3) / 3;

        System.out.println("Digite seu nome do Aluno 4: ");
        nomeAluno4 = sc.nextLine();
        double n1Aluno4 = 10.0;
        double n2Aluno4 = 2.2;
        double n3Aluno4 = 5.3;
        double mediaAluno4 = (n1Aluno4 + n2Aluno4 + n3Aluno4) / 3;

        // Calcular média dos alunos
        double mediaGeral = (mediaAluno1 + mediaAluno2 + mediaAluno3 + mediaAluno4) / 4;

        String casasDecimais = "##.##";
        DecimalFormat num;
        num = new DecimalFormat(casasDecimais);

        // Mostra resultados
        System.out.println("Média de " + nomeAluno1 + " = " + num.format(mediaAluno1) + ".");
        System.out.println("Média de " + nomeAluno2 + " = " + num.format(mediaAluno2) + ".");
        System.out.println("Média de " + nomeAluno3 + " = " + num.format(mediaAluno3) + ".");
        System.out.println("Média de " + nomeAluno4 + " = " + num.format(mediaAluno4) + ".");
        System.out.println("Média Geral de " + mediaGeral + " ou " + num.format(mediaGeral) + ".");
    }

}
