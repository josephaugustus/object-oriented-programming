package aula09.salaAula;

public class ClasseConcreta extends ClasseAbstrata {

    public void metodoAbstrato() {
        System.out.println("Implementação do método Abstrato na Classe: " + this.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        ClasseConcreta cc = new ClasseConcreta();
        cc.metodoAbstrato();
        cc.metodoConcreto();
    }
}
