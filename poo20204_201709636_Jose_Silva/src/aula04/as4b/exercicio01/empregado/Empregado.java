package aula04.as4b.exercicio01.empregado;

public class Empregado {

    private String nome;
    private int matricula;
    private Empresa empresa;

    public Empregado(String nome, int matricula, Empresa empresa) {
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nNome: " + this.getNome());
        sb.append("\nMatrícula: " + this.getMatricula());
        sb.append(this.empresa);
        return sb.toString();
    }
}
