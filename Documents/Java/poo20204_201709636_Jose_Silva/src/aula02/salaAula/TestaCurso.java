package Aula02;

import java.util.Scanner;

public class TestaCurso {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Curso 1
        Curso curso1 = new Curso();
        System.out.println("Entre com o nome do curso");
        curso1.nome = sc.nextLine();

        System.out.println("Entre com a área do curso");
        curso1.area = sc.nextLine();

        System.out.println("Entre com o tipo do curso");
        curso1.tipo = sc.nextLine();

        System.out.println("Entre com a duração do curso");
        curso1.duracao = Integer.parseInt(sc.nextLine());

        System.out.println("Curso 1: " + curso1.nome + " - " + curso1.area + " - " + curso1.tipo + " - " + curso1.duracao);

        // Curso 2
        Curso curso2 = new Curso();
        System.out.println("Entre com o nome do curso");
        curso2.nome = sc.nextLine();

        System.out.println("Entre com a área do curso");
        curso2.area = sc.nextLine();

        System.out.println("Entre com o tipo do curso");
        curso2.tipo = sc.nextLine();

        System.out.println("Entre com a duração do curso");
        curso2.duracao = Integer.parseInt(sc.nextLine());

        System.out.println("Curso 2: " + curso2.nome + " - " + curso2.area + " - " + curso2.tipo + " - " + curso2.duracao);

//        // Curso 1
//        Curso c1 = new Curso();
//        System.out.println("Entre com o nome do curso");
//        c1.nome = sc.nextLine();
//        System.out.println("Nome do curso: " + c1.nome);
//        // Curso 1
//        Curso c1 = new Curso();
//        c1.nome = "Ciência da Computação";
//        c1.area = "Ciências Exatas";
//        c1.tipo = "Computação";
//        c1.duracao = 4200;
//        
//        System.out.println("Nome do curso c1: " + c1.nome);
//        System.out.println("Área do curso c1: " + c1.area);
//        System.out.println("Tipo do curso c1: " + c1.tipo);
//        System.out.println("Duração do curso c1: " + c1.duracao);
//        
//        // Curso 2
//        Curso c2 = new Curso();
//        c2.nome = "Engenharia de Software";
//        c2.area = "Ciências Exatas";
//        c2.tipo = "Computação";
//        c2.duracao = 3600;
//        
//        System.out.println("Nome do curso c2: " + c2.nome);
//        System.out.println("Área do curso c2: " + c2.area);
//        System.out.println("Tipo do curso c2: " + c2.tipo);
//        System.out.println("Duração do curso c2: " + c2.duracao);
//        Curso c1 = new Curso();
//        c1.nome = "Ciência da Computação";
//        System.out.println("Nome do curso c1: " + c1.nome);
//        
//        // Curso 2
//        Curso c2 = new Curso("Engenharia de Software");
//        System.out.println("Nome do curso c2: " + c2.nome);
//        
//        // Curso 3
//        Curso c3 = new Curso("Sistemas de Informação", "Ciências Exatas", "Computação", 3600);
//        System.out.println("Nome do curso c3: " + c3.nome);
//        System.out.println("Área do curso c3: " + c3.area);
//        System.out.println("Tipo do curso c3: " + c3.tipo);
//        System.out.println("Duração do curso c3: " + c3.duracao);
    }

}
