
package Aula03;
import java.util.Date;

public class Pessoa {
    
    private String nome;
    private Date dataNascimento;
    public final String especie = "mamifero";
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Date getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
