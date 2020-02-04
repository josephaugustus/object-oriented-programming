package aula11.salaAula.factoryMethod;

public class Mulher extends Pessoa {

    public Mulher(String nome) {
        this.nome = nome;
        System.out.println("Olá Sra " + nome);
    }
}
