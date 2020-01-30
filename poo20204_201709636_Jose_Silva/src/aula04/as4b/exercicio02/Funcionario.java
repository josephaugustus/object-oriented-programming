package aula04.as4b.exercicio02;

import java.text.DecimalFormat;

/**
 *
 * @author mac
 */
public class Funcionario {

    private String nome;
    private String cpf;
    private int matricula;
    private String cargo;
    private double salario;
    private String departamento;
    private Endereco endereco;

    public Funcionario(String nome, String cpf, int matricula, String cargo,
            double salario, String departamento, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    DecimalFormat df = new DecimalFormat("0.00");

    public void bonificacao(double num) {
        this.salario *= (1 + (num / 100));
    }

    public String toString() {
        return matricula + " - " + cpf + " - " + nome
                + " - Departamento: " + departamento + " - Cargo: " + cargo
                + " - Salário com Bonus: R$ " + salario;
    }
}
