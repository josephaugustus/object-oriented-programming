package aula10.as8b.exercicio01_02_03_04;

public class Animal {

    protected String nome;
    protected int idade;
    protected String som;
    protected String comportamento;

    public Animal(String nome, int idade, String som, String comportamento) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
        this.comportamento = comportamento;
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

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getComportamento() {
        return comportamento;
    }

    public void setComportamento(String comportamento) {
        this.comportamento = comportamento;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nNome do Animal: " + this.getNome());
        sb.append("\nIdade do Animal: " + this.getIdade());
        sb.append("\nSom do Animal: " + this.getSom());
        sb.append("\nComportamento do Animal: " + this.getComportamento());
        return sb.toString();
    }
}
