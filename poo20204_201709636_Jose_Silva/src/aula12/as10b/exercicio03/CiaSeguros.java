package aula12.as10b.exercicio03;

import java.util.Observable;
import java.util.Observer;

public class CiaSeguros implements Observer {

    public void update(boolean sensor) {

        if (sensor == true) {
            System.out.println("Movimento detectado, a Cia de Seguros foi alertada!");
        } else {
            System.out.println("Sistema de alarmes em monitoramento.");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
