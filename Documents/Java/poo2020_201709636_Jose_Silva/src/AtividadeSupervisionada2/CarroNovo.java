
package AtividadeSupervisionada2;
import java.util.Scanner;


public class CarroNovo {
    
    public static void main(String[] args) {
 
        Double custoDeFabrica;
        Double custoDoConsumidor;
        Double margemDistribuidor = 28.0;
        Double margemDeImpostos = 45.0;
        Double Distribuidor;
        Double ValorImpostos;
        
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Informe o custo do veículo:");
        custoDeFabrica = sc.nextDouble();
 
        Distribuidor = (custoDeFabrica * margemDistribuidor) / 100.000;
        ValorImpostos = (custoDeFabrica * margemDeImpostos) / 100;
 
        custoDoConsumidor = (ValorImpostos + Distribuidor);
 
        System.out.println("O custo ao consumidor é: " + custoDoConsumidor);
    }
}
