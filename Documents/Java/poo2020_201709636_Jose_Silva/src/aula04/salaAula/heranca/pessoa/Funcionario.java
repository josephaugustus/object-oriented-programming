package aula04.salaAula.heranca.pessoa;

public class Funcionario extends PessoaFisica {

    private int matricula;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String endereco, String telefone,
            String cpf, String estadoCivil, String sexo,
            int matricula, String cargo, double salario) {

        super(nome, endereco, telefone, cpf, estadoCivil, sexo);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
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

}
