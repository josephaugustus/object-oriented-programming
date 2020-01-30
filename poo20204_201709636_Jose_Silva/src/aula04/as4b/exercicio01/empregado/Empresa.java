package aula04.as4b.exercicio01.empregado;

/**
 *
 * @author mac
 */
public class Empresa {

    private String razaoSocial;
    private String cnpj;
    private Endereco endereco;

    public Empresa(String razaoSocial, String cnpj, Endereco endereco) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nRazão Social: " + this.getRazaoSocial());
        sb.append("\nCNPJ: " + this.getCnpj());
        sb.append(this.endereco);
        return sb.toString();
    }
}
