
package aula03.as3b.exercicio01;
import java.util.Scanner;

public class Pessoa {
      
    private String nome;
    private DataNascimento dataNasc;
    private double altura;

    Scanner sc = new Scanner(System.in);

    void setDados() {
            System.out.println("Dados:\n\nNome: "+this.nome+"\nData de Nascimento: "
                                            +this.dataNasc.dia+"/"+this.dataNasc.mes+"/"+this.dataNasc.ano+
                                            "\nAltura: "+this.altura+"\nIdade: "+getIdade());

    }

    public String getNome() {
            this.nome = sc.next();
            return this.nome;		
    }

    public DataNascimento getData() {

            Pessoa temp = new Pessoa();
            temp.dataNasc = new DataNascimento();

            this.dataNasc = temp.dataNasc;

            System.out.println("Dia: ");
            this.dataNasc.dia = sc.nextInt();
            System.out.println("Mes: ");
            this.dataNasc.mes = sc.nextInt();
            System.out.println("Ano: ");
            this.dataNasc.ano = sc.nextInt();

            return this.dataNasc;
    }

    public double getAltura() {
            return (this.altura = sc.nextDouble());
    }

    public int getIdade() {
            return (2020 - this.dataNasc.ano);
    }

    void getDados() {
            System.out.println("Insira o nome: ");
            this.getNome();
            System.out.println("Insira a data de nascimento: ");
            this.getData();
            System.out.println("Insira sua altura: ");
            this.getAltura();
    }
}
