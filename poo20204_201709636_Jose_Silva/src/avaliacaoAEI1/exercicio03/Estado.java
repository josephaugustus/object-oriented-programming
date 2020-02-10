package br.com.gilmario.poo20204gilmar.avaliacaoAEI1.exercicio03;

public class Estado {

    private String nome;
    private String uf;

    public Estado(String nome, String uf){
        this.nome = nome;
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }
}
