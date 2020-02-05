package aula12.salaAula.observer;

public class BalancaDieta implements Observer {

    public void update(double novoPeso) {
        if (peso >= 100) {
            System.out.println("Você ultrapassou o peso limite no sistema!");
        }
    }

}
