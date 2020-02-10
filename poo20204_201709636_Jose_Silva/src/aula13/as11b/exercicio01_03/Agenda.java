package aula13.as11b.exercicio01_03;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Pessoa> pessoas = new ArrayList<Pessoa>();

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void addPessoa(String nome, int idade, double altura) {
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        pessoas.add(pessoa);
    }

    public void exibirAgenda() {
        DecimalFormat decimal = new DecimalFormat("#,###.00");

        for (Pessoa pessoa : this.getPessoas()) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Altura: " + decimal.format(pessoa.getAltura()));
        }
    }

    public void gravarTxt() throws IOException {
        OutputStream outs = new FileOutputStream(System.getProperty("user.dir")
                + "\\src\\aula13\\as11b\\Agenda.txt");
        OutputStreamWriter outsw = new OutputStreamWriter(outs);
        BufferedWriter buffer = new BufferedWriter(outsw);
        DecimalFormat decimal = new DecimalFormat("#,###.00");

        for (Pessoa pessoa : this.getPessoas()) {
            buffer.write(pessoa.getNome() + " " + pessoa.getIdade()
                    + decimal.format(pessoa.getAltura() / 100));
        }

        buffer.close();
    }

    public void gravarBin() throws IOException {
        OutputStream outs = new FileOutputStream(System.getProperty("user.dir")
                + "\\src\\aula13\\as11b\\Agenda.bin");
        OutputStreamWriter outw = new OutputStreamWriter(outs);
        BufferedWriter buffer = new BufferedWriter(outw);
        DecimalFormat decimal = new DecimalFormat("#,###.00");

        for (Pessoa pessoa : this.getPessoas()) {
            buffer.write(pessoa.getNome() + " " + pessoa.getIdade()
                    + decimal.format(pessoa.getAltura() / 100));
        }

        buffer.close();
    }
}
