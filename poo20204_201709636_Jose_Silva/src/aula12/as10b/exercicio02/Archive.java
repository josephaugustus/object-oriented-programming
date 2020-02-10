package aula12.as10b.exercicio02;

public class Archive extends File {

    private String nome;
    private double tamanho;

    public Archive(String nome, double tamanho) {
        super(nome);
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    public void exibir() {
        System.out.println(this.nome + " com tamanho de " + this.tamanho + " KB");

    }
}
