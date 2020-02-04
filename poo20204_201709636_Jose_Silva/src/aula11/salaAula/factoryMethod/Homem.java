package aula11.salaAula.factoryMethod;

public class Homem extends Pessoa {

    public Homem(String nome) {
        this.nome = nome;
        System.out.println("Olá Sr " + nome);
    }

}
