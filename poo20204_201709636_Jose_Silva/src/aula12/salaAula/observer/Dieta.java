
package aula12.salaAula.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


public class Dieta extends Observable {
    private List<Observer> observers = new ArrayList<Observer>();
    private double peso;
    
    public Dieta(double peso){
        this.peso = peso;
    }
    
    public void setPeso (double peso){
        this.peso = peso;
        this.notifyObservers();
    }
    
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    
    public void notifyObservers(){
        for(Observer ob : observers){
            System.out.println("Notificando observers");
            ob.update(null, this.peso);
        }
    }
}
