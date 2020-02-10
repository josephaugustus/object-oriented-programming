package br.com.gilmario.poo20204gilmar.avaliacaoAEI1.exercicio03;

public class Principal {
    public static void main(String[] args) {
        Estado go = new Estado("Goiás", "GO");
        Estado rj = new Estado("Rio de Janeiro", "RJ");

        System.out.println("UF: " + go.getUf() + " " + "Nome: " + go.getNome());
        System.out.println("UF: " + rj.getUf() + " " + "Nome: " + rj.getNome());

    }
}
