package aula04.as4b.exercicio02;

/**
 *
 * @author mac
 */
public class Endereco {

    private String rua;
    private int numero;
    private String quadra;
    private String lote;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String quadra, String lote, 
            String complemento, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.quadra = quadra;
        this.lote = lote;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
