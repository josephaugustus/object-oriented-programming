package br.com.gilmario.poo20204gilmar.avaliacaoAEI1.exercicio02.original;

import br.com.gilmario.poo20204gilmar.avaliacaoAEI1.Data;

public class Principal {
    public static void main(String[] args) {
        Revista revista = new Revista("Casa Claudia", "Abril");
        revista.dataPublicacao = new Data(10,01,2015);

        System.out.println ("Revista : " + revista.nome + " " + revista.editora);
    }
}
