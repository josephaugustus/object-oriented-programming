package aula10.as8b.exercicio05;

/**
 *
 * @author mac
 */
public class Funcionario {

    private String nome;
    private int codigo;
    private double salario;
    private double adicional;

    public Funcionario(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.salario = 1000;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    protected void bonificacao(double porcentagem) {
        setSalario(getSalario() * porcentagem);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nNome do Colaborador: " + this.getNome());
        sb.append("\nAdicionais do Colaborador: " + this.getAdicional());
        sb.append("\nSalário do Colaborador: " + (this.getSalario()
                + this.getAdicional()));
        return sb.toString();
    }
}
