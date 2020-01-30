package aula04.as4b.exercicio01.clientes;

/**
 *
 * @author mac
 */
public class Clientes {

    private String nome;
    private String cpf;
    Endereco endereco;

    public Clientes(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nNome: " + this.nome);
        sb.append("\nCPF: " + this.cpf);
        sb.append(endereco);
        return sb.toString();
    }
}
