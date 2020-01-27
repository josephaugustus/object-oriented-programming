package aula04.as4b.exercicio01.compositor;

/**
 *
 * @author mac
 */
public class TesteMusicas {

    public static void main(String[] args) {

        Compositor compositor = new Compositor("Michael Jackson", "Estadunidense");
        Musicas thriller = new Musicas("Thriller", 1982, "POP", compositor);

        System.out.println(thriller);
    }
}
