package aula06.salaAula.endereco;

import java.util.ArrayList;
import java.util.List;

public class Logradouro {

    private String nome;
    private TipoLogradouro tipo;
    private List<Endereco> enderecos;

    public Logradouro(String nome, TipoLogradouro tipo, List<Endereco> enderecos) {
        this.nome = nome;
        this.tipo = tipo;
        this.enderecos = ArrayList < Endereco > ();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoLogradouro getTipo() {
        return tipo;
    }

    public void setTipo(TipoLogradouro tipo) {
        this.tipo = tipo;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

}
