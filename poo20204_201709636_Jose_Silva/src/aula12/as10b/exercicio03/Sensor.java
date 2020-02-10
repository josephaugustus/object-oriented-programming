package aula12.as10b.exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Sensor extends Observable {

    private List<Observer> ob = new ArrayList<Observer>();

    private boolean sensor;
    int cont = 0;

    public void sensor(boolean move) {
        this.sensor = sensor;
        if (sensor == true && cont < 1) {
            this.notifyObservers();
        }
    }
}
