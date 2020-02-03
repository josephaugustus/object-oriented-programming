package aula10.as8b.exercicio01_02_03_04;

public class TesteAnimal {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Pingo", 5, "Late", "Correndo");
        Cavalo cavalo = new Cavalo("Cometa", 15, "Relincha", "Trotando");
        Preguica preguica = new Preguica("Bob", 8, "???", "Subindo na árvore");

        System.out.println(cachorro);
        System.out.println(cavalo);
        System.out.println(preguica);
    }
}
