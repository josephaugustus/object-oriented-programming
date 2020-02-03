package aula09.as7b.exercicio01.abstratoNovo;

public class Empregado extends Modelo {

    private String codigo;
    private String nome;
    private int idade;

    public Empregado(String tituloDoProjeto, String codigo, String nome, int idade) {
        super(tituloDoProjeto);
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimir() {
        System.out.println("\nCódigo do Empregado: " + this.codigo);
        System.out.println("\nNome do Empregado: " + this.nome);
        System.out.println("\nIdade do Empregado: " + this.idade);
    }

    public String toString() {
        return "o colaborador " + nome + ", código número " + codigo + ", de " + idade + " anos de idade.";
    }

}
