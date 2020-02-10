package br.com.gilmario.poo20204gilmar.avaliacaoAEI1.exercicio02.corrigido;

import br.com.gilmario.poo20204gilmar.avaliacaoAEI1.Data;

public class Revista {
    private String nome;
    private Data dataPublicacao;
    private String editora;

    Revista(String nome, String editora){
        this.nome = nome;
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setDataPublicacao(Data dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
