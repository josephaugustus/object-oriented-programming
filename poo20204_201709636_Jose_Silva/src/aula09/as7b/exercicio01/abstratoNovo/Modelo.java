package aula09.as7b.exercicio01.abstratoNovo;

public abstract class Modelo {

    private String tituloDoProjeto;

    public Modelo(String tituloProjeto) {
        this.tituloDoProjeto = tituloProjeto;
    }

    public String getTituloProjeto() {
        return tituloDoProjeto;
    }

    public void setTituloProjeto(String tituloProjeto) {
        this.tituloDoProjeto = tituloDoProjeto;
    }

    public abstract void imprimir();

    public String toString() {
        return "Título do Projeto: " + tituloDoProjeto;
    }
}
