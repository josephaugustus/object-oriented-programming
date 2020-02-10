package aula13.as11b.exercicio01_03;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Agenda agenda = new Agenda();

        for (int i = 0; i < 2; i++) {
            System.out.println("\nDigite o nome: ");
            String nome = sc.nextLine();

            System.out.println("Digite a idade ");
            int idade = sc.nextInt();

            System.out.println("Digite a altura ");
            double altura = sc.nextDouble();
            sc.nextLine();

            agenda.addPessoa(nome, idade, altura);
        }

        System.out.println("Os dados foram gravados em: " + System.getProperty("user.dir")
                + "\\src\\aula13\\as11b\\Agenda.txt");
        System.out.println("Os dados foram gravados em: " + System.getProperty("user.dir") 
                + "\\src\\aula13\\as11b\\Agenda.bin");
        
        agenda.gravarTxt();
        agenda.gravarBin();

        sc.close();
    }
}
