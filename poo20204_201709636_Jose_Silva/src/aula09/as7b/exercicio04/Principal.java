package aula09.as7b.exercicio04;

/**
 *
 * @author mac
 */
public class Principal {

    public static void main(String[] args) {
        Editora editora1 = new Editora("Editora Nova", "14444");
        Editora editora2 = new Editora("Editora Grande", "61526");
        Revista revista1 = new Revista("Nova Era", "Inove", 14.90, 7, editora1);
        Revista revista2 = new Revista("New Age", "Inove", 22.90, 2, editora2);

        Carrinho carrinho = new Carrinho(2);

        carrinho.adicionarProduto(revista1);
        carrinho.adicionarProduto(revista1);  
        carrinho.adicionarProduto(revista1);
        carrinho.adicionarProduto(revista2);
        carrinho.adicionarProduto(revista2);

        carrinho.removerProduto(revista1);


        carrinho.listarProdutos();

    }
}
