package aula09.salaAula;

public abstract class ClasseAbstrata {

    public abstract void metodoAbstrato();

    public void metodoConcreto() {
        System.out.println("Implementação do Método Concreto. " + this.getClass().getSimpleName());
    }
}
