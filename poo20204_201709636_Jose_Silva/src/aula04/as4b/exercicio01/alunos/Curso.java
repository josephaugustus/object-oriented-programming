package aula04.as4b.exercicio01.alunos;

public class Curso {

    private String nome;
    private String sigla;
    private Departamento departamento;

    public Curso(String nome, String sigla, Departamento departamento) {
        this.nome = nome;
        this.sigla = sigla;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nNome do Curso: " + this.getNome());
        sb.append("\nSigla do Curso: " + this.getSigla());
        sb.append(this.getDepartamento());
        return sb.toString();
    }
}
