package aula03.as3b.exercicio01;    

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa2 {

    private String nome;
    private Date dataNascimento;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString() {
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("\nNome: \nData de Nascimento: \nAltura: %.2fcm",
                nome, data.format(dataNascimento), altura);
    }

    public int exibirIdade() {
        Calendar today = Calendar.getInstance();
        Calendar aniversario = Calendar.getInstance();

        aniversario.setTime(this.dataNascimento);
        int idade = today.get(Calendar.YEAR) - aniversario.get(Calendar.YEAR);

        aniversario.add(Calendar.YEAR, idade);

        if (today.before(aniversario)) {
            idade--;
        }

        return idade;
    }

}
