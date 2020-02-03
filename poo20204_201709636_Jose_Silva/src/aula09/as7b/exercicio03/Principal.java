package aula09.as7b.exercicio03;

import aula09.as7b.exercicio02.Galeria;
import aula09.as7b.exercicio02.Artista;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        List<Vendas> vendas = new ArrayList<Vendas>();

        Cliente cliente = new Cliente("Diego", "000.000.000-00", "3521-1415");
        Artista artista = new Artista("Laurentino Gomes", "Brasil", 15,11,1889);
        Galeria galeria1 = new Galeria("1822", 19.90, 15, 11,1889, "Vendido", "Livro", "Capa dura\n", artista);
        Galeria galeria2 = new Galeria("1802", 14.90, 15, 11, 1889, "Disponível", "Livro", "Capa Dura", artista);

        Vendas venda1 = new Vendas (5, 9, 2019, cliente);
        Vendas venda2 = new Vendas(5, 9, 2019, cliente);
        vendas.add(venda1);
        vendas.add(venda2);

        for (int i = 0; i < 2; i++) {
            System.out.println(vendas.get(i));
        }
    }
}
