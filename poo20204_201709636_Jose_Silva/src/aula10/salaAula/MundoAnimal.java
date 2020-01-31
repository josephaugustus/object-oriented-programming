package aula10.salaAula;

public class MundoAnimal {

    public static void main(String[] args) {

        Animal reino[];
        reino = new Animal[3];

        reino[0] = new Anfibio("Salamandra");
        reino[1] = new Ave("Quero-quero");
        reino[2] = new Peixe("Dourado");

        int tamanhoVetor = reino.length;

        for (int i = 0; i < tamanhoVetor; i++) {
            if (reino[i] instanceof Peixe) {
                ((Peixe) reino[i]).nadar();
            } else {

                reino[i].mover(10, 10);
            }
        }

//        for (int i = 0; i < 3; i++) {
//            reino[i].mover(10, 10);
//        }
//            
//        foreach
//        for (Animal a : reino) {
//            a.mover(10, 10);
//        }
    }
}
