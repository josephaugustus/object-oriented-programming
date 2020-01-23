
package atividadeSupervisionada1;
import java.util.Scanner;

//Um programa que receba 3 números (X,Y e Z) do usuário e mostre-os em ordem
//crescente.

public class Exercicio02 {
    
    public static void main(String[] args) {

        int numero1;
        int numero2;
        int numero3;
        int auxiliar;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero 1");
        numero1 = sc.nextInt();
        System.out.println("Digite o numero 2");
        numero2 = sc.nextInt();
        System.out.println("Digite o numero 3");
        numero3 = sc.nextInt();

        if (numero1 > numero2) {
            auxiliar = numero1;
            numero1 = numero2;
            numero2 = auxiliar;
        }

        if (numero2 > numero3) {
            auxiliar = numero2;
            numero2 = numero3;
            numero3 = auxiliar;
        }

        if (numero1 > numero2) {
            auxiliar = numero1;
            numero1 = numero2;
            numero2 = auxiliar;
        }

        System.out.println("Ordem crescente: " + numero1 + " " + numero2 + " " + numero3);

    }
}
