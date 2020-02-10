package aula13.as11b.exercicio02;
//
//import aula13.as11b.exercicio01_03.Pessoa;
//import aula13.as11b.exercicio01_03.Principal;
//import aula13.as11b.exercicio01_03.Agenda;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ler {

    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("Agenda.txt");
        InputStreamReader inputsr = new InputStreamReader(input);
        BufferedReader buffer = new BufferedReader(inputsr);

        String string = buffer.readLine();

        while (string != null) {
            System.out.println(string);
            string = buffer.readLine();
        }

        buffer.close();

    }
}
