package aula11.as9b.exercicio04;

public class Logger {

    public static Logger inc = null;

    private boolean ativo = false;

    private Logger() {
        this.ativo = true;
    }

    public static Logger getInstance() {
        
        if (inc == null) {
            inc = new Logger();
        }
        return inc;
    }

    public void log(String s) {
        if (this.ativo) {
            System.out.println("LOG :: " + s);
        }

    }
}
