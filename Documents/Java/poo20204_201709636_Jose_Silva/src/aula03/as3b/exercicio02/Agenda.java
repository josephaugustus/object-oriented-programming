package aula03.as3b.exercicio02;

public class Agenda {

    private String nome[] = new String[10];
    private int idade[] = new int[10];
    private double altura[] = new double[10];
    private static int total = 0;

    public Agenda() {
    }

    public void armazenaPessoa(String nome, int idade, double altura) {
        if (total <= 10) {
            this.nome[total] = nome;
            this.idade[total] = idade;
            this.altura[total] = altura;
            total++;
        } else {
            System.out.println("A Agenda está lotada!");
            return;
        }
    }

    public void removePessoa(String nome) {
        for (int i = 0; i < total; i++) {
            if (this.nome[i] == nome) {
                this.nome[i] = null;
                this.idade[i] = 0;
                this.altura[i] = 0;
                return;

            } else {
                System.out.println("Não existe!");
            }
        }
    }

    public int buscaPessoa(String nome) {
        for (int i = 0; i < total; i++) {
            if (this.nome[i] == nome) {
                System.out.println(i);
                return 1;
            }
        }
        System.out.println("Não encontrado!");
        return 0;
    }

    void imprimeAgenda() {
        for (int i = 0; i < 10; i++) {
            if (this.nome[i] == null) {
                continue;
            } else {
                System.out.println("Pessoa " + (i + 1) + ":\n");
            }
            System.out.println("Nome: " + this.nome[i] + "\nIdade: " + this.idade[i]
                    + "\nAltura: " + this.altura[i] + "\n");
        }
    }

    public void imprimePessoa(int i) {
        System.out.println("Nome: " + this.nome[i] + "\nIdade: " + this.idade[i]
                + "\nAltura: " + this.altura[i] + "\n");

    }
}
