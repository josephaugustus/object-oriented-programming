package aula09.as7b.exercicio04;

/**
 *
 * @author mac
 */
public class Livro extends Produto {

    private Editora editora;

    public Livro(String tipo, String nome, double preco) {
        super(tipo, nome, preco);
        this.editora = editora;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

}
