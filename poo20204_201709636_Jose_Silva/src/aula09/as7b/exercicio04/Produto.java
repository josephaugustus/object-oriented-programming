package aula09.as7b.exercicio04;

/**
 *
 * @author mac
 */
public class Produto {

    private String tipo;
    private String nome;
    private double preco;

    public Produto(String tipo, String nome, double preco) {
        this.tipo = tipo;
        this.nome = nome;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "\nTipo do Produto: " + tipo + "\nNome do Produto: "
                + nome + "\nPreço do Produto: R$" + preco;
    }
}
