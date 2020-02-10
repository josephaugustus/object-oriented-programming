package br.com.gilmario.poo20204gilmar.avaliacaoAEI1.exercicio04.original;

public class Apartamento {
    private int qtdeQuartos;
    private int qtdeBanheiros;
    private String setor;

    Apartamento (int quartos, int banheiros, String setor) {
        qtdeQuartos = quartos;
        qtdeBanheiros = banheiros;
        this.setor = setor;
    }

    public String mostraApartamento () {
        return "Apartamento de " + qtdeQuartos + " quartos, " + 	qtdeBanheiros + " 					 	     banheiros, " + " no setor " + this.setor;
    }
}
