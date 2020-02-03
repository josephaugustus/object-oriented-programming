package aula09.as7b.exercicio02;

public class Principal {

    public static void main(String[] args) {

        Artista artista = new Artista("Laurentino Gomes", "Brasil", 15, 11, 1889);

        Galeria[] listaDeObras = new Galeria[2];

        listaDeObras[0] = new Galeria("1822", 19.90, 15, 11, 1889, "Disponível", "Livro", "Capa dura\n", artista);
        listaDeObras[1] = new Galeria("1802", 14.90, 15, 11, 1889, "Disponível", "Livro", "Capa Dura", artista);

        int tamanho = listaDeObras.length;

        for (int i = 0; i < tamanho; i++) {
            System.out.println(listaDeObras[i]);
        }

    }
}
