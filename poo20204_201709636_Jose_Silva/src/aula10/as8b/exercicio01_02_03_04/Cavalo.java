/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.as8b.exercicio01_02_03_04;

/**
 *
 * @author mac
 */
public class Cavalo extends Animal {

    public Cavalo(String nome, int idade, String som, String comportamento) {
        super(nome, idade, som, comportamento);
    }

    public String emiteSom() {
        return "relinchando";
    }
    
     public String comportamento() {
        return "trotando";
    }
    
}
