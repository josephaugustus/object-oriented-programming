package aula12.as10b.exercicio02;

public class File {

    private String nome;

    public File(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Nome() {
        System.out.println("Arquivo encontrado " + this.nome);
    }
}
