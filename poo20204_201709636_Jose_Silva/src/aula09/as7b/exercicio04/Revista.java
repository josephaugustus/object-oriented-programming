package aula09.as7b.exercicio04;

/**
 *
 * @author mac
 */
public class Revista extends Produto {

    private int edicao;
    private Editora editora;

    public Revista(String tipo, String nome, double preco, int edicao, Editora editora) {
        super(tipo, nome, preco);
        this.edicao = edicao;
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

}
