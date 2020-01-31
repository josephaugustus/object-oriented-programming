package aula10.salaAula;

public class Ave extends Animal {

    public Ave(String nome) {
        super(nome);
    }

    public void mover(int x, int y) {
        setCoordenadas(x, y);

        System.out.println("Movimento da Ave " + this.getNome());
    }

}
