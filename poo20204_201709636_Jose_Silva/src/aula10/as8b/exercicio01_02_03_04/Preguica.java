package aula10.as8b.exercicio01_02_03_04;

/**
 *
 * @author mac
 */
public class Preguica extends Animal {

    public Preguica(String nome, int idade, String som, String comportamento) {
        super(nome, idade, som, comportamento);
    }

        public String emiteSom() {
        return "sem barulho";
    }
    
     public String comportamento() {
        return "a preguiça sube em arvores";
    }

}
