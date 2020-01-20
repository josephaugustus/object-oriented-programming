
package aula01;
import java.util.Scanner;

//Criar um programa que entre com o nome e o número de telefone e valide os dados.
//Os nomes só podem ter caracteres alfabéticos e o telefone só numéricos. Use
//Character.isDigit().

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean num;
        
        do {
            
            num = true;
            System.out.println("Informe o nome: ");
            String nome = sc.next();

            for(int i = 0; i < nome.length(); i++) {
                if(Character.isDigit(nome.charAt(i)) == true) {
                    System.out.println("Nome não corresponde a um Character válido!");
                    num = false; 
                    break;
                }
            }
        } while(num == false);

        do {
            
            num = true;

            System.out.println("Infrome o telefone: ");
            String telefone = sc.next();

            for(int i = 0; i < telefone.length(); i++) {
                if(Character.isDigit(telefone.charAt(i)) == false) {
                    System.out.println("Número de telefone não corresponde a um Character válido!");
                    num = false; 
                    break;
                }
            }
        } while(num == false);

        System.out.println("Validação concluída!");
    }
}
