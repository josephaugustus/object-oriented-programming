
package aula09.as7b.exercicio02;

import java.util.Date;

public class Artista {
    private String nome;
	private String localNascimento;
	private int dia;
        private int mes;
        private int ano;

    public Artista(String nome, String localNascimento, int dia, int mes, int ano) {
        this.nome = nome;
        this.localNascimento = localNascimento;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
        
    public String toString() {
		return "\nNome do Artista: " + nome + "\nLocal de Nascimento: " + localNascimento +
                        "\nData de Nascimento: " + dia + mes + ano;
	}
	
}
