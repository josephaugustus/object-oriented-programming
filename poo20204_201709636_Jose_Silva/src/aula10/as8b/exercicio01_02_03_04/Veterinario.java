package aula10.as8b.exercicio01_02_03_04;

public class Veterinario extends Animal {

    public Veterinario(String nome, int idade, String som, String comportamento) {
        super(nome, idade, som, comportamento);
    }

    public void examinar() {
        System.out.println("O animal " + this.getNome()
                + " foi examinado e emitiu o som " + this.getSom());
    }
    
}
