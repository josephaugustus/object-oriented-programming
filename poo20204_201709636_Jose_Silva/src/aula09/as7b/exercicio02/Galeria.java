package aula09.as7b.exercicio02;

import java.util.Date;

public class Galeria {

    private String titulo;
    private double preco;
    private int dia;
    private int mes;
    private int ano;
    private String situacao;
    private String tipo;
    private String material;
    private Artista artista;

    public Galeria(String titulo, double preco, int dia, int mes, int ano, String situacao, String tipo, String material, Artista artista) {
        this.titulo = titulo;
        this.preco = preco;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.situacao = situacao;
        this.tipo = tipo;
        this.material = material;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    
   

    public String toString() {
        return "\nGaleria de Arte:\nTítulo: " + titulo + "\nPreço: R$" + preco
                + "\nData da Criação: " + dia + mes + ano + "\nSituação: " + situacao
                + "\nTipo: " + tipo + "\nMaterial: " + material + " " + artista;
    }
}
