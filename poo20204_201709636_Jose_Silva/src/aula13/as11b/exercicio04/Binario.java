package aula13.as11b.exercicio04;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Binario {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("Agenda.bin");
        DataInputStream arquivo = new DataInputStream(file);

        String nome = arquivo.readUTF();
        System.out.println(nome);

        arquivo.close();

    }
}
