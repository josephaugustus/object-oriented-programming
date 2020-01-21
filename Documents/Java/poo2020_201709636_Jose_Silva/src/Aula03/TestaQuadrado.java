
package Aula03;

public class TestaQuadrado {
    
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado();
        Quadrado q3 = new Quadrado();
        
        q1.cor = "Verde";
        q2.cor = "Vermelho";
        
        System.out.println("Cor do quadrado q1: " + q1.cor);
        System.out.println("Cor do quadrado q2: " + q2.cor);
        System.out.println("Cor da classe quadrado q3: " + Quadrado.cor);
    }
        
        
}
