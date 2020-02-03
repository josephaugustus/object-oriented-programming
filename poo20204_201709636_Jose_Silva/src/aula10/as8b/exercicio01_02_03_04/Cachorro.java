
package aula10.as8b.exercicio01_02_03_04;


public class Cachorro extends Animal{

    public Cachorro(String nome, int idade, String som, String comportamento) {
        super(nome, idade, som, comportamento);
    }
    
    public String emiteSom() {
        return "latindo";
    }
    
     public String comportamento() {
        return "correndo";
    }
}
