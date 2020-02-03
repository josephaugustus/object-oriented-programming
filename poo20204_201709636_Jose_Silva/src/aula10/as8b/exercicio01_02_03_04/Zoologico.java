package aula10.as8b.exercicio01_02_03_04;

public class Zoologico {

    public static void main(String[] args) {
        Animal[] jaula = new Animal[10];

        jaula[0] = new Preguica("Kiki", 5, "Latir", "Correr");
        jaula[1] = new Cachorro("Lulu", 2, "Galopar", "Correr");
        jaula[2] = new Preguica("Keke", 5, "Nada", "Subir nas árvores");
        jaula[3] = new Cavalo("Lili", 3, "Relinchar", "Galopar");
        jaula[4] = new Cachorro("Koto", 2, "Latir", "Correr");
        jaula[5] = new Preguica("Kuku", 5, "Nada", "Subir nas árvores");
        jaula[6] = new Cavalo("Lala", 3, "Relinchar", "Galopar");
        jaula[7] = new Cachorro("Kota", 2, "Latir", "Correr");
        jaula[8] = new Preguica("Koko", 5, "Nada", "Subir nas árvores");
        jaula[9] = new Cavalo("Pingo", 3, "Relinchar", "Galopar");

        for (int i = 0; i < 10; i++) {
//            jaula[i].emiteSom();
            if (jaula[i] instanceof Cachorro) {
                ((Cachorro) jaula[i]).comportamento();
            } else if (jaula[i] instanceof Cavalo) {
                ((Cavalo) jaula[i]).comportamento();
            }
        }
    }

}
