package aula03.as3b.exercicio01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal extends Pessoa2 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Informe seu nome: ");
        pessoa.setNome(sc.nextLine());

        System.out.println("Data de nascimento (DD/MM/YYYY): ");
        String newdate = sc.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(newdate);
        pessoa.setDataNascimento(data);

        System.out.println("Informe sua altura (em cm): ");
        pessoa.setAltura(sc.nextDouble());

        sc.close();

        System.out.println(pessoa);
        System.out.println(pessoa.getNome() + ", você tem " + pessoa.exibirIdade() + " anos!\n");
    }
}
