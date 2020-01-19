
package AtividadeSupervisionada2;
import java.util.Scanner;

public class Credito {
    

    public static void main(String[] args) {
        int saldo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o seu saldo: ");
        saldo = sc.nextInt();
        
        switch ((saldo-1) / 200) {
                case 0:
                        System.out.println("De 0 e 200, nenhum crédito.");
                        break;
                case 1:
                        System.out.println("De 201 e 400, 20% do valor do saldo médio.");
                        break;
                case 2:
                        System.out.println("De 401 e 600, 30% do valor do saldo médio.");
                        break;
                default:
                        System.out.println("Acima de 601, 40% do valor do saldo médio.");
                        break;
        }
    }    
}
