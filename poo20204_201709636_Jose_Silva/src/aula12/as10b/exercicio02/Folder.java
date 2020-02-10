package aula12.as10b.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {

    List<Folder> listarF = new ArrayList<Folder>();
    List<Archive> listarA = new ArrayList<Archive>();

    private int numero = 0;

    public Folder(String nome) {
        super(nome);
    }

    public void addArquivos(Archive a) {
        listarA.add(a);
        this.numero++;
    }

    public void addPastas(Folder f) {
        listarF.add(f);
        this.numero++;
    }

    public void removeArquivo(Archive a) {
        listarA.remove(a);
        this.numero--;
    }

    public void removePasta(Folder f) {
        listarF.remove(f);
        this.numero--;
    }

    public int getNumeroComponentes() {
        return numero;
    }

    public void exibirPastas() {
        if (listarF.isEmpty()) {
            System.out.println("");
            
        } else {
            int tamanho = listarF.size();
            for (int i = 0; i < tamanho; i++) {
                System.out.println("Diretório Principal: " + this.getNome());
                System.out.println("Pasta: " + listarF.get(i).getNome());
            }
        }
    }

    public void exibirArquivos() {
        if (listarA.isEmpty()) {
            System.out.println("");
            
        } else {   
            int tamanho = listarA.size();   
            for (int i = 0; i < tamanho; i++) {
                System.out.println("Subpasta: " + this.getNome());
                System.out.println("Arquivo: " + listarA.get(i).getNome()
                        + " com tamanho de " + listarA.get(i).getTamanho());
            }
        }
    }
}
