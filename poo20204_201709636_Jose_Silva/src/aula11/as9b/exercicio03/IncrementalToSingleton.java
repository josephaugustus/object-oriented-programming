package aula11.as9b.exercicio03;

public class IncrementalToSingleton {

    public static IncrementalToSingleton inc;

    private int count = 0;
    private int numero;

    private IncrementalToSingleton() {
        numero = ++count;
    }

    public static IncrementalToSingleton getInstancia() {
        if (inc == null) {
            inc = new IncrementalToSingleton();
        }
        return inc;

    }

    @Override
    public String toString() {
        return "Incremental To Singleton " + numero;
    }
}
