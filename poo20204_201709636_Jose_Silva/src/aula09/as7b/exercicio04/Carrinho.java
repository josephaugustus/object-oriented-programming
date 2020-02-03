package aula09.as7b.exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private int capacidade;
    private int quantidade;
    
    List<Produto> produtos = new ArrayList<Produto>();

    public Carrinho(int capacidade) {
        this.capacidade = capacidade;
        this.quantidade = 0;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarProduto(Produto produto) {
        if (quantidade < capacidade) {
            produtos.add(produto);
            quantidade++;
            System.out.println("Produto adicionado!");
        } else {
            System.out.println("Carrinho lotado!");
        }
    }

    public void removerProduto(Produto produto) {
        if (quantidade > 0) {
            produtos.remove(produto);
            quantidade--;
            System.out.println("Produto removido!");
        } else {
            System.out.println("Carrinho vazio!");
        }

    }

    public void listarProdutos() {
        if (quantidade > 0) {
            for (int i = 0; i < quantidade; i++) {
                System.out.println(produtos.get(i));
            }
        } else {
            System.out.println("Carrinho vazio!");
        }
    }

}
